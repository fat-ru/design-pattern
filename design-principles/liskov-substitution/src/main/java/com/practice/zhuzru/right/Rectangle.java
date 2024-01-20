package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 16:29
 * @Created by zhuzru
 */
public class Rectangle implements Quadrilateral{
    private double length;

    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
