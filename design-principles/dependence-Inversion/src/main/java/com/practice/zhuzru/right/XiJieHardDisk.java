package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 17:23
 * @Created by zhuzru
 */
public class XiJieHardDisk implements HardDisk{
    private static String hardDiskData = "study materials";
    public void save(String data) {
        hardDiskData = data;
        System.out.println("save data to xiJie hardDisk:" + data);
    }

    public String get() {
        System.out.println("get data from xiJie hardDisk:" + hardDiskData);
        return hardDiskData;
    }
}
