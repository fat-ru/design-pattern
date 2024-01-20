package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:40
 * @Created by zhuzru
 */
public class PetrolCar extends Car {
    @Override
    public void move() {
        super.move();
        System.out.println("petrol car move");
    }
}
