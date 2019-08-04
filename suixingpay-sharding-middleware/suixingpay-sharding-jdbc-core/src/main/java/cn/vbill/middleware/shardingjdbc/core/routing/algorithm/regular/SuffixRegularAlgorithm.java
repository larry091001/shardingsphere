/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月23日 14:37
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular;

import lombok.NoArgsConstructor;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.List;
import java.util.Properties;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月23日 14:37
 * @version: V1.0
 * @review: zkevin/2018年07月23日 14:37
 */
@NoArgsConstructor
public abstract class SuffixRegularAlgorithm extends RegularAlgorithm {
    public SuffixRegularAlgorithm(Properties properties) {
        super(properties);
    }
    protected String selectSharding(List<String> targetNames, PreciseShardingValue shardingValue) {
        //根据shardingValue.getValue()进行hashcode，和因子计算出取模获取下标
    	String computedName = computeName(shardingValue).toLowerCase();
        for (String target : targetNames) {
            if (target.toLowerCase().endsWith(computedName)) return target;
        }
        throw new UnsupportedOperationException();
    }

    protected String spellSharding(String logicalName, PreciseShardingValue shardingValue) {
        return logicalName + computeName(shardingValue);
    }

    protected abstract String computeName(PreciseShardingValue shardingValue);


    protected long hashObject(Object object) {
        String objectValue = null != object ? String.valueOf(object) : "0";
        if (NumberUtils.isCreatable(String.valueOf(object))) {
            return NumberUtils.createNumber(String.valueOf(object)).longValue();
        }
        return Math.abs(objectValue.hashCode());
    }
}
