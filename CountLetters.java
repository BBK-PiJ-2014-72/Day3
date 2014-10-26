/**
 * 
 */

/**
 * @author DAVISON
 *
 */
import java.util.Scanner;

public class CountLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Please enter some text:");
			Scanner in = new Scanner(System.in);
			String lineStr = in.nextLine();
			
			int count = 0;
			for(int i = 0; i < lineStr.length(); i++){
				if (lineStr.charAt(i) == 'e'){
					count++;	
				}
			}
			System.out.println("There are " + count + " e's in user entered string");
			
			System.out.println("Please enter another piece of text:");
			String lineStr2 = in.nextLine();
 			System.out.println("Please enter a letter you would like to count instances of in entered text:" );
			String charToFind  = in.next();
			char c = charToFind.charAt(0);
			
			count = 0;
			for (int i = 0; i < lineStr2.length(); i++){
				char p = lineStr2.charAt(i);
				if(p == c){
					count++;
				}
			}
			
			System.out.println("The number of " + charToFind + " letter(s) in entered string is " + count);
	}
		
	}
	
	


