/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

import java.util.Scanner;

public class P4_LongestInputString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		
		System.out.print("How many words will you enter? ");
		int numOfWords = input.nextInt();
		
		
		for(int i =0; i< numOfWords; i++) {
			System.out.println("Enter String :" +i);
			String[] words = {input.next()};//IS this where my problem is???
		}
		
		
		//CONFUSED ON WHY THIS ISNT WORKING, 
		findBiggest(String[] words);
		
	}
	
	
	
	
	public static String findBiggest(String[] words) {
		String biggest = "";
		int biggestLen = 0;
		
		for(int i = 0; i < words.length; i ++) {
			if(words[i].length() > biggest.length()) {
				biggest = words[i];
				biggestLen = words[i].length();
			}
		}
		return biggest + "("+biggestLen+")";
	}
	
}
