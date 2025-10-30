package study;

import java.util.Scanner;

public class Alphanumberic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isAlphanumeric(input)) {
            System.out.println(" The string contains only alphanumeric characters.");
        } else {
            System.out.println(" The string contains special characters or spaces.");
        }

        sc.close();
    }

    // Method to check alphanumeric
    public static boolean isAlphanumeric(String str) {
        // Regular expression: letters (A-Z, a-z) and digits (0-9) only
        return str.matches("[A-Za-z0-9]+");
    }
}
