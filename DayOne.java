import java.util.*;

public class DayOne {

    // 1. Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 2. Generate all prime numbers up to n
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // 3. Calculate factorial of a number
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 4. Generate Fibonacci series up to n terms
    public static List<Integer> fibonacci(int n) {
        List<Integer> series = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            series.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return series;
    }

    // 5. Check if a number is even or odd
    public static String evenOrOdd(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Prime check
        System.out.print("Enter a number to check if prime: ");
        int num = sc.nextInt();
        System.out.println("Is " + num + " prime? " + isPrime(num));

        // 2. Generate primes up to n
        System.out.print("Enter a number to generate all primes up to: ");
        int limit = sc.nextInt();
        System.out.println("Prime numbers up to " + limit + ": " + generatePrimes(limit));

        // 3. Factorial
        System.out.print("Enter a number to find factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial of " + factNum + " = " + factorial(factNum));

        // 4. Fibonacci series
        System.out.print("Enter number of Fibonacci terms: ");
        int fibTerms = sc.nextInt();
        System.out.println("Fibonacci series up to " + fibTerms + " terms: " + fibonacci(fibTerms));

        // 5. Even or Odd
        System.out.print("Enter a number to check even or odd: ");
        int evenOddNum = sc.nextInt();
        System.out.println(evenOddNum + " is " + evenOrOdd(evenOddNum));

        sc.close();
    }
}
