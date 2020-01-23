package Mentoring;

import java.util.Arrays;

public class FourthTaskArmstrong {
	/*
	 * Armstrong Number in Java: A positive number is called armstrong number if it
	 * is equal to the sum of cubes of its digits for example: 153 =
	 * (1*1*1)+(5*5*5)+(3*3*3)
	 * Where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
	 * So:1+125+27=153
	 */

	//create the method with int parameters
	public static void ArmstrongFormula(int Armstrong) {
		
		//assign the armstrong value to String str
		String str = "" + Armstrong;
		
		//create int result, we will save there our results
		int result = 0;
		
		//Split the string which has a value of Armstrong to String Array
		String[] splited = str.split("");
		
		//Create the int Array with size of string str (where we saved value of Armstrong)
		int[] i = new int[str.length()];

		//creating for loop with condition j less the length of str String
		for (int j = 0; j < str.length(); j++) {
			
			//then we are taking int array and assign to value each index of that array, value each index from string array, 
			//To help us with that (converting from string to int) that parseInt method. Thi is call Un-boxing.
			i[j] = Integer.parseInt(splited[j]);
		}

		//printing that int array
		System.out.println(Arrays.toString(i));

		//create for each int loop using int array
		for (int each : i) {
			
			//addition to int result variable, methematic results, each - its value of each index our int array
			//so, we do multiplication 3 times (because the we need value of cube)
			result += each * each * each;
			
			//printing result of 3 times multiplication
			System.out.println(each * each * each + "\n");
		}
		//creating if statement with condition value with int result is equal with value int Armstrong
		if (result == Armstrong) {
			
			//if yes, printing results of variables and true 
			System.out.println(
			"Thats Armstrong numbers\n" + "Actual result: " + result + "\n" + "Excpected result: " + Armstrong);
		}
		//if not , print result of variables and false
		else {
			System.out.println("Thats not Armstrong numbers\n" + "Actual result: " + result + "\n"
					+ "Excpected result: " + Armstrong);
		}

	}

	public static void main(String[] args) {
		ArmstrongFormula(1);
	}
}
