package com.yuan.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ykj
 * @date 17:50
 * @apiNote
 */
public interface BeanFactory {

    //定义一个简单的容器BeanFactory，内部包含一个map用以保存bean，只有注册bean获取bean两个方法
    private Map<String,Object> beanMap=new HashMap<>();
    
    //注册Bean
    public void registerBean(String name,Object bean){
        beanMap.put(name,bean);
    }
    
    //获取Bean
    public Object getBean(String name){
        return beanMap.get(name);
    
    }
    
    
}
