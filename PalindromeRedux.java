/**
 * 
 */

/**
 * @author DAVISON
 *
 */

import java.util.Scanner;

public class PalindromeRedux {

	/**
	 * @param args
	 */
	
	
	public boolean isRelaxedPalindrome(String string){
		
		int intStringLength = string.length();
		int stringLength = 0;
		
		if (intStringLength % 2 == 0 ){
			stringLength = (intStringLength / 2);
		}else if (intStringLength % 2 > 0){
			 stringLength = (intStringLength - 1);
		}
		
		boolean isFound = false;
		for (int i = 0; i < stringLength; i++){
		
			if (string.charAt(i) == stringstring.length() - i){
				isFound = true;
			}
			else if (string.charAt(i) != string.length(){
				
			}
		}
		
		return isRelaxed()
	}
	
	public String stripCharacter(String string){
		
		return string();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter string of text to see what type of palindrome it is:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		
		
		
		
	}

}
