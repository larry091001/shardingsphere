/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月21日 15:04
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.starter;

import cn.vbill.middleware.shardingjdbc.core.SharedJdbcContext;
import cn.vbill.middleware.shardingjdbc.core.datasource.SharedDataSourceBuilder;
import cn.vbill.middleware.shardingjdbc.starter.config.SharedSourceStarterConiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.*;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月21日 15:04
 * @version: V1.0
 * @review: zkevin/2018年05月21日 15:04
 */

@AutoConfigureBefore({ DataSourceAutoConfiguration.class })
@ConditionalOnProperty(havingValue = "true", name = "sharding.active", matchIfMissing = true)
@Configuration
public class SharedSourceAutoConfigure {
    /**
     * 默认数据源
     * @return
     */
    @Bean
    @ConditionalOnProperty(havingValue = "true", name = "sharding.unique", matchIfMissing = true)
    public static DataSource dataSource(@Autowired SharedJdbcContext context) {
        return context.getDataSource();
    }

    @Bean
    public static SharedJdbcContext sharedJdbcContext(@Autowired SharedSourceStarterConiguration config) {
        return new SharedJdbcContext(Collections.unmodifiableMap(SharedDataSourceBuilder.newBuilder(config).build()));
    }
}
