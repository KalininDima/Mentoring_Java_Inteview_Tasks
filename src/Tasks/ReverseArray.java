package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
	
	/*Given an array nums with 7 integers already assigned, 
	 write code to reverse it.
	Do not use any additional arrays or Strings.
	*/
	
	 Scanner input = new Scanner(System.in);
	    int[] nums = {
	    		input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt(),
	    		input.nextInt()};
	    
	    //TODO: write your code below
	    for (int i = 0; i<nums.length/2;i++) {
	    	int result=nums[i];
	    	nums[i]=nums[nums.length-1-i];
	    	nums[nums.length-1-i]= result;
	    	
	    	
	    }
	    
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
	
}
}
