
package calculator;

class DivisionCalculate implements CalculationStrategy {
    @Override
    public double calculate(double operand1, double operand2) {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            throw new IllegalArgumentException("Division by zero");
        }
    }
}