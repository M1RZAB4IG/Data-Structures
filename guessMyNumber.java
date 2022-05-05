//Mirza Baig
//CSC 2720

import java.lang.Math;
import java.util.Scanner;

public class guessMyNumber {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Guess my Number");
		System.out.println("please think of a number between 0 and 31");
		
		int lowerBound = 0;
		int upperBound = 31;
		
		while(true) {
			// make a guess
			int guess = (int) Math.ceil((double)(upperBound+lowerBound)/2.0);
			
			//check if guess is correct
			System.out.println("is your number" + guess + "?(Y/N): ");
			// write code below
			char answer = getChar();
			if(answer== 'Y') {
				break;
			}
			// check if answer is too high or too low
			System.out.println("Is your number (H)igher or (L)ower (H/L):");
			answer= getChar();
			if(answer == 'L') {
				upperBound= guess-1;
			}
			if(answer == 'H') {
				lowerBound=guess+1;
			}
		}
		System.out.println("Thanks for playing");
	}
	  
	private static char getChar() {
		Scanner sc = new Scanner(System.in);
		return sc.next().charAt(0);
	}
	  
}
