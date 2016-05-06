package Facade;

/**
 * Created by mizeshuang on 2016/5/6.
 */

/**
 * 这个类相当于就是外观模式的核心泪，就是将其他类的东西封装起来
 */

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished");
    }

    public void shutdown() {
        System.out.println("begin to close the computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed");
    }
}
