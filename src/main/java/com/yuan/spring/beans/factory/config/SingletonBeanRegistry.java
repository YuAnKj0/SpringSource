package com.yuan.spring.beans.factory.config;

/**
 * @author Ykj
 * @date 23:11
 * @apiNote 单例注册表
 */
public interface SingletonBeanRegistry {
    
    Object getSingleton(String beanName);
    
    void addSingleton(String beanName, Object singletonObject);
}
