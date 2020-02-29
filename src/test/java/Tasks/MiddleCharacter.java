package Tasks;

import java.util.Scanner;

public class MiddleCharacter {
public static void main(String[] args) {
Scanner in = new Scanner (System.in);	
	/*
	  Write a Java method to display 
	  the middle character of a string. Go to the editor
a) If the length of the string is even 
there will be two middle characters.
b) If the length of the string is odd there 
`will be one middle character.


Input:
Input a string: elephant 
Output:

The middle character in the string: ph
	 */
System.out.println("Enter word:");
	String w = in.nextLine();
	int l = w.length()/2;
	if (w.length()%2 !=0) {
		System.out.println(w.charAt(l));
	} else {
		System.out.println(""+w.charAt(l-1)+w.charAt(l));
	}

}
}
