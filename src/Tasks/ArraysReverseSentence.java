package Tasks;

import java.util.Scanner;

public class ArraysReverseSentence {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String sentence = "Java nu nihuya ne fun";

	String [] newS = sentence.split(" ");// if
	//String [] newS = sentence.CharAt(); will be mirror effect
	
	for (int i = newS.length-1;i>=0;i--) {
		System.out.println(newS[i]);	
		
	}
	
	
	
}
}
