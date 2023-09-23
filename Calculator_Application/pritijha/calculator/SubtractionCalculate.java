package calculator;

public class SubtractionCalculate implements CalculationStrategy {
    @Override
    public double calculate(double a1,double b1) {
        return a1-b1;
    }
}
