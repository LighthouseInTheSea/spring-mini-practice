package org.springframework.test.ioc.bean;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/3/24 13:31
 * @Description:
 */
public class Car {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}