/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 15:04
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config;

import javax.crypto.KeyGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 数据表规则模型
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 15:04
 * @version: V1.0
 * @review: zkevin/2018年06月26日 15:04
 */
@Getter
@Setter
@NoArgsConstructor
public class TableRuleConfiguration implements Cloneable {
    //主键生成字段
    private String keyGeneratorColumn;
    //主键生成器
    private KeyGenerator keyGenerator;
    //当表在数据库分布不一致时指定
    private String actualTables;
    //逻辑索引
    private String logicIndex;
    //数据库策略
    private StrategyConfiguration dbStrategy;
    //表策略
    private StrategyConfiguration tableStrategy;
    public TableRuleConfiguration(StrategyConfiguration dbStrategy, StrategyConfiguration tableStrategy) {
        this.dbStrategy = dbStrategy;
        this.tableStrategy = tableStrategy;
    }
    protected   TableRuleConfiguration clone() {
        TableRuleConfiguration newRule = new TableRuleConfiguration();
        newRule.setActualTables(actualTables);
        newRule.setLogicIndex(logicIndex);
        newRule.setKeyGenerator(keyGenerator);
        newRule.setKeyGeneratorColumn(keyGeneratorColumn);
        if (null != dbStrategy) newRule.setDbStrategy(dbStrategy.clone());
        if (null != tableStrategy) newRule.setTableStrategy(tableStrategy.clone());
        return newRule;
    }
}
