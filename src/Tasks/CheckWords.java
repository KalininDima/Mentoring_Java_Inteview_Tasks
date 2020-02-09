package Tasks;

import java.util.Scanner;

public class CheckWords {
public static void main(System[] args) {
	
	/*
	 Write a program CheckWords:

Program accepts 3 words and :
- if they are same length:      print "All words are same
 length"
- if some same length and others not:    print "Not Same nor
 Different lengths"
- if all different length :  print "All different length"
	 */
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter three words");
	String w1 = in.nextLine();	
	String w2 = in.nextLine();	
	String w3 = in.nextLine();
	
	int l1 = w1.length(),l2=w2.length(),l3=w3.length();
	
	if(l1==l2&&l2==l3) {
		System.out.println("All words are same length");
	} else if (l1==l2||l3==l2||l3==l1) {
		System.out.println("Not all same, some has different lengths");
	} else { System.out.println("All words have different lengths");}
	
	
	

}
}
