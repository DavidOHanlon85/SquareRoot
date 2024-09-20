/**
 * 
 */
package slideDeckTasks;

import java.util.Scanner;

/**
 * 
 */
public class Exercise4_SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variables
		
		double area, answer;
		
		// Prompt user
		
		System.out.println("Enter the area of a square - must be a whole number");
		
		// Instantiate Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		// Get area of square
		
		area = scanner.nextDouble();
		
		// Present the answer
		
		answer = Math.sqrt(area);
		
		System.out.printf("The square root of this number is : %.3f", answer);
		
		scanner.close();
	}

}
