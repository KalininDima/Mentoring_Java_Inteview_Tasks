package Tasks;

import java.util.Scanner;
/*
 Ask user to enter two words. 
 Then add them together and print.

Input:

one

eight

Output:

oneeight
 */
public class Concatination1 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter two words:");
	String one = s.nextLine(),second = s.nextLine();	
	String gather = one.concat(second);
	System.out.println(gather);
}
}