package Tasks;

import java.util.Scanner;
/*
 Ask user to enter two words. 
 Print first word without its first character then 
 print the second word without its first character.
Input:

apple

banana

Output:

ppleanana
 */
public class IgnoreFirstCharacter {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter two words");
	
	String firstWord = in.nextLine(), secondWord = in.nextLine();
	
	firstWord = firstWord.substring(1);
	secondWord = secondWord.substring(1);
	
	System.out.println(firstWord+secondWord);
	
	
}
}
