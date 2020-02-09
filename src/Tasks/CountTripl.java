package Tasks;

import java.util.Scanner;

public class CountTripl {
public static void main(String[] args) {
	
	/*
	We'll say that a "triple" in a string is a char 
	appearing three times in a row. Print out the 
	number of triples in the given string. 
	The triples may overlap.
	
	 */
	
	Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int l = str.length();
    int count = 0 ;
    
    for (int i =0; i < l-2;i++) {
    if ((""+str.charAt(i)).equals(""+str.charAt(i+1))
    		&&(""+str.charAt(i)).equals(""+str.charAt(i+2))){
    		count++;
    }
    
    }
    	System.out.println(count);
    
	
	
}
}
