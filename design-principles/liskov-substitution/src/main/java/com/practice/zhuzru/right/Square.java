package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 16:27
 * @Created by zhuzru
 */
public class Square implements Quadrilateral{
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getLength() {
        return sideLength;
    }

    @Override
    public double getWidth() {
        return sideLength;
    }
}
