package codewars.tasks.java.action;

import codewars.tasks.java.calculator.Calculator;
import codewars.tasks.java.calculator.Circle;

public class AreaCalculatorExecution {

    public static void main(String[] args) {

        double radius = 3;
        Calculator sut = new Calculator();
        sut.getTotalArea(new Circle(radius));

    }
}
