package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:42
 * @Created by zhuzru
 */
public class WhitePetrolCar extends PetrolCar {
    @Override
    public void move() {
        super.move();
        System.out.println("white petrol car move");
    }
}
