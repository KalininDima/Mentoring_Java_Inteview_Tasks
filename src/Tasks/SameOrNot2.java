package Tasks;

import java.util.Scanner;
/*
 Ask user to enter two words.
  Print true is the first two characters of the first word and 
  last two characters of the second word are same characters, print false otherwise.

Input:

banana

abba

Output:

true


 */
public class SameOrNot2 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter two words");
	String word1 = in.nextLine();
	String word2 = in.nextLine();
	
	String FirstTwoLettersFirstWord = word1.substring(0,2);
	String FirstLetterSecondWord = ""+word2.charAt(word2.length()-2);
	String SecondLetterSecondWord = ""+word2.charAt(word2.length()-1);
	
	String FirstTwoLettersSecondWord = FirstLetterSecondWord.concat(SecondLetterSecondWord);
	String FirstTwoLettersSecondWord2 = SecondLetterSecondWord.concat(FirstLetterSecondWord);
	
	boolean CheckLetters = FirstTwoLettersFirstWord.equalsIgnoreCase(FirstTwoLettersSecondWord);
	boolean CheckLetters2 = FirstTwoLettersFirstWord.equalsIgnoreCase(FirstTwoLettersSecondWord2);
	
	if(CheckLetters||CheckLetters2){
		System.out.println("true");
	} else {
		System.out.println("false");
	}
	
}
}
