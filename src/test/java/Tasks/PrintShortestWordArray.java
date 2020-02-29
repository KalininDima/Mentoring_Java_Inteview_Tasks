package Tasks;

import java.util.Scanner;

public class PrintShortestWordArray {
public static void main(String[] args) {
	
	/*
	 
	 Write a program that will print the 
	 shortest word in the given array str. 
	 
	 */
	
	Scanner scan = new Scanner(System.in);
	 String[] str = {scan.next(), scan.next(), scan.next(), 
             scan.next(), scan.next(), scan.next()};
    
	   String shortW = "";
		int min = 999999990;
		shortW=""+str[0];
	   	for (int i = 0;i<str.length;i++) {
	   		
	   		if(str[i].length()-1<min
	   		&&shortW.length()-1>=str[i].length()-1) {
	   			shortW=""+str[i];
	   		}
	   		
	   	}
	   	
	   	System.out.println(shortW);
	   	
	   	


  
	

}
 

}
