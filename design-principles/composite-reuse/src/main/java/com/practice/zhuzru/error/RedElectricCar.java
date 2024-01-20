package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:44
 * @Created by zhuzru
 */
public class RedElectricCar extends ElectricCar {
    @Override
    public void move() {
        super.move();
        System.out.println("red electric car move");
    }
}
