/**
 * 
 */

/**
 * @author DAVISON
 *
 */

import java.util.Scanner;

public class CountingLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please write a text:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println("Which letter would you like to count now?");
		String strLetterToCount = in.next();
		
		int count = 0;
		int countInstances = 0;
		String strHistory = "";
	
		
		while (!strLetterToCount.isEmpty() && strLetterToCount.length() == 1){
			
			//check entered char (no of instances) in user entered string
			for (int i = 0; i < str.length(); i++){	
				if (str.charAt(i) == strLetterToCount.charAt(0)){
					strHistory = strHistory + strLetterToCount;
					for (int j = 0; j < strHistory.length(); j++){
						char c = strHistory.charAt(j);
						if (c == strLetterToCount.charAt(0)){
							countInstances++;
							if (countInstances > 1){
								System.out.println("Repeated character.Exiting the program...");
								System.out.println("Thank you for your cooperation. Good bye!");
								break;
							}
						}
					}
					count++;
				}
			}
			System.out.println("There are " + count + " in your text");
	
			
			
			count = 0;
			strHistory = strHistory + strLetterToCount;
			for (int j = 0; j < strHistory.length(); j++){
				char c = strHistory.charAt(j);
				if (c == strLetterToCount.charAt(0)){
					countInstances++;
				}
			}
				
			System.out.println("Which letter would you like to count now?");
			strLetterToCount = in.next();
		}	
	}
}
