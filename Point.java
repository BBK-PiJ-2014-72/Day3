
/**
 * 12. Distance to Point
 * 
 * Write a program that reads the X and Y coordinates of three points and then outputs
 * which of the three are closer.
 * Use the following class to store the data for the points 
 * 
 * @author DAVISON
 *
 */
import java.util.Scanner;
import java.util.Arrays;
public class Point {

private	double x = 0;
private	double y = 0;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	/**
	 * @param args
	 */


	public static void main(String[] args) {
				
		System.out.println("Please enter a coordinate in metres :");
		Scanner in = new Scanner(System.in);
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		
		System.out.println("Please enter a coordinate in metres:");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
		System.out.println("Please enter a coordinate in metres:");
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		
		Point coord1 = new Point(x1,y1);
		Point coord2 = new Point(x2,y2);
		Point coord3 = new Point(x3,y3);
		
		double distance1_2 = Math.sqrt(Math.pow(coord1.getX() - coord2.getX(), 2) + Math.pow(coord1.getY() - coord2.getY(), 2)) ; 
		double distance2_3 = Math.sqrt(Math.pow(coord2.getX() - coord3.getX(), 2) + Math.pow(coord1.getY() - coord2.getY(), 2)) ; 
		double distance3_1 = Math.sqrt(Math.pow(coord3.getX() - coord1.getX(), 2) + Math.pow(coord1.getY() - coord2.getY(), 2)) ; 
		
		System.out.println("The distance between coord1 and coord2:" + distance1_2);
		System.out.println("The distance between coord2 and coord3:" + distance2_3);
		System.out.println("The distance between coord3 and coord1:" + distance3_1);

		
		double[] distances = new double[3];
		distances[0] = distance1_2;
		distances[1] = distance2_3;
		distances[2] = distance3_1;
		
		double smallest = distance1_2;
		
		for (int i = 0; i < distances.length; i++){
			if (distances[i] < smallest){
				smallest = distances[i];
				if (i == 0){
					System.out.println("Smallest distance in metres is between Coord1 amd Coord2");	
				}
				else if(i == 1){ 
					System.out.println("Smallest distance in metres is between Coord2 amd Coord3");	
				}
				else if(i == 2){
					System.out.println("Smallest distance in metres is between Coord3 amd Coord1");	
				}
			}
		}
		System.out.println("Smallest distance between the 3 coords is:" + smallest);
		}
	}


