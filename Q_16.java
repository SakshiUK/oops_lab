16. Write a Java Program to count the number of words in a string using HashMap.Output:
Input :Enter String: "This this is is done by Saket Saket";
{Saket=2, by=1, this=1, This=1, is=2, done=1}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<String, Integer> wordCountMap = countWords(input);

        System.out.println(wordCountMap);
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = input.split(" ");

        // Count the occurrence of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
