package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 15:58
 * @Created by zhuzru
 */
public class Square extends Rectangle{
    @Override
    public double getLength() {
        return super.getLength();
    }

    // 重写父类的方法，违背里氏替换原则
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    // 重写父类的方法，违背里氏替换原则
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
