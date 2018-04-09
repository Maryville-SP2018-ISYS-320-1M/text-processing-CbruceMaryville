/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

import java.util.Scanner;

public class P5_AvgToTwoPlaces {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.println("This program computes the average of a series of numbers.");
		
		System.out.print("How many numbers will you enter? ");
		int numbers = input.nextInt();
		
		// Initializing countOfTwos to 0 as we have not yet counted any twos
		double sum = 0;
		for( int numberIndex = 1; numberIndex <= numbers; numberIndex++ ) {
			System.out.print("Enter number " + numberIndex + ": ");
			double nextInputValue = input.nextDouble();
			
			sum += nextInputValue;
		}
		//Utilize the features of printf   and   "%.2f"
		System.out.printf("The average value is: " + ("%.2f"),(sum / numbers));
	}

}
