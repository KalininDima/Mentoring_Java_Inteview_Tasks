package Tasks;

import java.util.Scanner;

public class RepeatSeparator2 {
public static void main(String[] args) {
	
	
	/*
	 Given two strings, word and a separator sep,

Scanner scan = new Scanner(System.in);
String word = scan.next();
String separator = scan.next();

int count = scan.nextInt( );

 

return a big string made of count occurrences of the word, separated by the separator string.

 

Example:
input: Word
input: X
input: 3
output: WordXWordXWord
 
Example:
input: This
input: And
input: 2
output: ThisAndThis
 
Example:
input: This
input: And
input: 1
output: This
	 */
	

Scanner scan = new Scanner(System.in);
String word = scan.next();
String separator = scan.next();

int count = scan.nextInt( );

String result="";
for (int i = 0;i<=count;i++) {
	result+=word;
	if(i<count) {
		result+=separator;
		
	}
}

System.out.println(result);
	
	
	
}


}
