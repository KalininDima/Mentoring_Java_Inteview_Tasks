package Tasks;

import java.util.Scanner;
/*
 Write a program that will print out letters
  in the alphabetic order accordingly to 
  the given range within 2 chars. 
 */
public class Repl088_PrintLetters {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);
    
    
    while(start<=end) {
    	System.out.print(start);
    start++;
    
    }
    
    
    
    
    
}
}
