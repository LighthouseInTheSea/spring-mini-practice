package org.springframework.beans;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/3/24 11:31
 * @Description: bean属性信息
 */
public class PropertyValue {

    private final String name;

    private final Object value;


    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}