/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 22:28
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.spring;

import cn.vbill.middleware.shardingjdbc.core.SharedJdbcContext;
import cn.vbill.middleware.shardingjdbc.core.annotation.SharedDataSource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 22:28
 * @version: V1.0
 * @review: zkevin/2018年07月24日 22:28
 */
@NoArgsConstructor
@AllArgsConstructor
public class DataSourceBeanPostProcessor implements BeanPostProcessor {
    @Getter @Setter private SharedJdbcContext context;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        ReflectionUtils.doWithFields(bean.getClass(), field -> {
            if (!field.isAnnotationPresent(SharedDataSource.class)) return;
            SharedDataSource sourceAnnotation = field.getDeclaredAnnotation(SharedDataSource.class);
            ReflectionUtils.makeAccessible(field);
            field.set(bean, context.getDataSource(sourceAnnotation.value()));
        });
        return bean;
    }
}
