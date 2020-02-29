package Tasks;

import java.util.Scanner;
/*
 Ask user to enter two words. 
 Then add them together and print. 
 But if the last letter if the first word and the first letter of the
  last word is the same, print that character once.

Input:

one

eight

Output:

oneight
 */
public class Concatination2 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter two words");

	String first = s.nextLine(), second = s.nextLine();
	String lf = ""+first.charAt(first.length()-1);
	String fs = ""+second.charAt(0);
	
	if (lf.equalsIgnoreCase(fs)) {
		System.out.println(first+second.substring(1));
	} else {System.out.println(first+second);}
	
	
	
	
	
	
}
}
