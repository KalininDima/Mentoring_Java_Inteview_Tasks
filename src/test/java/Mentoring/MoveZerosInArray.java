package Mentoring;

import java.util.Arrays;

public class MoveZerosInArray {
	
	/*
	 * Move all zeros on the end of the array, do  not use sort
	 */
	
//create the method with int array as a parameter
	public static void MoveZerosArray(int [] I) {

		//create another one array name R and assign the size of the a ray the length of our main int array I
	int [] R = new int[I.length];
	
	//create int variable , this variable will as iterator for our second int array in the loop
	int IteratorForR=0;
	
	//create for loop, where is initializer must be less the length of R array(its can be and I array,they have same length)
	//That initializer will as iterator for main int I array
	for (int IteratorForI=0;IteratorForI<R.length;IteratorForI++) {
		
		//create the if statement and condition will check if value of of one of the index in main I int Array not zero
		if (I[IteratorForI]!=0) {
			
			//inside  the if statement we are adding to R int array that value from int I array
			//as an index for R int array we are using IteratorFroR variable for int I array IteratorForI variable
			R[IteratorForR]=I[IteratorForI];
			
			//then increasing Iterator for R on 1
			IteratorForR++;
		
		
		}
	}
	//just print it
	System.out.println(Arrays.toString(R));
	
	}
	
	public static void main(String[] args) {
		
		//Create the array
		int [] I = new int[] {0,0,8,0,5,9,2};
		
		//Call the method 
		MoveZerosArray(I);
	}
}
