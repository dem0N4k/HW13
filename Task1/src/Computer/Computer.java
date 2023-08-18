package Computer;

import Computer.Accessories.CPU.CPU;
import Computer.Accessories.HardDisk.HardDisk;
import Computer.Accessories.Keyboard.Keyboard;
import Computer.Accessories.RAM.RAM;
import Computer.Accessories.Screen.Screen;

public class Computer {
    public final String vendor;
    public final String name;

    private CPU cpu;
    private RAM ram;
    private HardDisk hardDisk;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor,
                    String name,
                    CPU cpu,
                    RAM ram,
                    HardDisk hardDisk,
                    Screen screen,
                    Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getWeightComputer() {
        return cpu.getWeight() + hardDisk.getWeight() + keyboard.getWeight() + ram.getWheigt()
                + screen.getWeight();
    }



    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                '}';
    }
}
