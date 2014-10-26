/**
 * 
 */

/**
 * @author DAVISON
 *
 */

import java.util.Scanner;

public class ChangeDispenser {

	/**
	 * Write a program that reads the total cost of a purchase and an amount of money that is
	 * paid to buy it.
	 * Your program should output the correct change specifying the amount of notes (50, 20, 10, 5)
	 * and coins (2,1,0.50, 0.20, 0.10, 0.05 , 0.02 and 0.01) needed
	 * @param args
	 */
	
	private final int FIFTY_NOTE = 5000;
	private final int TWENTY_NOTE = 2000;
	private final int TEN_NOTE = 1000;
	private final int FIVE_NOTE = 500;
	private final int TWO_POUNDS = 200;
	private final int ONE_POUND = 100;
	private final int FIFTY_PENCE = 50;
	private final int TWENTY_PENCE = 20;
	private final int TEN_PENCE = 10;
	private final int FIVE_PENCE = 5;
	private final int TWO_PENCE = 2;
	private final int ONE_PENCE = 1;
	
	private int purchasePrice;
	private int balance;
	
	public ChangeDispenser(int purchasePrice, int balance){
		this.purchasePrice = purchasePrice;
		this.balance = balance;
	
	}

	public void calculateChange(){		
		Scanner in = new Scanner(System.in);
	 
		while (this.getBalance() < this.getPurchasePrice()){
			System.out.println("Cash not sufficient! Current Balance: " + this.balance  + ". Please enter more cash:");
			String str2 = in.next();
			int cashInput = Integer.parseInt(str2);
			this.setBalance(cashInput);
		}
		
		
		//Dispense item and return change
		
		int changeBalance = 0;
		if (this.getBalance() > this.getPurchasePrice()){
			changeBalance = this.getBalance() - this.getPurchasePrice();
			double returnChange = 0;
			
			System.out.println("changebalance =" + changeBalance);
			
			if (changeBalance % this.FIFTY_NOTE >= 0){
				int returnChange1 =  changeBalance / this.FIFTY_NOTE;
				changeBalance = changeBalance % this.FIFTY_NOTE; 
				System.out.println("" + (int) returnChange1 + " x £50,");
			}
			
			if (changeBalance % this.TWENTY_NOTE >= 0){
				int returnChange2 =  changeBalance / this.TWENTY_NOTE;
				changeBalance = changeBalance % this.TWENTY_NOTE; 
				System.out.println("" + (int) returnChange2 + " x £20,");
			}
			
			if (changeBalance % this.TEN_NOTE >= 0){
				int returnChange3 =  changeBalance / this.TEN_NOTE;
				changeBalance = changeBalance % this.TEN_NOTE; 
				System.out.println("" + (int) returnChange3 + " x £10,");
			}
			
			if (changeBalance % this.FIVE_NOTE >= 0){
				int returnChange4 =  changeBalance / this.FIVE_NOTE;
				changeBalance = changeBalance % this.FIVE_NOTE; 
				System.out.println("" + (int) returnChange4 + " x £5,");
			}
			
			if (changeBalance % this.TWO_POUNDS >= 0){
				int returnChange5 =  changeBalance / this.TWO_POUNDS;
				changeBalance = changeBalance % this.TWO_POUNDS; 
				System.out.println("" + (int) returnChange5 + " x £2,");
			}
			
			if (changeBalance % this.ONE_POUND >= 0){
				int returnChange6 =  changeBalance / this.ONE_POUND;
				changeBalance = changeBalance % this.ONE_POUND; 
				System.out.println("" + (int) returnChange6 + " x £1,");
			}
			
			if (changeBalance % this.FIFTY_PENCE >= 0){
				int returnChange7 =  changeBalance / this.FIFTY_PENCE;
				changeBalance = changeBalance % this.FIFTY_PENCE; 
				System.out.println("" + (int) returnChange7 + " x £0.50,");
			}
			
			if (changeBalance % this.TWENTY_PENCE >= 0){
				int returnChange8 =  changeBalance / this.TWENTY_PENCE;
				changeBalance = changeBalance % this.TWENTY_PENCE; 
				System.out.println("" + (int) returnChange8 + " x £0.20,");
			}
			
			if (changeBalance % this.TEN_PENCE >= 0){
				int returnChange9 =  changeBalance / this.TEN_PENCE;
				changeBalance = changeBalance % this.TEN_PENCE; 
				System.out.println("" + (int) returnChange9 + " x £0.10,");
			}
			
			if (changeBalance % this.FIVE_PENCE >= 0){
				int returnChange10 =  changeBalance / this.FIVE_PENCE;
				changeBalance = changeBalance % this.FIVE_PENCE; 
				System.out.println("" + (int) returnChange10 + " x £0.05,");
			}
			
			if (changeBalance % this.TWO_PENCE >= 0){
				int returnChange11 =  changeBalance / this.TWO_PENCE;
				changeBalance = changeBalance % this.TWO_PENCE; 
				System.out.println("" + (int) returnChange11 + " x £0.02,");
			}
			
			if (changeBalance % this.ONE_PENCE >= 0){
				int returnChange12 =  changeBalance / this.ONE_PENCE;
				changeBalance = changeBalance % this.ONE_PENCE; 
				System.out.println("" + (int) returnChange12 + " x £0.01,");
			}
		}
		else if(this.getBalance() == this.getPurchasePrice()){
			System.out.println("No Change to return!");
		}
	}
	
	public int getBalance(){
		return balance;	
	}
	
	public int getPurchasePrice(){
		return purchasePrice;
	}
	
	public void setBalance(int cashInput){
		this.balance = this.balance + cashInput;
	}
	

	
	public static void main(String[] args) {
		
		System.out.println("Please enter purchase amount in pence");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int purchaseAmount = Integer.parseInt(str);
		
		System.out.println("Please enter initial cash amount in pence:");
		String str2 = in.next();
		int cashInput = Integer.parseInt(str2);
		
		ChangeDispenser cashD = new ChangeDispenser(purchaseAmount, cashInput);
		cashD.calculateChange();
	}

}
