package Tasks;

import java.util.Scanner;

public class FirstAndLastLetter {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    char first = word.charAt(0);
	    String last = ""+word.charAt(word.length()-1);
	    System.out.println(first+last);
	  }
}
