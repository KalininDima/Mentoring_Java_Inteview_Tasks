package Tasks;

import java.util.Scanner;

public class Repl069_PrintHalfTwice {
public static void main(String[] args) {
	/*
	 Write a program that will print out first half of the word twice. 
	 */
	
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
    int lw = word.length()/2; 
    String two = word.substring(0,lw)+word.substring(0,lw); 
    System.out.println(two);
	
	
	
	
	
	
}
}
