package Tasks;

import java.util.Scanner;
/*
Ask user to enter a word. Print "really?" 
 if the word ends with ly, print "never mind" otherwise.

Input:

Seriously

Output:

really?
*/
public class Seriosly {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter word: ");
	String word = in.nextLine();
	boolean ly = word.endsWith("ly");
	
	if(ly) {
		System.out.println("really?");
	} else {
		System.out.println("never mind");
	}
	
	
}
}
