/**
 * 
 */

/**
 * @author DAVISON
 *
 */
import java.util.Scanner;

public class PalindromeGenerator {

	/**
	 * 9. Palindrome Creator
	 * Write a program that reads a text then writes on the screen a palindrome by writing
	 * the same text followed by the same text in reverse order.
	 * For example if the user enters a text "It was a dark and stormy night" the
	 * program must output "It was a dark and stormy nightthgin ymrots dna krad a saw tI"
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char c;
		String newWord = "";
		for (int i = str.length() - 1 ; i >= 0; i--){
			c = str.charAt(i);
			newWord = newWord + c;
		}
		
		System.out.println(str + newWord);
	}

}
