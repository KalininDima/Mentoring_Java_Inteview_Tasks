package Tasks;

import java.util.Scanner;

public class ReverseIt {
public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String l = ""+word.length();
	    //WRITE YOUR CODE HERE
	    String R = 
	    ""+word.charAt(4)
		+word.charAt(3)
		+word.charAt(2)
		+word.charAt(1)
		+word.charAt(0);
	    if(word.length()>5){
	    System.out.println("Too long!");
	    } else if (word.length()<5) {
	    	System.out.println("Too short!");
	    } else {
	    	for (int i=word.length();i<=1;i++) {
	    		R += word.charAt(i);
	    	} System.out.println(R);
	    }
}
}
