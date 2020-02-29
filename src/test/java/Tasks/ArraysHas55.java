package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHas55 {
public static void main(String[] args) {
	/*
	 Given an array of ints, print true if the 
	 array contains a 5 next to a 5 anywhere in 
	 the array. If no consecutive 5s or no 5s are 
	 detected in your code then print false.
	 */
	
	
	 Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt()};
	  
	    	String num = "";
	    
	      for (int each : nums) {
	    	  num+=each;
	      } 
	      if(num.contains("55")) {
	    	  System.out.println("true");
	       } else {
	    	   System.out.println(false);
	       }
	    	
		
}
}
