/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月19日 10:34
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.starter.config;

import cn.vbill.middleware.shardingjdbc.core.config.SharedSourceConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月19日 10:34
 * @version: V1.0
 * @review: zkevin/2018年07月19日 10:34
 */
@ConfigurationProperties(prefix = "sharding")
public class SharedSourceStarterConiguration extends SharedSourceConfiguration {
}
