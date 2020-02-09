package Tasks;

import java.util.Scanner;

public class ArraysCountEven {
public static void main(String[] args) {
	/*
	 Given an array nums, calculate count 
	 of even numbers in nums and print out to console.
	 */
	
	 Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt()
	    ,input.nextInt(),
	    input.nextInt(),
	    input.nextInt(),
	    input.nextInt()};
	    
	    int count = 0;
	    for (int each : nums) {
	    	if(each%2==0) {
	    		count++;
	    	}
	    }
	System.out.println(count);
	
}
}
