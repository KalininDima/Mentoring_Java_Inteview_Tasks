package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Method8SplitPersonInfo {

	/*
	 The method person get a string with this format :
	  "name,last name,age"
for example: 
	 */
	
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			
				//your code here
				
			String  arr [] = info.split(",");
		
			String info2 ="personal name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2];
			System.out.println(info2);
				
				
				}//end person
			  
			
			
}
