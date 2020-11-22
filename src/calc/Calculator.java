package calc;

import static java.lang.String.format;

public class Calculator {
    double addTwoNumbers(double first, double second) {
        double result = first + second;
        System.out.println(format("%f + %f = %f", first, second, result));
        return result;
    }
    double sutractTwoNambers(double first, double second) {
        double result = first - second;
        System.out.println(format("%f - %f = %f", first, second, result));
        return result;
    }

    public static void main(String[] args) {
        var calc = new Calculator();
        calc.addTwoNumbers(2.1, 3.4);
        calc. sutractTwoNambers(2.1, 3.4);
    }
}
