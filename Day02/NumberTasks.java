import java.util.*;

public class NumberTasks {

    // 1. Sum of first n even numbers
    public static int sumOfEven(int n) {
        int sum = 0;
        int num = 2;  // first even number
        for (int i = 0; i < n; i++) {
            sum += num;
            num += 2;
        }
        return sum;
    }

    // 2. Sum of first n odd numbers
    public static int sumOfOdd(int n) {
        int sum = 0;
        int num = 1;  // first odd number
        for (int i = 0; i < n; i++) {
            sum += num;
            num += 2;
        }
        return sum;
    }

    // 3. Check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    // 4. Check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    // 5. Reverse a number
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Sum of first n even numbers
        System.out.print("Enter n for sum of first n even numbers: ");
        int nEven = sc.nextInt();
        System.out.println("Sum of first " + nEven + " even numbers: " + sumOfEven(nEven));

        // 2. Sum of first n odd numbers
        System.out.print("Enter n for sum of first n odd numbers: ");
        int nOdd = sc.nextInt();
        System.out.println("Sum of first " + nOdd + " odd numbers: " + sumOfOdd(nOdd));

        // 3. Palindrome check
        System.out.print("Enter a number to check if palindrome: ");
        int palNum = sc.nextInt();
        System.out.println("Is palindrome: " + isPalindrome(palNum));

        // 4. Armstrong check
        System.out.print("Enter a number to check if Armstrong: ");
        int armNum = sc.nextInt();
        System.out.println("Is Armstrong: " + isArmstrong(armNum));

        // 5. Reverse number
        System.out.print("Enter a number to reverse: ");
        int revNum = sc.nextInt();
        System.out.println("Reversed number: " + reverseNumber(revNum));

        sc.close();
    }
}
