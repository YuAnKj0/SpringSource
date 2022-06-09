package com.yuan.spring.beans.factory;

/**
 * @author Ykj
 * @date 22:13
 * @apiNote
 */
public interface FactoryBean<T>{
    T getObject() throws Exception;
    
    boolean isSingleton();
}
