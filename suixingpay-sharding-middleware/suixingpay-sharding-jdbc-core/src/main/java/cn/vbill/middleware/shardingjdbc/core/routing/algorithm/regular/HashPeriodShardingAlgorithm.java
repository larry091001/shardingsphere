/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 23:36
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.ParseException;
import java.util.Properties;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 23:36
 * @version: V1.0
 * @review: zkevin/2018年07月09日 23:36
 */
@Setter @Getter
@NoArgsConstructor
public class HashPeriodShardingAlgorithm extends PeriodShardingAlgorithm {
    //因子
    private int factor = 3;

    public HashPeriodShardingAlgorithm(Properties attr) throws ParseException {
        super(attr);
        factor = Integer.valueOf(attr.getProperty("factor", "3"));
    }

    @Override
    protected String computeName(PreciseShardingValue shardingValue) {
        return super.computeName(shardingValue) + "_" + naming(shardingValue.getValue().hashCode());
    }

    protected String naming(int hashCode) {
        return "_" +  hashCode % factor;
    }
}
