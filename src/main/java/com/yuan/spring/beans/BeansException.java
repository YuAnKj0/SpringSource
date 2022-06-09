package com.yuan.spring.beans;

/**
 * @author Ykj
 * @date 18:04
 * @apiNote
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg){super(msg);}
    
    public BeansException(String msg,Throwable cause){super(msg,cause);}
}
