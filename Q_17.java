// 17. Write a program to read 10 string from console and then print the sorted strings on console (Use String Class).2) combine two string   3)reverse first string nd dispaly it .
import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        // Read 10 strings from the console
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings);

        // Print the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        String combinedString = strings[0] + strings[1];
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string
        String reversedString = reverseString(strings[0]);
        System.out.println("Reversed first string: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}