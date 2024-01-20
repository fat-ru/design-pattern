package com.practice.zhuzru;

/**
 * 功能描述：
 *
 * @Date 2023/8/13 15:23
 * @Created by zhuzru
 */
public class InputMethod {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
