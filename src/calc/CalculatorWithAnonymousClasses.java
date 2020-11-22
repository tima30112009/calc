package calc;

public class CalculatorWithAnonymousClasses {
    static ArithmeticOperation addition = new ArithmeticOperation() {
        @Override
        public double performOperation(double first, double second) {
            return 0;
        }
    }
}
