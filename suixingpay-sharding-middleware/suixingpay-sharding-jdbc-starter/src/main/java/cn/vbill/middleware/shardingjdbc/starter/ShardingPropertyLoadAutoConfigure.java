/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月21日 15:33
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.starter;

import cn.vbill.middleware.shardingjdbc.starter.config.SharedSourceStarterConiguration;
import cn.vbill.middleware.shardingjdbc.util.ResourceScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.util.List;

/**
 * shared db 配置
 */
@EnableConfigurationProperties({ SharedSourceStarterConiguration.class })
@AutoConfigureBefore({SharedSourceAutoConfigure.class})
@ConditionalOnProperty(havingValue = "true", name = "sharding.active", matchIfMissing = true)
@Configuration
public class ShardingPropertyLoadAutoConfigure {
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer(@Autowired ConfigurableEnvironment sourceEnv, @Autowired ResourceLoader resourceLoader) {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setEnvironment(sourceEnv);
        //扫描配置文件
        List<Resource> resources = ResourceScanner.scanResources(sourceEnv, resourceLoader, null);
        ResourceScanner.appendToSysEnv(sourceEnv, resources);
        configurer.setLocations(resources.toArray(new Resource[]{}));
        return configurer;
    }
}
