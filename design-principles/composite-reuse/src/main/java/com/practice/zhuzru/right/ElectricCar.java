package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:56
 * @Created by zhuzru
 */
public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println(getColor().showColor() + "electric car move");
    }
}
