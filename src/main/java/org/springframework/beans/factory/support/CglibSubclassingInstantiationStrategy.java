package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/3/24 11:19
 * @Description: 使用CGLIB动态生成子类
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        //TODO
        throw new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }
}