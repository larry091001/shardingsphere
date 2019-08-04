/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 17:50
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.demo.sharding;

import cn.vbill.middleware.shardingjdbc.core.routing.algorithm.hint.BaseHintAlgorithm;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Properties;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 17:50
 * @version: V1.0
 * @review: zkevin/2018年07月17日 17:50
 */
@NoArgsConstructor
public class MerchantHintAlgorithm extends BaseHintAlgorithm {
	
    public MerchantHintAlgorithm(Properties properties) {
        super(properties);
    }

    @Override
    public String doSharding(PreciseShardingValue shardingValue) {
        return getAttr().getProperty("mapping." + shardingValue.getValue());
    }

}
