/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月11日 15:51
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.demo;

import cn.vbill.middleware.shardingjdbc.starter.DataSourceInjectAutoConfigure;
import cn.vbill.middleware.shardingjdbc.starter.ShardingPropertyLoadAutoConfigure;
import cn.vbill.middleware.shardingjdbc.starter.SharedSourceAutoConfigure;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月11日 15:51
 * @version: V1.0
 * @review: zkevin/2018年05月11日 15:51
 *sharding-xml.xml为xml版本的配置
 */
@EnableScheduling
@EnableTransactionManagement
@ServletComponentScan
@ImportResource({"classpath*:sharding-xml.xml"})
@SpringBootApplication(
        scanBasePackages = { "cn.vbill.middleware.shardingjdbc.demo" },
        exclude =  {
                //DataSourceAutoConfiguration.class,
                //TransactionAutoConfiguration.class,
                //MybatisAutoConfiguration.class,
                //DruidDataSourceAutoConfigure.class
        }
        )

public class ShardingDemoApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ShardingDemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = app.run(args);
    }
}