package com.practice.zhuzru.error.impl;

import com.practice.zhuzru.error.SafetyDoor;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 20:10
 * @Created by zhuzru
 */
public class CustomSafetyDoor implements SafetyDoor {
    @Override
    public void antiTheft() {
        System.out.println("custom anti theft function");
    }

    @Override
    public void antiProof() {
        System.out.println("custom anti proof function");
    }

    @Override
    public void antiWater() {
        System.out.println("custom anti water function");
    }
}
