package Tasks;

import java.util.Scanner;
/*
 Ask user to enter a word. 
 Print true is the first and last characters of the string are same characters, 
 print false otherwise.

Input:

abba

Output:

true
 */
public class SameOrNot {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter word");
	String word = in.nextLine();
	String firstLetter =""+word.charAt(0);
	String lastLetter = ""+word.charAt(word.length()-1);
	
	if(firstLetter.equalsIgnoreCase(lastLetter)) {
		System.out.println("true");
	} else { System.out.println("false");
	}
	
	
}
}
