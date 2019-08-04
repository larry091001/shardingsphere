/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:58
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config.algorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.api.config.sharding.strategy.ShardingStrategyConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.StandardShardingStrategyConfiguration;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.core.strategy.route.ShardingAlgorithmFactory;

import java.util.Properties;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:58
 * @version: V1.0
 * @review: zkevin/2018年06月26日 16:58
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandardConfiguration implements AlgorithmConfiguration {
    private String column;
    private String preciseClazz;
    private String rangeClazz;
    private Properties attr;


    @Override
    public ShardingStrategyConfiguration build() {
    	 return new StandardShardingStrategyConfiguration(column,
                 StringUtils.isNotBlank(preciseClazz) ? ShardingAlgorithmFactory.newInstance(preciseClazz, PreciseShardingAlgorithm.class, new Class<?>[] {Properties.class}, getAttr()) : null,
                 StringUtils.isNotBlank(rangeClazz) ? ShardingAlgorithmFactory.newInstance(rangeClazz, RangeShardingAlgorithm.class, new Class<?>[] {Properties.class}, getAttr()) : null);
    }

    public StandardConfiguration clone() {
        return new StandardConfiguration(column, preciseClazz, rangeClazz, attr);
    }
}