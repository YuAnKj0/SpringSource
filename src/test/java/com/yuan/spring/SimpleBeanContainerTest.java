package com.yuan.spring;

import com.yuan.spring.beans.factory.BeanFactory;
import org.junit.Test;

/**
 * @author Ykj
 * @date 17:57
 * @apiNote
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean(){
        BeanFactory beanFactory=new BeanFactory();
        beanFactory.getBean("helloService",new HelloService());
    
    }

}
