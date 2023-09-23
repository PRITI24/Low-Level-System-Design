import calculator.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        calculateFactory operationFactory=new calculateFactory();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Operand:");
        double operand1 = sc.nextInt();
        System.out.println("Operator:");
        String operator = sc.next();
        System.out.println("Second Operand:");
        double operand2 = sc.nextInt();

        // Creating an operator object
        CalculationStrategy operation = operationFactory.createOperation(operator);

        // Perform the calculation
        double result = operation.calculate(operand1, operand2);

        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}