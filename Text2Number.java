/**
 * 
 */

/**
 * @author DAVISON
 *
 */
import java.util.Scanner;
public class Text2Number {

	/**
	 * 11.TextToNumber
	 * Write a program that reads a number with commas and decimal dots (such as "23,419.34")
	 * and then prints a number that is half of it. Do not use Double.parseDouble()/
	 * If you were writing a simple spreadsheet, you could use this code to parse the input
	 * in the cells.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
        System.out.println("Please enter a number as string using commas and decimal point:");
        Scanner in = new Scanner(System.in);
        String str = in.next();	
        int decimalPointPos = 0;
        int decimalPointCount = 0;
        String num1 = "";
        String num2 = "";
        String num = "";
        int numInt = 0;
        
        for(int i = 0; i < str.length(); i++){
        	if (str.charAt(i) == '.'){
        		decimalPointPos = i;
        		System.out.println("" + decimalPointPos);
        		num1 = str.substring(0, decimalPointPos);
        		num2 = str.substring(decimalPointPos + 1);
        		decimalPointCount++;
        	}
        }
        
        System.out.println("num1 = :" + num1);
        System.out.println("num2 = :" + num2);
        
        //calculate no of decimal places
        int noOfDecimalPlaces = str.length() - decimalPointPos;
        int actualDecimalPlacesInString = noOfDecimalPlaces - 1;
        
        System.out.println("No of decimal places in user entered string: " + actualDecimalPlacesInString);
        
        //Create whole number and convert to integer
    	num = num1 + num2;
    	numInt = Integer.parseInt(num);
    	double numDouble = (double) numInt;
    
    	numDouble = numDouble / 2;
        System.out.println("numDouble: " +  numDouble);
        
        String str2 = "" + numDouble; 
        //Find decimal point in double
        String stringNumber1 = "";
        String stringNumber2 = "";
        
        int decimalPointPos2 = 0;
        for (int i = 0; i < str2.length(); i++){
        	if(str2.charAt(i) == '.'){
        		decimalPointPos2 = i;
        		stringNumber1 = str2.substring(0, decimalPointPos2);
        		stringNumber2 = str2.substring(decimalPointPos2 - 1);
        	}
        }
        
        int stringNumber1Pos = stringNumber1.length() - 2;
        int stringNumber1Pos2 = stringNumber1.length();
        String s1a = stringNumber1.substring(0, stringNumber1Pos);
        s1a = s1a;
        System.out.println("s1a:" + s1a);
        
        //stringNumber1Pos = stringNumber1.length() - 1;
        String s1b = stringNumber1.substring(stringNumber1Pos);
        System.out.println("s1b:" + s1b);
        
        
        int stringNumber2Pos = stringNumber2.length() - 1;
        String s1c = stringNumber2.substring(stringNumber2Pos);
        System.out.println("s1c:" + s1c);
        
        String firstStr =  s1a;
        String secondStr = s1b + s1c;
        int first = Integer.parseInt(firstStr);
        double firstDouble = (double) first;
        int second = Integer.parseInt(secondStr);
        double secondDouble = (double) second;
        
        double answer = firstDouble + (secondDouble/(Math.pow(10,secondStr.length())));
      
        System.out.println("Number when divided by 2 is:" + answer) ;
	}
	
	

}
