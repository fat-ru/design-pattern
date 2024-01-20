package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:57
 * @Created by zhuzru
 */
public class RightApp {
    public static void main(String[] args) {
        Red red = new Red();
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setColor(red);
        petrolCar.move();
    }
}
