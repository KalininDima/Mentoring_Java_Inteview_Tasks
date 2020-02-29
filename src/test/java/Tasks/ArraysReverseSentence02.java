package Tasks;

import java.util.Scanner;

public class ArraysReverseSentence02 {
public static void main(String[] args) {
	/*
	 
Given a String variable sentence, 
write code to get each word and assign to 
String reversed in reverse order. 
	 */
	Scanner input = new Scanner(System.in);
	String sentence = input.nextLine();
	
	String reversed = " ";
    //TODO: start your code here
    String [] words = sentence.split(" ");
    
    for (int i = words.length-1;i>=0;i--) {
    	reversed+=words[i]+" ";
    }
    reversed=reversed.trim();
    
    //End your code here. do not modify below statement
    System.out.println(reversed);
	
	

	
	
}
}
