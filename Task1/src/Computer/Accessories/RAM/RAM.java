package Computer.Accessories.RAM;

import Computer.Accessories.RAM.Properties.RAMType;

public class RAM {
    private RAMType type;
    private int memory;
    private double wheigt;

    public RAM(RAMType type, int memory, double wheigt) {
        this.type = type;
        this.memory = memory;
        this.wheigt = wheigt;
    }

    public RAMType getType() {
        return type;
    }

    public void setType(RAMType type) {
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getWheigt() {
        return wheigt;
    }

    public void setWheigt(double wheigt) {
        this.wheigt = wheigt;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "type=" + type +
                ", memory=" + memory +
                ", wheigt=" + wheigt +
                '}';
    }
}
