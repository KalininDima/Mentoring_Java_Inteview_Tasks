package Tasks;

import java.util.Scanner;

public class FrequencyOfCharacters {
public static void main(String[] args) {
	
	/*
	 Write a program that can 
	 find the frequency of characters in String
ex:

str ="AAABBCDDDDEE";
output:  A3B2C1D4E2
	 */
	Scanner sc = new Scanner (System.in);
	String characters = sc.nextLine();
	int l = characters.length()-1;
	
	
	
	String newC = "";
	int count = 0;
	
	String countI;
	for (int i = 0; i<=l;i++ ) {
		for(int j = 0; j<=l;j++) {
			if(characters.substring(i,i+1).equals(""+characters.charAt(j))){
				count++;		
			} 
			if(count==1&&!newC.contains(""+characters.charAt(i))) {
			newC+=""+characters.charAt(i);
			}	
			
		}
		countI=""+characters.charAt(i)+count;
		if(!newC.contains(""+countI)){
			newC+=count;
	}
		countI="";
		count=0;
	}
	System.out.println(newC);

	
}
}
