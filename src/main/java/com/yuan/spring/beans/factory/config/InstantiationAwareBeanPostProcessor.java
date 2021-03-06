package com.yuan.spring.beans.factory.config;

import com.yuan.spring.beans.BeansException;
import com.yuan.spring.beans.PropertyValue;
import com.yuan.spring.beans.PropertyValues;
import javafx.beans.binding.ObjectExpression;

/**
 * @author Ykj
 * @date 23:05
 * @apiNote
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{
    /**
     * 在bean实例化之前执行
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass,String beanName) throws BeansException;
    
    /**
     * bean实例化之后，设置属性之前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    boolean postProcessAfterInstantiation(Object bean,String beanName) throws BeansException;
    
    /**
     * bean实例化之后，设置属性之前执行
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    PropertyValues postProcessPropertyValues(PropertyValues pvs,Object bean,String beanName)throws BeansException;
    
    /**
     * 提前暴露bean
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    default Object getEarlyBeanReference(Object bean,String beanName)throws BeansException{
        return bean;
    }
}
