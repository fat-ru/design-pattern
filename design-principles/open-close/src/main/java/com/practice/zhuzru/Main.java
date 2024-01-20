package com.practice.zhuzru;

/**
 * 功能描述：
 *
 * @Date 2023/8/13 15:24
 * @Created by zhuzru
 */
public class Main {
    public static void main(String[] args) {
        // 创建输入法实例
        InputMethod inputMethod = new InputMethod();

        // 创建皮肤实例
        CustomSkin skin = new CustomSkin();

        // 选择皮肤
        inputMethod.setSkin(skin);

        // 展示皮肤
        inputMethod.display();
    }
}
