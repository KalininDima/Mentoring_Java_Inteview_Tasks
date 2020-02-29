package Tasks;

import java.util.Scanner;

/*
 Return the number of times that the string "java" 
 appears anywhere in the given string word.
 */
public class Repl090Count_Java {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
    String word = scan.next();
    int i = 0;
    int l = word.length();
	int count=0; 
	
	if(word.contains("java")) {
   while (word.contains("java")){
    		count++;
	word=word.replaceFirst("java","");
    
    }System.out.println(count);
}
	}
}

