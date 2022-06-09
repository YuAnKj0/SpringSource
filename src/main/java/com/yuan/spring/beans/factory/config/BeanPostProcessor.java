package com.yuan.spring.beans.factory.config;

import com.yuan.spring.beans.BeansException;

/**
 * @author Ykj
 * @date 23:00
 * @apiNote
 */
public interface BeanPostProcessor {
    
    /**
     * 在bean执行初始化方法之前执行此方法
     * @param bean
     * @param beanName
     * @throws BeansException
     */
    void postProcessBeforeInitialization(Object bean,String beanName) throws BeansException;
    
    /**
     * 在bean执行初始化方法之后执行此方法
     * @param bean
     * @param beanName
     * @throws BeansException
     */
    void postProcessAfterInitialization(Object bean,String beanName) throws BeansException;
}
