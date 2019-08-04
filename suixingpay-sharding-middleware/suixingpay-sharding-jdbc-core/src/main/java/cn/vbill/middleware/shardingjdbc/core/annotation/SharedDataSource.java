/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月21日 15:25
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package cn.vbill.middleware.shardingjdbc.core.annotation;

import java.lang.annotation.*;

/**
 * @see "cn.vbill.middleware.shardingjdbc.core.datasource.DataSourceInjectProcessor"
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SharedDataSource {
    /**
     * 逻辑数据源名称
     * @return
     */
    String value();
}
