/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月20日 12:40
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config;

import lombok.Getter;
import lombok.Setter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * 多数据源分库分表配置
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月20日 12:40
 * @version: V1.0
 * @review: zkevin/2018年05月20日 12:40
 */
public class SharedSourceConfiguration {
    //配置文件名
    public static final String CONFIG_FILE_KEY = "sharding.file";

    //动态环境配置文件
    public static final String CONFIG_ENVIRONMENT = "{environment}";
    private static final String DEFAULT_CONFIG_FILE_PREFIX = "sharding-vbill";
    public static final String DEFAULT_CONFIG_ENV_PROPERTIES = DEFAULT_CONFIG_FILE_PREFIX + "-" + CONFIG_ENVIRONMENT + ".properties";
    public static final String DEFAULT_CONFIG_ENV_YML = DEFAULT_CONFIG_FILE_PREFIX + "-" + CONFIG_ENVIRONMENT + ".yml";
    public static final String DEFAULT_CONFIG_PROPERTIES = DEFAULT_CONFIG_FILE_PREFIX + ".properties";
    public static final String DEFAULT_CONFIG_YML = DEFAULT_CONFIG_FILE_PREFIX  + ".yml";
    //配置文件目录
    public static final String[] DEFAULT_CONFIG_DIR = {"file:./", "classpath:/", "file:./config/", "classpath:/config/"};

    //数据库连接池类型
    public static final String DS_POOL_CLASS_KEY = "type";
    public static final String DEFAULT_DS_POOL_CLASS = "com.alibaba.druid.pool.DruidDataSource";


    /**
     * 分片数据源配置
     * sharding.逻辑数据库名.物理数据库名.通用数据库连接信息
     * sharding.逻辑数据库名.物理数据库名.type 数据库连接池类型
     *
     */
    @Getter @Setter private Map<String, Map<String, Map<String, Object>>> datasource = new LinkedHashMap<>();

    /**
     * 全局参数
     */
    @Getter @Setter private Properties prop = new Properties() {
        {
            put("sql.show", "false");
        }
    };

    /**
     * 全局数据库路由规则
     */
    @Getter @Setter private DbRuleConfiguration rule;



    /**
     * 优先级高于全局参数prop
     * 分库分表参数
     * 分片sql打印      =>    sharding.逻辑数据库.sql.show 默认为false不开启
     * 最大工作线程数量  =>    sharding.逻辑数据库.executor.size
     */
    @Getter @Setter private Map<String, Properties> props = new LinkedHashMap<>();




    /**
     * 数据库路由规则
     * 数据表实际节点 逻辑数据库名：逻辑表名->物理数据库名.物理表名
     */
    @Getter @Setter private Map<String, DbRuleConfiguration> rules = new LinkedHashMap<>();




    /**
     * 逻辑数据库全局集合对象
     * 逻辑数据库名   =>  Map
     */
    @Getter @Setter private Map<String, Map<String, Object>> configMap = new ConcurrentHashMap<>();



    /**
     * 初始化特殊参数
     * @param logicalDb
     * @return
     */
    public Properties generateProps(String logicalDb) {
        //全局默认配置
        Properties newProps = new Properties(prop);
        //覆盖重复项
        props.computeIfPresent(logicalDb, (k, v) -> {
            newProps.putAll(v);
            return v;
        });
        return newProps;
    }


    public DbRuleConfiguration generateRule(String logicalDb) {
        if (null != rule) rules.computeIfPresent(logicalDb, (k, v) -> v.merge(rule.clone()));
        return rules.computeIfAbsent(logicalDb, key -> null != rule ? rule.clone() : null);
    }

    public static void main(String[] args) {
        System.out.println("Actual SQL: sharding_1 ::: select id, name, token from t_user_1  \n WHERE 1 = 1".replaceAll("\n", " "));
    }
}
