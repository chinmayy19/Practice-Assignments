import java.util.*;

public class MathOperations {

    // 1. Addition of two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. Print multiplication table of a number
    public static void printTable(int n) {
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 3. Print number pattern (triangle)
    public static void printPattern(int rows) {
        System.out.println("Number Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 4. Sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 5. Find GCD of two numbers
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Find LCM of two numbers
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Addition of two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + add(a, b));

        // 2. Multiplication table
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();
        printTable(num);

        // 3. Number pattern
        System.out.print("Enter number of rows for pattern: ");
        int rows = sc.nextInt();
        printPattern(rows);

        // 4. Sum of digits
        System.out.print("Enter a number to find sum of its digits: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(n));

        // 5. GCD and LCM
        System.out.print("Enter first number for GCD & LCM: ");
        int x = sc.nextInt();
        System.out.print("Enter second number for GCD & LCM: ");
        int y = sc.nextInt();
        System.out.println("GCD of " + x + " and " + y + " = " + findGCD(x, y));
        System.out.println("LCM of " + x + " and " + y + " = " + findLCM(x, y));

        sc.close();
    }
}
