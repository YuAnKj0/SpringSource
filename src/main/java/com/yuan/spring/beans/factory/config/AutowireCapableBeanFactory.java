package com.yuan.spring.beans.factory.config;

import com.yuan.spring.beans.BeansException;
import com.yuan.spring.beans.factory.BeanFactory;

/**
 * @author Ykj
 * @date 22:24
 * @apiNote
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
    /**
     * 执行BeanPostProcessors的postProcessBeforeInitialization方法
     * 
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
   Object applyBeanPostProcessorsBeforeInitialization(Object existingBean,String beanName) throws BeansException;
    
    /**
     * 执行BeanPostProcessors的postProcessAfterInitialization方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
   Object applyBeanPostProcessorsAfterInitialization(Object existingBean,String beanName) throws BeansException;
}
