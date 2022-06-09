package com.yuan.spring.beans.factory;

import com.yuan.spring.beans.BeansException;
import com.yuan.spring.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author Ykj
 * @date 23:13
 * @apiNote
 */
public class PropertyPlaceholderConfigurer implements BeanFactoryPostProcessor {
    /**
     * 在所有BeanDefintion加载完成后，但在bean实例化之前，提供修改BeanDefinition属性值的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        
    }
}
