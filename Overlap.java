/**
 * 
 */

/**
 * 15. Overlaps
 * Write a program that reads the coordinates of four points, the former two defining one
 * rectangle and the latter two defining another one. The program must read the coordinates
 * of a fifth point and say whether teh point is inside both rectangles, inside one of them only
 * or out of both.  
 * 
 * @author DAVISON
 *
 */


import java.util.Scanner;
public class Overlap {
	
	Rectangle rectangle1;
	Rectangle rectangle2;
	
	
	public Overlap(Rectangle rectangle1, Rectangle rectangle2){
		this.rectangle1 = rectangle1;
		this.rectangle2 = rectangle2;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

			System.out.println("Please enter xcoord for upLeft 1st Rectangle :");	
			double xcoord1 = in.nextDouble();
			System.out.println("Please enter ycoord for upLeft 1st Rectangle:");
			double ycoord1 = in.nextDouble();
			Point coord1 = new Point(xcoord1, ycoord1);
			
			System.out.println("Please enter xcoord for downRight 1st Rectangle :");	
			double xcoord2 = in.nextDouble();
			System.out.println("Please enter ycoord for downRight 1st Rectangle :");
			double ycoord2 = in.nextDouble();
			Point coord2 = new Point(xcoord2, ycoord2);
			
			System.out.println("Please enter xcoord for upLeft 2st Rectangle :");	
			double xcoord3 = in.nextDouble();
			System.out.println("Please enter ycoord for upLeft 2st Rectangle:");
			double ycoord3 = in.nextDouble();
			Point coord3 = new Point(xcoord3, ycoord3);
			
			System.out.println("Please enter xcoord for downRight 2nd Rectangle :");	
			double xcoord4 = in.nextDouble();
			System.out.println("Please enter ycoord for downRight 2nd Rectangle :");
			double ycoord4 = in.nextDouble();
			Point coord4 = new Point(xcoord4, ycoord4);
			
			System.out.println("Please enter xcoord for coord :");
			double xcoord5 = in.nextDouble();
			System.out.println("Please enter ycoord for coord :");
			double ycoord5 = in.nextDouble();
			Point coord5 = new Point(xcoord5, ycoord5);
	
			Rectangle rectangle1 = new Rectangle(coord1, coord2);
			Rectangle rectangle2 = new Rectangle(coord3, coord4);
			
			PointInRectangle pointInRect1 = new PointInRectangle(rectangle1);
			boolean isInside1 = pointInRect1.isPointInRectangle(coord5);
			
			PointInRectangle pointInRect2 = new PointInRectangle(rectangle2);
			boolean isInside2 = pointInRect2.isPointInRectangle(coord5);
			
			System.out.println("The value of isInside1 is :" + isInside1);
			System.out.println("The value of isInside2 is :" + isInside2);

			
			if (isInside1 & isInside2){
				System.out.println("Coord is outside both rectangle1 and rectangle 2");
			}
			else if(!isInside1 & !isInside2){
				System.out.println("coord is not inside either rectangle 1 or rectangle 2");
			}
			else{
				System.out.println("coord is inside either rectangle 1 or rectangle 2");
			}
	}

}
