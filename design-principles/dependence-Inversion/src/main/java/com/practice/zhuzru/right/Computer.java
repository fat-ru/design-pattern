package com.practice.zhuzru.right;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 17:01
 * @Created by zhuzru
 */
public class Computer {
    // 电脑的组件全部使用接口来表示
    // 在接口中定义各个组件的功能
    // 具体的功能由接口实现来完成
    // 因此更换电脑组件只需要重新实现接口，并进行插拔
    private HardDisk hardDisk;

    private Cpu cpu;

    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
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
