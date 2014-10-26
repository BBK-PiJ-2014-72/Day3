/**
 * 
 */

/**
 * @author DAVISON
 *
 */

import java.util.Scanner;

public class LineToColumn {

	/**
	 * Write a program that reads some text from the user then writes the same text on screen,
	 * but each letter is on a different line
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Please enter a line:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		//Write each letter of entered string on separate line
		for (int i = 0; i < str.length(); i++){
			System.out.println("" + str.charAt(i));
		}
		
		System.out.println("Please enter a line:");
		Scanner in2 = new Scanner(System.in);
		///Write each word on a separate line
		while (in.hasNext()){
			System.out.println(in.next());
		}	
	}
		
}

