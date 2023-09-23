package calculator;

// Factory class to create CalculationStrategy instances
public class calculateFactory {
    public CalculationStrategy createOperation(String operator) {
        switch (operator) {
            case "+":
                return new AdditionCalculate();
            case "-":
                return new SubtractionCalculate();
            case "*":
                return new MultiplicationCalculate();
            case "/":
                return new DivisionCalculate();
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
