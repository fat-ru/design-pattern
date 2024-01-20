package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:41
 * @Created by zhuzru
 */
public class ElectricCar extends Car {
    @Override
    public void move() {
        super.move();
        System.out.println("electric car move");
    }
}
