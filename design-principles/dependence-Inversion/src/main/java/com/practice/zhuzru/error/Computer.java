package com.practice.zhuzru.error;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 17:22
 * @Created by zhuzru
 */
public class Computer {
    // 电脑内部固定了硬盘、CPU、内存条的型号，不能插拔
    // 电脑抽象程度不够高，组装新电脑不能复用Computer类
    // 耦合度高，不能扩展
    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void start(){
        System.out.println("start computer");
        String data = hardDisk.get();
        cpu.run();
        memory.save();
        hardDisk.save(data);
    }
}
