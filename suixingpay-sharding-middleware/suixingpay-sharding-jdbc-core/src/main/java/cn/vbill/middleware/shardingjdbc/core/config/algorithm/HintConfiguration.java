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
import org.apache.shardingsphere.api.config.sharding.strategy.HintShardingStrategyConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.ShardingStrategyConfiguration;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.core.strategy.route.ShardingAlgorithmFactory;

import java.util.Properties;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:58
 * @version: V1.0
 * @review: zkevin/2018年06月26日 16:58
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HintConfiguration implements AlgorithmConfiguration {
    private String clazz;
    private Properties attr;
    
    @Override
    public ShardingStrategyConfiguration build() {
    	 return new HintShardingStrategyConfiguration(
                 StringUtils.isNotBlank(clazz) ? ShardingAlgorithmFactory.newInstance(clazz, HintShardingAlgorithm.class, new Class<?>[] {Properties.class}, getAttr()) : null);
    }

    public HintConfiguration clone() {
        return new HintConfiguration(clazz, attr);
    }
}
