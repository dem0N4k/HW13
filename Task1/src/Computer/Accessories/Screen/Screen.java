package Computer.Accessories.Screen;

import Computer.Accessories.Screen.Properties.ScreenType;

public class Screen {
    private double diaginal;
    private ScreenType type;
    private double weight;

    public Screen(double diaginal, ScreenType type, double weight) {
        this.diaginal = diaginal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiaginal() {
        return diaginal;
    }

    public void setDiaginal(double diaginal) {
        this.diaginal = diaginal;
    }

    public ScreenType getType() {
        return type;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "diaginal=" + diaginal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
