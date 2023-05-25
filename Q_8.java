// You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person. Use HashMap to implement it.The first line will have an integer denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
// After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
// Constraints:
// A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Solution {
	/* input Scanner for reading input for the program */
	private static Scanner inputScanner;
	public static void main(String[] args) {
		/* Create a phone book Map */
		Map<String, String> phoneBook = new HashMap<String, String>();
		/* Create the input Scanner instance */
		inputScanner = new Scanner(System.in);	
		/* Read the number of input phone numbers */
		int numFriends = inputScanner.nextInt();
		/* Go to the next line of input */
		inputScanner.nextLine();
		/* Loop thru the number of friends, reading the name and phone number, and adding to the phoneBook */
		for (int i = 0; i < numFriends; i++) {
			/* Read the name of the friend */
			String name = inputScanner.nextLine();
			/* Read the phone number */
			String phone = inputScanner.nextLine();
			/* Put the name and phone number into the phoneBook */
			phoneBook.put(name, phone);
		}
		/* Loop while there is still more input data */
		while (inputScanner.hasNext()) {
			/* Read the person to search for a phone number */
			String inputName = inputScanner.nextLine();
			/* Does the name exist in the phone Book */
			if (phoneBook.containsKey(inputName)) {
				/* Yes, print out the name and phone number */
				System.out.println(inputName + "=" + phoneBook.get(inputName));
			} else {
				/* Print out error message if not found */
				System.out.println("Not found");
			}
		}
	}
}
