package org.springframework.test.ioc.bean;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/3/24 13:14
 * @Description:
 */
public class Person {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}