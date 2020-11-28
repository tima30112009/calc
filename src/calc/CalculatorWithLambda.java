package calc;

import static java.lang.String.format;

public class CalculatorWithLambda {
    static ArithmeticOperation addition = (first, second) -> {
        double result = first + second;
        System.out.println(format("%f + %f = %f", first, second, result));
        return result;
    };
    static ArithmeticOperation subtraction = new ArithmeticOperation() {
        public double performOperation(double first, double second) {
            double result = first - second;
            System.out.println(format("%f - %f = %f", first, second, result));
            return result;
        }
    };

    public static double calculate(ArithmeticOperation whatToDo, double first, double second) {
        return whatToDo.performOperation(first, second);
    }

    public static void main(String[] args) {
        calculate(addition, 2.1, 3.4);
        calculate(subtraction, 2.1, 3.4);
    }
}




