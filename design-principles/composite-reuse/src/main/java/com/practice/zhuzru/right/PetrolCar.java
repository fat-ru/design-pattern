package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:53
 * @Created by zhuzru
 */
public class PetrolCar extends Car {
    @Override
    public void move() {
        System.out.println(getColor().showColor() + " petrol car move");
    }
}
