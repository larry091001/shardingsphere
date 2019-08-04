/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月21日 15:33
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.starter;

import cn.vbill.middleware.shardingjdbc.core.SharedJdbcContext;
import cn.vbill.middleware.shardingjdbc.spring.DataSourceBeanPostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ShardingDataSource切面
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月21日 15:33
 * @version: V1.0
 * @review: zkevin/2018年05月21日 15:33
 */
@AutoConfigureAfter({SharedSourceAutoConfigure.class})
@ConditionalOnBean({SharedJdbcContext.class})
@ConditionalOnProperty(havingValue = "true", name = "sharding.active", matchIfMissing = true)
@Configuration
public class DataSourceInjectAutoConfigure {
    @Bean
    public  static BeanPostProcessor dataSourceProcessor(@Autowired SharedJdbcContext context) {
        return new DataSourceBeanPostProcessor(context);
    }
}
