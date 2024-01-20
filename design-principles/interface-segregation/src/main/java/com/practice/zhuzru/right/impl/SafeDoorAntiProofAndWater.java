package com.practice.zhuzru.right.impl;

import com.practice.zhuzru.right.AntiProof;
import com.practice.zhuzru.right.AntiWater;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 22:26
 * @Created by zhuzru
 */
public class SafeDoorAntiProofAndWater implements AntiProof, AntiWater {
    @Override
    public void antiProof() {
        System.out.println("custom anti proof function");
    }

    @Override
    public void antiWater() {
        System.out.println("custom anti water function");
    }
}
