package com.yuan.spring.beans.factory;

import com.yuan.spring.beans.BeansException;

/**
 * @author Ykj
 * @date 22:19
 * @apiNote 有代理对象的循环依赖
 */
public interface ObjectFactory<T> {
   
   T getObject() throws BeansException;
}
