package Tasks;

import java.util.Scanner;
/*
 Ask user to enter two words. If the first word has even number of characters,
  print the first half of the first word, 
  print the second word and print the second half of the first word.

Input:

banana

apple

Output:

banappleana


 */
public class MAkeSandwich {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter two words");
	String firstWord = in.nextLine(),secondWord = in.nextLine();
	int lengthFirstWord = firstWord.length()/2;
	String part1 = firstWord.substring(0,lengthFirstWord);
	String part2 = firstWord.substring(lengthFirstWord);
	
	if(firstWord.length()%2 ==0) {
		System.out.println(part1+secondWord+part2);
	} 
	else { System.out.println(firstWord+secondWord);
	}
	
	
	
	
}
}
