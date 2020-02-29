package Tasks;

import java.util.Scanner;

/*
 Given a string word, 
 if the first or last chars are 'x' or 'X',
  print the string without those 'x' or 'X' chars,  
  otherwise print the string unchanged. 
 */
public class WithoutX_x {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	
	if (word.contains("X")||word.contains("x")) {
		if ((""+word.charAt(0)).equalsIgnoreCase("x")) {
			word = word.replaceFirst(""+word.charAt(0),"");
		} if ((""+word.charAt(word.length()-1)).equalsIgnoreCase("X")) {
			word=word.replace((""+word.charAt(word.length()-1)),"");
		} System.out.println(word);
	}else {System.out.println(word);}
	
	
	
	
	
	
	
}
}
