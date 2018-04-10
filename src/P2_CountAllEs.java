import java.util.Scanner;

/*
ISYS 320
Name(s):Clayton Bruce
Date: 4/8/2018
*/


/* 2. Your pseudocode algorithm in here
 
Set a lower and upper case char value
set your entered string value
loop through your string see if any of the characters match
if they do 
count ++
 
 FIXED MY ISSUE IN CLASS ON 4/9/2018
 
 
 
 */

public class P2_CountAllEs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		 
		char lowerletter = 'e';
		char capsletter = 'E';
		
		String enteredString ="";
		
	
		System.out.print("Enter a string for me (will search for e's) : ");
		//When using scanners make sure you not using next use nextline FOR THE WHOLE LINE OF TEXT
		enteredString = input.nextLine();
		
		
		int count=0;
		for (int i = 0; i< enteredString.length(); i ++) {
			char character = enteredString.charAt(i);
			if((lowerletter == character)||(capsletter == character)) {
				count ++;
			}
		}

		System.out.println("There are : " + count +" e's in your string");
		
		
	}

}
