package Calculator;

import Calculator.Operation;

public class ArithmeticCalculator {
    private double firstNumber;
    private double secondNumber;

    public ArithmeticCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void calculate(Operation type) {
        if (type == Operation.ADD) {
            System.out.println(firstNumber + secondNumber);
        } else if (type == Operation.SUBTRACT) {
            System.out.println(firstNumber - secondNumber);
        } else if (type == Operation.MULTIPLY) {
            System.out.println(firstNumber * secondNumber);
        } else {
            System.out.println("Неверный символ");
        }

    }

}
