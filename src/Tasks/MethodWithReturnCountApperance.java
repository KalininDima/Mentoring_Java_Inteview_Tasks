package Tasks;

import java.util.Scanner;

public class MethodWithReturnCountApperance {
/*]
 Create a method that gets an array of strings 
 and a string, the method returns an int.

It counts how many times a string appears in 
the array and returns the count.

for example (pseudo code):
 
 
 */
	
	public static int  count_appearance(String[] arr,String t)
	  {
		int count = 0;
	  
		  for (int j = 0; j<arr.length;j++) {
			  if (arr[j].contains(t)) {
				  count++;
			  }
		  }
	  
	   return count;
	  } //end  count_appearance
	  
	
	
	
	
}



