package Tasks;

import java.util.Scanner;

public class GetSandwich {
public static void main(String[] args) {
	/*
	 A sandwich is two pieces of bread with 
	 something in between. 
	 Print the string that is between the first and 
	 last appearance of "bread" in the given string, 
	 or return string "nothing" if there are not 
	 two pieces of bread.

	 */
	
	Scanner scan = new Scanner(System.in);
    String str = "xxbreadbread jambreadyy";
	
    int count = 0;
    String b = "bread";
    String between = "";
   
    for (int i = 0;i<=str.length()-5;i++) {
    	if((str.substring(i,i+5)).equals("bread")) {
    			count++;
    	}
    }
    if (count >=2) {
    int indexB1 = str.indexOf(b);
    str=str.replaceFirst(b, "");
    int indexB2 =str.lastIndexOf(b); 
    between=str.substring(indexB1,indexB2);
    System.out.println(between);
    } else { System.out.println("nothing");}
		
}
}
