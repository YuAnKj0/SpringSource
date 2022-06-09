package com.yuan.spring.beans.factory;

/**
 * @author Ykj
 * @date 22:08
 * @apiNote 销毁Bean
 */
public interface DisposableBean {

    void destory() throws Exception;
}
