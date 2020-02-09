package Tasks;

import java.util.Scanner;

public class ArraysPrintFirstLastCharI {
public static void main(String[] args) {
	/*
	 Given a String array words, iterate through
	  each word and print first and last letter of 
	  each element in separate lines.
	 */
	
	Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),
    		input.nextLine(),
    		input.nextLine(),
    		input.nextLine(),
    		input.nextLine()};

    for (String each : words) {
    	System.out.println(""+each.charAt(0)+each.substring(each.length()-1));
    }
    	
	
	
	
	
	
	
}
}
