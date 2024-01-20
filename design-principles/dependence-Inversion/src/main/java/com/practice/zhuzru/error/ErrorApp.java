package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 17:35
 * @Created by zhuzru
 */
public class ErrorApp {
    public static void main(String[] args) {
        // 创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        KingstonMemory memory = new KingstonMemory();
        IntelCpu cpu = new IntelCpu();

        // 创建计算机
        Computer computer = new Computer();

        // 组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        computer.start();
    }
}
