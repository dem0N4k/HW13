package Computer.Accessories.Keyboard;

import Computer.Accessories.Keyboard.Properties.Backlight;
import Computer.Accessories.Keyboard.Properties.KeyboardType;

public class Keyboard {
    private KeyboardType type;
    private Backlight backlight;
    private double weight;

    public Keyboard(KeyboardType type, Backlight backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", backlight=" + backlight +
                ", weight=" + weight +
                '}';
    }
}
