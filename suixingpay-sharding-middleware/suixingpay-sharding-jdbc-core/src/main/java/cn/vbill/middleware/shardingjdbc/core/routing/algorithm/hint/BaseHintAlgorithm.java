/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 17:29
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.hint;

import cn.vbill.middleware.shardingjdbc.core.routing.algorithm.BaseAlgorithm;
import lombok.NoArgsConstructor;

import java.util.*;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 17:29
 * @version: V1.0
 * @review: zkevin/2018年07月17日 17:29
 */
@NoArgsConstructor
public abstract class BaseHintAlgorithm extends BaseAlgorithm implements PreciseShardingAlgorithm {

    public BaseHintAlgorithm(Properties properties) {
        super(properties);
    }

    @Override
    public String doSharding(Collection availableTargetNames, PreciseShardingValue shardingValue) {
        return doSharding(shardingValue);
    }

    public abstract String doSharding(PreciseShardingValue shardingValue);
}
