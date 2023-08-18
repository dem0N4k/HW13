package Computer.Accessories.CPU;

import Computer.Accessories.CPU.Properties.CountCores;
import Computer.Accessories.CPU.Properties.FrequencyCPU;
import Computer.Accessories.CPU.Properties.Vender;


public class CPU {
    private FrequencyCPU frequencyCPU;
    private CountCores countCores;
    private Vender name;
    private double weight;

    public CPU(FrequencyCPU frequencyCPU, CountCores countCores, Vender name, double weight) {
        this.frequencyCPU = frequencyCPU;
        this.countCores = countCores;
        this.name = name;
        this.weight = weight;
    }

    public FrequencyCPU getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(FrequencyCPU frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public CountCores getCountCores() {
        return countCores;
    }

    public void setCountCores(CountCores countCores) {
        this.countCores = countCores;
    }

    public Vender getName() {
        return name;
    }

    public void setName(Vender name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "frequencyCPU=" + frequencyCPU +
                ", countCores=" + countCores +
                ", name=" + name +
                ", weight=" + weight +
                '}';
    }
}
