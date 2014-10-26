/**
 * 
 */

/**
 * 14. Inside or Outside
 * Write a program that reads teh coordinates of teh two points defining a rectangle and then
 * the coordinates of a third point. The program must then determine whether the point
 * falls inside or outside teh rectangle. 
 * @author DAVISON
 *
 */
import java.util.Scanner;

public class PointInRectangle {

	private Rectangle rectangle;

	public PointInRectangle(Rectangle rectangle){
		this.rectangle = rectangle;
	}
	
	public boolean isPointInRectangle(Point coord){
		boolean isInside = false;
		
		if (coord.getX() > rectangle.getUpLeft().getX() && coord.getX() < rectangle.getDownRight().getX() && coord.getY() < rectangle.getUpLeft().getY() && coord.getY() > rectangle.getDownRight().getY()){
			isInside = true;
		}
		return isInside;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Please enter a upLeft x-coord:"); 
		Scanner in = new Scanner(System.in);		
		double upLeftX = in.nextDouble();
		
		System.out.println("Please enter a upLeft y-coord:"); 		
		double upLeftY = in.nextDouble();
		
		System.out.println("Please enter a downRight x-coord:"); 
		double downRightX = in.nextDouble();
		
		System.out.println("Please enter a downRight y-coord:"); 		
		double downRightY = in.nextDouble();
		
		System.out.println("Please enter a coord to see if point is in Rectangle: ");
		double x = in.nextDouble();		
		double y = in.nextDouble();
		
		Point coord1 = new Point(upLeftX,upLeftY);
		Point coord2 = new Point(downRightX, downRightY);
		Point coord3 = new Point(x, y);
		Rectangle rectangle = new Rectangle(coord1, coord2);
		PointInRectangle pointInRectangle = new PointInRectangle(rectangle);
		boolean isInside = pointInRectangle.isPointInRectangle(coord3);
		System.out.println("Is third coord is in the rectangle?:" + isInside);
	}

}
