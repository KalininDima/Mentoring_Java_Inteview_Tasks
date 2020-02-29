package Tasks;

import java.util.Scanner;
/*
 * You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three 
characters of the word. 

Otherwise print "invalid".
 */
public class Repl065_MiddleThree {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	 String word = scan.next();
	    //YOUR CODE HERE
	    int L = word.length();
	    
	    if (word.length()>=5&&L%2!=0){
	    L=L/2;
	    System.out.println(""+word.charAt(L-1)+word.charAt(L)+word.charAt(L+1));
	
	    } else { System.out.println("invalid");}
}
}
