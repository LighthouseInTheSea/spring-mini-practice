package org.springframework.beans.factory.config;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/3/24 13:26
 * @Description: 一个bean对另一个bean的引用
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}