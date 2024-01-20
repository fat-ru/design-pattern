package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 17:50
 * @Created by zhuzru
 */
public class RightApp {
    public static void main(String[] args) {
        // 创建组件对象
        // 如果需要更换电脑组件，只需要在此处对接口赋值新的电脑组件
        // 可扩展
        HardDisk hardDisk = new XiJieHardDisk();
        Memory memory = new KingstonMemory();
        Cpu cpu = new IntelCpu();

        // 创建计算机
        Computer computer = new Computer();

        // 组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        computer.start();
    }
}
