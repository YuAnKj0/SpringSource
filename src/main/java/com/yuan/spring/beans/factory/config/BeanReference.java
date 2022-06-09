package com.yuan.spring.beans.factory.config;

/**
 * @author Ykj
 * @date 23:02
 * @apiNote 一个bean对另一个bean的引用
 */ 
public class BeanReference {
    
    private final String beanName;
    
    public BeanReference(String beanName) {this.beanName=beanName;}
    
    public String getBeanName() {
        return beanName;
    }
}
