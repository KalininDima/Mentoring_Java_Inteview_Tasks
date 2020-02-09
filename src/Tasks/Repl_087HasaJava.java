package Tasks;

import java.util.Scanner;
/*
 Given a string word, print true if "java" appears starting at index 
 0 or 1 in the string, such as with "javaxxx" 
 or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
 */
public class Repl_087HasaJava {
public static void main(String[] args) {
	boolean exists = false;
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    
    int i;
    int l = word.length();
    
    if(l>1) {
    	if((word.substring(0,4)).equals("java")){
    		System.out.println(!exists);
    	}else if((word.substring(1,5)).equals("java")) {
    		System.out.println(!exists);
    	} else {System.out.println(exists);}
    
	
    	}else {System.out.println(exists);}
}
}
