
/**
 * 8.Palindrome
 * 
 * A palindrome is a word, phrase, number or sequence of units that may be read the same way in either
 * direction. Examples of strict palindromes inclide "ABBA", "madam", "radar" and "step on no pets"
 * Write a program that reads a text and detects whether the text is strict palindomes.
 * 
 * @author DAVISON
 *
 */
import java.util.Scanner;
public class Palindrome {

	/**
	 * A palindrome is a word, phrase, number or other sequence of units that may
	 * be read the same way in either direction. Examples of strict palindromes include "ABBA",
	 * "madam", "radar", "kayak" and "step on no pets"
	 * Write a program that reads a text and detects whether the text is a strict palindrome
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a word, phrase, number or other sequence of units that may be read in either direction:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int middleStringPos = 0;
		
		String second;
		
		//Check if string is even length
		if (str.length() % 2 == 0){
			middleStringPos = str.length() / 2;
			second = str.substring(middleStringPos);
		}
		else{
			middleStringPos = str.length() / 2;
			second = str.substring(middleStringPos + 1);
		}
		
		String first = str.substring(0, middleStringPos);
		//String second = str.substring(middleStringPos + 1);
		String third = "";
		
		for (int i = second.length() - 1; i >= 0 ; i--){
			third = third + second.charAt(i);
		}
		
		if (first.equals(third)){
			System.out.println("User entered text is palindrome");
		}
		else{
			System.out.println("User entered text is not a palindrome");
		}
	}

}
