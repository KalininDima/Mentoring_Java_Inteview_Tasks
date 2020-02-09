package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class FindNonDuplicate {
public static void main(String[] args) {
	
	/*
	 Given an array nums with 7 integers every element 
	 is repeated twice - 
	 except one. Find that element and print it to console.
	 */
	Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),
    		input.nextInt(),
    		input.nextInt(),
    		input.nextInt(),
    		input.nextInt(),
    		input.nextInt(),
    		input.nextInt()};
    int count=0;
    String U = "";
    for (int each : nums) {
    	count=0;
    	for (int i = 0; i<nums.length;i++) {
    		if(each==nums[i]) {
    			count++;
    		}
    		
    	}
    	if(count==1)
    		U+=each;
    }
   
    System.out.println(U.toCharArray());
	
	
}
}
