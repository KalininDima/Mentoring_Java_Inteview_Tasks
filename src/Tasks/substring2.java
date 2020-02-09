package Tasks;

import java.util.Scanner;
/*
 Ask user to enter a word. 
 If the first or second or both letter of the word is x, 
 print the word without x(s). If x is the third letter it should be printed.
 If the first and second are x, both should be ignored.
Input:
xxode
Output:
ode
Input:
oxidex
Output:
oidex
 */
public class substring2 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter word:");
	String word = in.nextLine();
	String x = word.substring(0,1);
	String xx = word.substring(1,2);
	String xxx = word.substring(0,2);
	
	if(word.contains("x")) {
		if(xxx.contains("xx")) {
			word=word.substring(2);
			System.out.println(word);
		}
	else if(xx.contains("x")) {
			word=word.replaceFirst("x","");
		System.out.println(word);	
		} else if 
		(x.contains("x")) {
			word=word.replaceFirst("x","");
			System.out.println(word);
		}
		
	}
	
}
}
