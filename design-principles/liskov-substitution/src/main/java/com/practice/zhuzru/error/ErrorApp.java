package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 16:02
 * @Created by zhuzru
 */
public class ErrorApp {
    public static void main(String[] args) {
        // 长方形，功能正常，可以打印出长度和宽度
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printRectangle(rectangle);

        // 正方形，功能异常，由于长宽相等，不能退出循环
        Rectangle square = new Square();
        square.setLength(20);
        square.setWidth(10);
        resize(square);
        printRectangle(square);
    }

    private static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    private static void printRectangle(Rectangle rectangle){
        System.out.println("length:" + rectangle.getLength() + " width:" + rectangle.getWidth());
    }
}
