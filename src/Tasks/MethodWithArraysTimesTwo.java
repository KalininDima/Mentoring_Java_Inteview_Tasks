package Tasks;

import java.util.ArrayList;
import java.util.Arrays;


public class MethodWithArraysTimesTwo {
public static void main(String[] args) {
	
	ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,3,3,4,4));
	timesTwo(nums1);
}

public static void timesTwo(ArrayList<Integer> nums) {
	
	
	for (int i = 0;i<nums.size();i++) {
		nums.set(i,nums.get(i)*2);
		
	}
	System.out.println(nums);
}
}
