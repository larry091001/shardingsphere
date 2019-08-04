/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 17:00
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config.algorithm;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 17:00
 * @version: V1.0
 * @review: zkevin/2018年06月26日 17:00
 */
@Getter @Setter
public class NoneConfiguration implements AlgorithmConfiguration {
    private boolean active = true;
    public NoneConfiguration clone() {
        return new NoneConfiguration();
    }
}
