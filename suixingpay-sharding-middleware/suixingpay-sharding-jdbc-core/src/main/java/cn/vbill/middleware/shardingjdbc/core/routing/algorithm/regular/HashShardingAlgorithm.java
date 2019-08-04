/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 14:27
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Properties;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * 周期性算法
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 14:27
 * @version: V1.0
 * @review: zkevin/2018年07月09日 14:27
 */
@Setter @Getter
@NoArgsConstructor
public class HashShardingAlgorithm extends SuffixRegularAlgorithm {
    //因子
    private int factor = 3;

    public HashShardingAlgorithm(Properties attr) {
        super(attr);
        factor = Integer.valueOf(attr.getProperty("factor", "3"));
    }

    /**
     * int short long integer的hashcode是其数字本身
     * @param shardingValue
     * @return
     */
    @Override
    protected String computeName(PreciseShardingValue shardingValue) {
        return naming(hashObject(shardingValue.getValue()) % factor);
    }

    protected String naming(long index) {
        return "_" + index;
    }
}
