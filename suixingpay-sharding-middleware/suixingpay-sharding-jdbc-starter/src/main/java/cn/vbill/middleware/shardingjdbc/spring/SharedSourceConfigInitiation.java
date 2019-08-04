/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 16:56
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.spring;


import cn.vbill.middleware.shardingjdbc.core.config.SharedSourceConfiguration;
import cn.vbill.middleware.shardingjdbc.core.datasource.SharedDataSourceBuilder;
import cn.vbill.middleware.shardingjdbc.util.ResourceScanner;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.bind.PropertiesConfigurationFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.validation.BindException;

import javax.sql.DataSource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 16:56
 * @version: V1.0
 * @review: zkevin/2018年07月24日 16:56
 */

public class SharedSourceConfigInitiation implements EnvironmentAware, ResourceLoaderAware {
    @Getter @Setter
    private String location;
    private ConfigurableEnvironment sourceEnv;
    private ResourceLoader resourceLoader;
    protected final Map<String, DataSource> sharedDataSource = new LinkedHashMap<>();

    public void initMethod() throws BindException {
        //扫描配置文件
        List<Resource> resources = ResourceScanner.scanResources(sourceEnv, resourceLoader, location);
        //将配置参数写入Environment
        ResourceScanner.appendToSysEnv(sourceEnv, resources);
        //构造SharedSourceConfiguration
        SharedSourceConfiguration config = new SharedSourceConfiguration();
        //通过PropertiesConfigurationFactory绑定配置文件
        PropertiesConfigurationFactory<SharedSourceConfiguration> factory = new PropertiesConfigurationFactory<>(config);
        factory.setPropertySources(sourceEnv.getPropertySources());
        factory.setTargetName("sharding");
        factory.bindPropertiesToTarget();
        //创建sharding数据源
        sharedDataSource.putAll(SharedDataSourceBuilder.newBuilder(config).build());
    }

    @Override
    public void setEnvironment(Environment environment) {
        sourceEnv = (ConfigurableEnvironment) environment;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
