package com.practice.zhuzru.error;

import com.practice.zhuzru.error.impl.CustomSafetyDoor;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 22:19
 * @Created by zhuzru
 */
public class ErrorApp {
    public static void main(String[] args) {
        // 存在问题：如安全门只需要防水和防火，重新创建的安全门实现SafetyDoor接口时，
        // 也需要实现防盗接口，而防盗的接口并不需要
        // 解决方法：将不同的功能放在不同的接口
        SafetyDoor safetyDoor = new CustomSafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.antiProof();
        safetyDoor.antiWater();
    }
}
