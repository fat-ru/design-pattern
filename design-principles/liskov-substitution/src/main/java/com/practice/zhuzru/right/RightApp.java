package com.practice.zhuzru.right;


/**
 * 功能描述：
 *
 * @Date 2024/1/20 16:30
 * @Created by zhuzru
 */
public class RightApp {
    public static void main(String[] args) {
        // 长方形，功能正常，可以打印出长度和宽度
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printRectangle(rectangle);
    }

    // 这里不能传入Square类型
    private static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    private static void printRectangle(Quadrilateral quadrilateral){
        System.out.println("length:" + quadrilateral.getLength() + " width:" + quadrilateral.getWidth());
    }
}
