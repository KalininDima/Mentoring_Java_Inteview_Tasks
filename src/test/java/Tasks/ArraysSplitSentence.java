package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitSentence {
public static void main(String[] args) {
	/*
	 Given a String variable sentence, 
	 write code to type each word in 
	 separate lines.

	 */
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
	
    String [] newS = sentence.split(" ");
	
    for (String each : newS) {
    	System.out.println(each);
    }
	
}



}
