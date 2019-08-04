/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 17:28
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.util;

import cn.vbill.middleware.shardingjdbc.starter.config.SharedSourceStarterConiguration;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 17:28
 * @version: V1.0
 * @review: zkevin/2018年07月24日 17:28
 */
public class ResourceScanner {
    public static List<Resource> scanResources(Environment sourceEnv, ResourceLoader resourceLoader, String shardingFileName) {
        List<Resource> needLoadableFiles = new ArrayList<>();
        List<String> loadableFiles = new ArrayList<>();
        shardingFileName = null == shardingFileName || shardingFileName.trim().isEmpty()
                ? sourceEnv.getProperty(SharedSourceStarterConiguration.CONFIG_FILE_KEY, "") : shardingFileName;
        if (null != shardingFileName && !shardingFileName.trim().isEmpty()) {
            loadableFiles.add(shardingFileName);
        } else {
            Arrays.stream(sourceEnv.getActiveProfiles()).forEach(active -> {
                if (loadableFiles.isEmpty()) {
                    loadableFiles.add(SharedSourceStarterConiguration.DEFAULT_CONFIG_ENV_YML.replace(SharedSourceStarterConiguration.CONFIG_ENVIRONMENT, active));
                    loadableFiles.add(SharedSourceStarterConiguration.DEFAULT_CONFIG_ENV_PROPERTIES.replace(SharedSourceStarterConiguration.CONFIG_ENVIRONMENT, active));
                }
            });
            loadableFiles.add(SharedSourceStarterConiguration.DEFAULT_CONFIG_YML);
            loadableFiles.add(SharedSourceStarterConiguration.DEFAULT_CONFIG_PROPERTIES);
        }
        Arrays.stream(SharedSourceStarterConiguration.DEFAULT_CONFIG_DIR).forEach(d -> {
            for (String f : loadableFiles) {
                Resource resource = resourceLoader.getResource(d + f);
                if (resource.exists()) {
                    needLoadableFiles.add(resource);
                    //最先发现的配置
                    break;
                }
            }
        });
        return needLoadableFiles;
    }

    public static void appendToSysEnv(ConfigurableEnvironment sourceEnv, List<Resource> resources) {
        YamlPropertySourceLoader ymlLoader = new YamlPropertySourceLoader();
        //将配置参数添加到当前环境
        resources.forEach(c -> {
            try {
                if (c.getFilename().endsWith(".yml") || c.getFilename().endsWith(".yaml")) {
                    sourceEnv.getPropertySources().addLast(ymlLoader.load(c.getFilename(), c, null));
                } else {
                    sourceEnv.getPropertySources().addLast(new ResourcePropertySource(c.getFilename(), c));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
