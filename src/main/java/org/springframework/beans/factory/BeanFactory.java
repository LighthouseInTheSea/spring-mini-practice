package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * bean容器
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param name
     * @return
     * @throws BeansException  bean不存在时
     */
    Object getBean(String name) throws BeansException;
}