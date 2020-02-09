package Tasks;

import java.util.Scanner;
/*
 * Ask user to enter two words. Print the first word, second word, second word, first word

Input:

one

two

Output:

onetwotwoone
 */
public class DuplicatIt {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter two words:");
	String one = s.nextLine();
	String two = s.nextLine();
	
	System.out.println(one.concat(two)+two.concat(one));
	
	
	
	
	

	
}
}
