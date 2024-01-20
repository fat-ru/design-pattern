package com.practice.zhuzru.right;

import com.practice.zhuzru.right.impl.SafeDoorAntiProofAndWater;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 22:27
 * @Created by zhuzru
 */
public class RightApp {
    public static void main(String[] args) {
        // 针对需要的功能实现对应的接口
        SafeDoorAntiProofAndWater safeDoor = new SafeDoorAntiProofAndWater();
        safeDoor.antiProof();
        safeDoor.antiWater();
    }
}
