package org.springframework.beans;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/3/23 16:43
 * @Description:
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}