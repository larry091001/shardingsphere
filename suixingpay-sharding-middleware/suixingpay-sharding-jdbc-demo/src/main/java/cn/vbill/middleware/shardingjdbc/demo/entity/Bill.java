/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月20日 11:24
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月20日 11:24
 * @version: V1.0
 * @review: zkevin/2018年05月20日 11:24
 */
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Getter @Setter private Long id;
    @Getter @Setter private Long userId;
    @Getter @Setter private Long amount;
}
