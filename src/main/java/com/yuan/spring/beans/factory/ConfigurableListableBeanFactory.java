package com.yuan.spring.beans.factory;

import com.yuan.spring.beans.factory.config.AutowireCapableBeanFactory;
import com.yuan.spring.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author Ykj
 * @date 22:21
 * @apiNote
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    
}
