package com.yuan.spring.beans.factory;

/**
 * @author Ykj
 * @date 22:17
 * @apiNote 初始化Bean
 */
public interface InitializingBean {
    void afterPropertiesSet() throws Exception;
}
