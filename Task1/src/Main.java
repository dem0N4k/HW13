import Calculator.ArithmeticCalculator;
import Calculator.Operation;
import Computer.Accessories.CPU.CPU;
import Computer.Accessories.CPU.Properties.CountCores;
import Computer.Accessories.CPU.Properties.FrequencyCPU;
import Computer.Accessories.CPU.Properties.Vender;
import Computer.Accessories.HardDisk.HardDisk;
import Computer.Accessories.HardDisk.Properties.HardDiskType;
import Computer.Accessories.Keyboard.Keyboard;
import Computer.Accessories.Keyboard.Properties.Backlight;
import Computer.Accessories.Keyboard.Properties.KeyboardType;
import Computer.Accessories.RAM.Properties.RAMType;
import Computer.Accessories.RAM.RAM;
import Computer.Accessories.Screen.Properties.ScreenType;
import Computer.Accessories.Screen.Screen;
import Computer.Computer;

public class Main {
    public static void main(String[] args) {
//        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(10,2);
//        arithmeticCalculator.calculate(Operation.ADD);                            Для калькулятора



        CPU cpu = new CPU(FrequencyCPU.THREE_THOUSAND, CountCores.FOUR, Vender.AMD, 52);
        RAM ram = new RAM(RAMType.DDR_5, 3000, 150);
        HardDisk hardDisk = new HardDisk(HardDiskType.SDD, 1500, 300);
        Screen screen = new Screen(32, ScreenType.IPS, 2500);
        Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL, Backlight.WITH_BACKLIGHT, 400);

        Computer computer = new Computer("USA", "HP", cpu, ram, hardDisk, screen, keyboard);

        System.out.println(computer); // принт всех компонентов
        System.out.println(computer.getCpu()); // принт чисто ЦПУ
        System.out.println(computer.getCpu().getWeight() + computer.getHardDisk().getWeight()
                + computer.getScreen().getWeight() + computer.getKeyboard().getWeight() + computer.getRam().getWheigt()); // принт веса по кускам
        System.out.println(computer.getWeightComputer()); // нормальный принт веса компа
    }
}