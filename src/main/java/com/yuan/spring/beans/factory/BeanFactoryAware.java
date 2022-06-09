package com.yuan.spring.beans.factory;

import com.yuan.spring.beans.BeansException;

/**
 * @author Ykj
 * @date 18:22
 * @apiNote 实现该接口，能感知所属BeanFactory
 */
public interface BeanFactoryAware extends Aware{
   void setBeanFactory(BeanFactory beanFactory)throws BeansException;
}
