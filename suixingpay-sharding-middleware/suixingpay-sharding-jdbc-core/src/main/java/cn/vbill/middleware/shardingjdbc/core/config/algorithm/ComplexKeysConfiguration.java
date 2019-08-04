/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:57
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config.algorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.api.config.sharding.strategy.ComplexShardingStrategyConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.ShardingStrategyConfiguration;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.core.strategy.route.ShardingAlgorithmFactory;

import java.util.Properties;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:57
 * @version: V1.0
 * @review: zkevin/2018年06月26日 16:57
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ComplexKeysConfiguration implements AlgorithmConfiguration {
    private String columns;
    private String clazz;
    private Properties attr;
    
    @Override
    public ShardingStrategyConfiguration build() {
    	return new ComplexShardingStrategyConfiguration(columns,
                StringUtils.isNotBlank(clazz) ? ShardingAlgorithmFactory.newInstance(clazz, ComplexKeysShardingAlgorithm.class, new Class<?>[] {Properties.class}, getAttr()) : null);
    }

    public ComplexKeysConfiguration clone() {
        return new ComplexKeysConfiguration(columns, clazz, attr);
    }
}
