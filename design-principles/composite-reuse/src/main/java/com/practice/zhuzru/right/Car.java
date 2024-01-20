package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/21 0:39
 * @Created by zhuzru
 */
public class Car {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void move(){
        System.out.println(color + " car move");
    }
}
