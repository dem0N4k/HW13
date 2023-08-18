package Computer.Accessories.HardDisk;

import Computer.Accessories.HardDisk.Properties.HardDiskType;

public class HardDisk {
    private HardDiskType type;
    private int memory;
    private double weight;

    public HardDisk(HardDiskType type, int memory, double weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    public HardDiskType getType() {
        return type;
    }

    public void setType(HardDiskType type) {
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "type=" + type +
                ", memory=" + memory +
                ", weight=" + weight +
                '}';
    }
}
