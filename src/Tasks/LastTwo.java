package Tasks;

import java.util.Scanner;
/*
 Ask user to enter a word. 
 If the word has 2 or more characters, print the word.
 But print by changing the places of the last two characters.

Input:

system

Output:

systme
 */
public class LastTwo {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter two words");
	
	
	String word = in.nextLine();
	int lengthWord = word.length();
	

	
	if(lengthWord>=2) {
		String LastC = ""+word.charAt(word.length()-1);
		String SecondLastC = ""+word.charAt(word.length()-2);
		String Reverse = ""+(LastC+SecondLastC);
		String LastTwo = ""+(SecondLastC+LastC);
		word = word.replace(LastTwo,Reverse);
		System.out.println(word);
	} else { System.out.println("Enter word length more than 2 characters");
	}
	
	
	
	
}
}
