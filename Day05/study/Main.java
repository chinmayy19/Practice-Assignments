package study;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        String op = sc.next();

        try {
            int result = Calculator.calculate(a, b, op);
            System.out.println("Result: " + result);
        } 
        catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }

        sc.close();
    }
}
