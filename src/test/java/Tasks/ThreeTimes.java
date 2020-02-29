package Tasks;
/*
 Ask user to enter a word. If the word has 2 more more characters,
 print first 2 characters of the word three times Input:

apple

Output:

apapap 
 
 */

import java.util.Scanner;

public class ThreeTimes {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter word:");
	String word = in.nextLine();
	int lengthWord = word.length();
	 
	if(lengthWord>2) {
	String firstTwo = word.substring(0,2);
	String ConcatFirstTwo =""+(firstTwo+firstTwo+firstTwo); 
	System.out.println(ConcatFirstTwo);
	}
	else {System.out.println(word);}
	
	
	
}
}
