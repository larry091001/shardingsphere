/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 15:45
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular;

import cn.vbill.middleware.shardingjdbc.core.routing.algorithm.BaseAlgorithm;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.core.strategy.route.value.RouteValue;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 15:45
 * @version: V1.0
 * @review: zkevin/2018年07月17日 15:45
 */
@NoArgsConstructor
public abstract class RegularAlgorithm extends BaseAlgorithm implements PreciseShardingAlgorithm {

    public RegularAlgorithm(Properties attr) {
        super(attr);
    }

    @Override
    public String doSharding(Collection availableTargetNames, PreciseShardingValue shardingValue) {
        List<String> targetNames = new ArrayList<>(availableTargetNames);
        if (targetNames.size()  == 1) {
            //在分表的情况下 如果shardingValue.logicalTable与availableTargetNames不相同，说明availableTargetNames是实际表名
            if (!shardingValue.getLogicTableName().equalsIgnoreCase(targetNames.get(0))) {
                return targetNames.get(0);
            } else {
                return spellSharding(targetNames.get(0), shardingValue);
            }
        }
        return selectSharding(targetNames, shardingValue);
    }


    protected abstract String selectSharding(List<String> targetNames, PreciseShardingValue shardingValue);

    protected abstract String spellSharding(String logicalName, PreciseShardingValue shardingValue);
}
