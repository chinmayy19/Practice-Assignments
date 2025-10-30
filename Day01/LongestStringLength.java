public class LongestStringLength {
    public static void main(String[] args) {
        // Example array of strings
        String[] arr = {"apple", "banana", "mango", "watermelon", "kiwi"};

        int maxLength = 0;

        // Loop through each string and find the maximum length
        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        System.out.println("Length of the longest string: " + maxLength);
    }
}
