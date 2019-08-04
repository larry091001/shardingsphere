/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 17:26
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config.algorithm;

import java.util.Properties;

import org.apache.shardingsphere.api.config.sharding.strategy.NoneShardingStrategyConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.ShardingStrategyConfiguration;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 17:26
 * @version: V1.0
 * @review: zkevin/2018年06月26日 17:26
 */
public interface AlgorithmConfiguration extends Cloneable {

    default ShardingStrategyConfiguration build() {
        return new NoneShardingStrategyConfiguration();
    }
    default Properties getAttr() {
        return new Properties();
    }
}
