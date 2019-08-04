/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月20日 12:40
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.datasource;


import cn.vbill.middleware.shardingjdbc.core.config.DbRuleConfiguration;
import cn.vbill.middleware.shardingjdbc.core.config.SharedSourceConfiguration;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.api.config.sharding.KeyGeneratorConfiguration;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.core.exception.ShardingException;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.apache.shardingsphere.shardingjdbc.util.DataSourceUtil;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *  多数据源分库分表配置
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月20日 12:40
 * @version: V1.0
 * @review: zkevin/2018年05月20日 12:40
 */
public final class SharedDataSourceBuilder {

    private final SharedSourceConfiguration config;

    private SharedDataSourceBuilder(SharedSourceConfiguration configuration) {
        this.config = configuration;
    }

    public static SharedDataSourceBuilder newBuilder(SharedSourceConfiguration configuration) {
        return new SharedDataSourceBuilder(configuration);
    }

    public Map<String, DataSource> build() {
        Map<String, DataSource> sharedDataSource = new LinkedHashMap<>();
        //逻辑数据库名->物理数据库信息
        config.getDatasource().forEach((dbName, sources) -> {
            if (null == sources || sources.size() < 1) throw new ShardingException("初始化参数vbill.sharding.datasource配置不正确");
            Map<String, DataSource> sourceMap = new HashMap<>();
            //物理数据库名->连接参数
            sources.forEach((physicalDbName, params) -> {
                try {
                    DataSource dataSource = DataSourceUtil.getDataSource((String) params.getOrDefault(SharedSourceConfiguration.DS_POOL_CLASS_KEY,
                            SharedSourceConfiguration.DEFAULT_DS_POOL_CLASS), params);
                    sourceMap.put(physicalDbName, dataSource);
                } catch (ReflectiveOperationException e) {
                    throw new ShardingException(e);
                }
            });

            try {
                sharedDataSource.put(dbName,
                        //创建sharding jdbc代理 Datasource
                        ShardingDataSourceFactory.createDataSource(sourceMap,
                                getShardingRuleConfiguration(dbName),
                                //TODO
                                /*config.getConfigMap().computeIfAbsent(dbName, key -> new ConcurrentHashMap<>()),*/
                                config.generateProps(dbName)));
            } catch (SQLException e) {
                throw new ShardingException(e);
            }
        });
        return sharedDataSource;
    }

    /**
     *	 初始化逻辑数据的分片规则
     * @param dbName
     * @return
     * @throws SQLException
     */
    private ShardingRuleConfiguration getShardingRuleConfiguration(String dbName) throws SQLException {
        ShardingRuleConfiguration result = new ShardingRuleConfiguration();
        DbRuleConfiguration dbConfig = config.generateRule(dbName);
        if (null != dbConfig) {
            //设置默认的数据库
            result.setDefaultDataSourceName(dbConfig.getDefaultDbName());
            //TODO larry
            if(StringUtils.isNotBlank(dbConfig.getKeyGeneratorType()) && StringUtils.isNotBlank(dbConfig.getKeyGenerator())) {
            	result.setDefaultKeyGeneratorConfig(new KeyGeneratorConfiguration(dbConfig.getKeyGeneratorType(), dbConfig.getKeyGenerator()));
            }
            if (null != dbConfig.getTableStrategy())
                result.setDefaultTableShardingStrategyConfig(dbConfig.getTableStrategy().build());
            if (null != dbConfig.getDbStrategy())
                result.setDefaultDatabaseShardingStrategyConfig(dbConfig.getDbStrategy().build());
            //表绑定
            dbConfig.getBindingTables().forEach(b -> result.getBindingTableGroups().add(b.replaceAll("&", ",")));
            //广播
            result.setBroadcastTables(dbConfig.getBroadcastTables());
            
            /**
             * 	每张表的配置规则
             */
            dbConfig.getTables().forEach((k, v) -> {
                // 表规则
                TableRuleConfiguration tableRule = 
                		new TableRuleConfiguration(k.replaceAll("@", "."),v.getActualTables());
                //TODO larry
                tableRule.setLogicIndex(v.getLogicIndex());
                //tableRule.setKeyGeneratorConfig(new KeyGeneratorConfiguration(v.getKeyGeneratorType(), v.getKeyGenerator()));
                
                if (null != v.getTableStrategy())
                    tableRule.setTableShardingStrategyConfig(v.getTableStrategy().build());
                if (null != v.getDbStrategy()) tableRule.setDatabaseShardingStrategyConfig(v.getDbStrategy().build());
                result.getTableRuleConfigs().add(tableRule);
            });
        }
        return result;
    }

}