/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 22:24
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.spring;

import cn.vbill.middleware.shardingjdbc.core.SharedJdbcContext;

import java.util.Collections;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 22:24
 * @version: V1.0
 * @review: zkevin/2018年07月24日 22:24
 */
public class SharedJdbcContextProxy extends SharedJdbcContext {

    public SharedJdbcContextProxy(SharedSourceConfigInitiation configuration) {
        super(Collections.unmodifiableMap(configuration.sharedDataSource));
    }
}
