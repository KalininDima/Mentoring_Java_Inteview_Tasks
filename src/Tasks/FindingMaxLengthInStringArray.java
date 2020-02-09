package Tasks;

import java.util.Scanner;

public class FindingMaxLengthInStringArray {
public static void main(String[] args) {
	/*
	 Given the array words, it will print the word 
	 with the largest length. Assume that there are 
	 no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" ,
 "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa 
	
	 */
	
	Scanner input = new Scanner(System.in);
	String[] words = new String[5];
	
	for(int i = 0; i < 5;  i++) {
	  words[i] = input.nextLine();  
	} 
	int l =0; 
	String result = "";
	
	for (String each : words) {
	
		  if(each.length()<l) {
			  continue;
		  } else if (each.length()>l) {
			  l=+each.length();
			  result=each;
		  }
	  }
	System.out.println(result);
	
	
	int totalNumber = 100;
	String str3 = ""+totalNumber; //none
	
	
	
	
	
}
}
