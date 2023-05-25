// Write a Java program to check that String is palindrome or not.
public class PalindromeChecker { 
    public static void main(String[] args) {
        String str = "madam"; // Change this string to test different cases
        
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
}
