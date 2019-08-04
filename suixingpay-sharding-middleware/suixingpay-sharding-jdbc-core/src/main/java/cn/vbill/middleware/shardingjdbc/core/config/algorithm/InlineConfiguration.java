/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:57
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config.algorithm;

import org.apache.shardingsphere.api.config.sharding.strategy.InlineShardingStrategyConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.ShardingStrategyConfiguration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:57
 * @version: V1.0
 * @review: zkevin/2018年06月26日 16:57
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InlineConfiguration implements AlgorithmConfiguration {
    private  String column;
    private  String expression;

    public ShardingStrategyConfiguration build() {
        return new InlineShardingStrategyConfiguration(column, expression);
    }

    public InlineConfiguration clone() {
        return new InlineConfiguration(column, expression);
    }
}
