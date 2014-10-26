/**
 * 
 */

/**
 * 13.Rectangle
 * Write a program that reads the X and Y coordinates of two points and then outputs the
 * area of the rectangle when both points are opposite corners. Use the following 
 * class to store the data for the points.
 * 
 *  class Rectangle{
 *  	Point upLeft;
 *  	Point downRight;
 *  }
 * 
 * @author DAVISON
 *
 */
import java.util.Scanner;
public class Rectangle{

	Point upLeft;
	Point downRight;
	
	public Rectangle(Point upLeft, Point downRight){
		this.upLeft = upLeft;
		this.downRight = downRight;
	}
	
	public double getArea(){	
		return ((this.downRight.getX() - this.upLeft.getX()) * (this.upLeft.getY() - this.downRight.getY()));	
	}
	
	public double getPerimeter(){
		double  width = this.downRight.getX() - this.upLeft.getX();
		double height =  this.upLeft.getY() - this.downRight.getY();	
		return (width + height) * 2;
	}
	
	public Point getUpLeft(){
		return this.upLeft;
	}
	
	public Point getDownRight(){
		return this.downRight;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a uplLeft x coord:");
		Scanner in = new Scanner(System.in);
		double upLeftCoordX = in.nextDouble();
		
		System.out.println("Please enter a uplLeft y coord:");
		in = new Scanner(System.in);
		double upLeftCoordY = in.nextDouble();
		
		System.out.println("Please enter a downRight x coord:");
		in = new Scanner(System.in);
		double downRightCoordX = in.nextDouble();
		
		System.out.println("Please enter a downRight y coord:");
		in = new Scanner(System.in);
		double downRightCoordY = in.nextDouble();
		
		Point coord1 = new Point(upLeftCoordX,upLeftCoordY);
		Point coord2 = new Point(downRightCoordX,downRightCoordY);
		
		if (coord1.getX() < coord2.getX() && coord1.getY() > coord2.getY()){
			Rectangle rectangle = new Rectangle(coord1, coord2);
			System.out.println("The area of the rectangle is: " + rectangle.getArea());
			System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
		}
		else{
			System.out.println("UpLeft coord is not upLeft, Try again!");
		}
	}

}
