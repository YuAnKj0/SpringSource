package com.yuan.spring.beans.factory.config;

import com.yuan.spring.beans.BeansException;
import com.yuan.spring.beans.factory.ConfigurableListableBeanFactory;


/**
 * @author Ykj
 * @date 22:56
 * @apiNote
 */
public interface BeanFactoryPostProcessor {
    
    /**
     * 在所有BeanDefintion加载完成后，但在bean实例化之前，提供修改BeanDefinition属性值的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
