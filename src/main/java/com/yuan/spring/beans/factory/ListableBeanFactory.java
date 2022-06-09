package com.yuan.spring.beans.factory;

import com.yuan.spring.beans.BeansException;

import java.util.Map;

/**
 * @author Ykj
 * @date 18:24
 * @apiNote
 */
public interface ListableBeanFactory extends BeanFactory{
 
    <T> Map<String,T> getBeansOfType(Class<T> type)throws BeansException;
    
    String[] getBeanDefinitionNames();
}
