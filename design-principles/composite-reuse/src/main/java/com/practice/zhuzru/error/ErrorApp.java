package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:45
 * @Created by zhuzru
 */
public class ErrorApp {
    public static void main(String[] args) {
        // 存在的问题：通过继承复用，会衍生出很多子类，扩展性差
        // 解决方法：将颜色定义为一个接口，并将接口设置为Car的成员属性
        RedPetrolCar redPetrolCar = new RedPetrolCar();
        redPetrolCar.move();
    }
}
