package calculator;

public class AdditionCalculate implements CalculationStrategy {
    @Override
    public double calculate(double a1,double b1) {
        return a1+b1;
    }
}
