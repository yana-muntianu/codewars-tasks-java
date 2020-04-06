package codewars.tasks.java.calculator;

public class Calculator {

    /*
Implement:
Calculator.getTotalArea()
Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`
according to the tests given
 */
        public double getTotalArea(Figure... fig){
            double totalArea = 0;
            for (Figure figure : fig) {
                totalArea += figure.getArea();
            }
            System.out.println(totalArea);
            return roundDouble(totalArea);
        }
        public double roundDouble(double d){
            d= d*100;
            int i = (int)Math.round(d);
            return (double)i/100;
        }
    }
