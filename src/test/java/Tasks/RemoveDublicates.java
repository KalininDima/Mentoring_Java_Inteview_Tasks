package Tasks;

import java.util.Scanner;

public class RemoveDublicates {
public static void main(String[] args) {
	
/*	Write a program that can remove the duplicates from String
	Ex:

	str = "AAABBBCC"
	output: "ABC*/
	
	Scanner scan = new Scanner (System.in);
	
	String in = scan.nextLine();
	
	String busket ="";
	int l = in.length();
	for(int i = 0;i<l;i++) {
			if (!busket.contains(in.substring(i,i+1))) {
				busket+=in.charAt(i);
			}
			
			
		}
		System.out.println(busket);
		
		
		
		
		
	
	
	
	
}
}
