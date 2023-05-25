//Java Program to Count Number of Duplicate Words in String
public class Main {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog the";
        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    System.out.println(words[j]);
                    break;//(here the last won’t be printed because break terminates the loop)
                }
            }
        }
        System.out.println("Number of duplicate words: " + count);
        
    }
} 
