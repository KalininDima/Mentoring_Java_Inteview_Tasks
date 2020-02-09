package Tasks;

public class Tripple {
public static void main(String[] args) {
	 
	/*
	 a "triple" in a string is a char appearing three times in a row.
Write a program that can print out the number of triples in the given string. 
Example:
input: abcXXXabc
output: 1
 
Example:
input: xxxabyyyycd0
output: 3
 
Example:
input: java
output:  
	 
	 */
	
	
	
	String str = "xxxabyyyycd0";
	int count = 0;
	int result = 0;
	

		for ( int j = 0; j<str.length()-2;j++) {
			if ((""+ str.charAt(j)).equals(""+str.charAt(j+1)) && (""+str.charAt(j)).equals(""+str.charAt(j+2))) {
				result++;
			}
		}
	System.out.println(result);
}



}
