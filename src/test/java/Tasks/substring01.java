package Tasks;

import java.util.Scanner;
/*
 Ask user to enter a word. 
 If the work contains starts with x, print the word without x.

Input:

xcode

Output:

code
 */
public class substring01 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	String word = in.nextLine().toLowerCase();
	boolean X = word.startsWith("x");
	//if ((""+word.charAt(0)).equalsIgnoreCase(""+X)) {
	if(X) {
		System.out.println(word.substring(1));
	} else {System.out.println(word);
	}
	
	
	
	
	
	
	
	
}
}
