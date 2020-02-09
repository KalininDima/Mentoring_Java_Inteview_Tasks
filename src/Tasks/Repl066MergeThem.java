package Tasks;

import java.util.Scanner;

public class Repl066MergeThem {
public static void main(String[] args) {
	  Scanner scan = new Scanner (System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	  int lw1 = word1.length();
	  int lw2 = word2.length();
	  boolean checkL = lw1==lw2;
	  String gather = "";
	  if (checkL) {
		  gather =""+ word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
		  System.out.println(gather);
	  } else { System.out.println("invalid");}
	 System.out.println(gather);
}
}