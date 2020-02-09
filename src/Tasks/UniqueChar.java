package Tasks;

import java.util.Scanner;

/*write a program that can find the unique characters from the 
 String
Ex:

str ="AAABBBCCCDEF";
output: "DEF"*/

public class UniqueChar {
public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner (System.in);
	String in = scan.nextLine();
	int l = in.length();
	String Uniq = "";
	int count = 0;
	int i;
	int j;
	 for (i=0;i<l;i++) {
		 count=0;
		 for(j=0;j<l;j++) {
			 if(in.substring(j, j+1).equals(""+in.charAt(i))) {
				 count++;
			 }
			
			 }
		 if(count==1) {
			 Uniq +=""+in.charAt(i);
			 }
		 
	
		 }
	
		 System.out.println(Uniq);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
