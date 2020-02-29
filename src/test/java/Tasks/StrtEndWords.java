package Tasks;

import java.util.Scanner;

public class StrtEndWords {
public static void main(String[] args) {
	/*
	 Write a program StartEndWords:
you have 2 words that must be 5 characters, and check if last
 letter of first word and first letter of second work are same.
if either one not 5 chars length:    
print "need to be exactly 5 chars length"
if last letter of 1st word and 
first letter of 2nd word match:  print "Fizz"
if they do not match:  print "Buzz - did not match"


	 */
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter two words");
	String w1 = in.nextLine();
	String w2 = in.nextLine();
	
	int l1 = w1.length();
	int l2 = w2.length();

	if (l1==5&&l2==5) {
		if ( (""+w1.charAt(w1.length()-1)).equalsIgnoreCase(""+w2.charAt(0))){
			System.out.println("Fizz");
		}else{
			System.out.println("Buzz - did not match");
		}
	}else {
		System.out.println("need to be exactly 5 chars length");
	}
	
	/*
	 int half = one.length()/2;
	
	System.out.println(""+half.length());
	*/
	
	
}
}
