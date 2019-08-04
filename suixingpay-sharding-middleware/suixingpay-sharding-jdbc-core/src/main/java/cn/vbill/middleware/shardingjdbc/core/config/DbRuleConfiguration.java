/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 15:04
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.KeyGenerator;

/**
 * 数据库规则模型
 * 从整个数据库层面设置路由规则
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 15:04
 * @version: V1.0
 * @review: zkevin/2018年06月26日 15:04
 */
@Getter
@Setter
public class DbRuleConfiguration implements Cloneable {
    //默认数据库名
    private String defaultDbName;
    //主键生成器
    private String keyGenerator;
    //数据库策略
    private StrategyConfiguration dbStrategy;
    //表策略
    private StrategyConfiguration tableStrategy;
    //执行默认策略的表
    private List<String> tableNames = new ArrayList<>();
    private List<String> bindingTables = new ArrayList<>();
    //特殊表策略
    private Map<String, TableRuleConfiguration> tables = new LinkedHashMap<>();
    //获取广播
    private List<String> broadcastTables = new ArrayList<>();
    //键发生器类型
    private String keyGeneratorType;
    
    @Override
    protected DbRuleConfiguration clone() {
        DbRuleConfiguration newRule = new DbRuleConfiguration();
        newRule.setDefaultDbName(defaultDbName);
        newRule.setKeyGenerator(keyGenerator);
        newRule.setKeyGeneratorType(keyGeneratorType);
        if (null != dbStrategy) newRule.setDbStrategy(dbStrategy.clone());
        if (null != tableStrategy) newRule.setTableStrategy(tableStrategy.clone());
        tableNames.forEach(tn -> {
            newRule.tables.put(tn, new TableRuleConfiguration(newRule.dbStrategy, newRule.tableStrategy));
        });
        newRule.bindingTables.addAll(bindingTables);
        tables.forEach((k, v) -> {
            newRule.tables.put(k, v.clone());
        });
        return newRule;
    }

    protected DbRuleConfiguration merge(DbRuleConfiguration clonedRule) {
        if (StringUtils.isBlank(defaultDbName)) defaultDbName = clonedRule.defaultDbName;
        if (null == keyGenerator) keyGenerator = clonedRule.keyGenerator;
        if (null == keyGeneratorType) keyGeneratorType = clonedRule.keyGeneratorType;
        if (null == dbStrategy) dbStrategy = clonedRule.dbStrategy;
        if (null == tableStrategy) tableStrategy = clonedRule.tableStrategy;
        bindingTables.addAll(clonedRule.bindingTables);
        tableNames.forEach(tn -> {
            tables.put(tn, new TableRuleConfiguration(dbStrategy, tableStrategy));
        });
        clonedRule.tables.forEach((k, v) -> {
            if (!tables.containsKey(k)) tables.put(k, v);
        });

        return this;
    }
}
