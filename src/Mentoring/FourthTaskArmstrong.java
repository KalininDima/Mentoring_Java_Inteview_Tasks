package Mentoring;

import java.util.Arrays;

public class FourthTaskArmstrong {
	/*
	 * Armstrong Number in Java: A positive number is called armstrong number if it
	 * is equal to the sum of cubes of its digits for example: 153 =
	 * (1*1*1)+(5*5*5)+(3*3*3) Where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
	 * So:1+125+27=153
	 */

	public static void ArmstrongFormula(int Armstrong) {
		String str = "" + Armstrong;
		int result = 0;
		String[] splited = str.split("");
		int[] i = new int[str.length()];

		for (int j = 0; j < str.length(); j++) {
			i[j] = Integer.parseInt(splited[j]);
		}

		System.out.println(Arrays.toString(i));

		for (int each : i) {
			result += each * each * each;
			System.out.println(each * each * each + "\n");
		}

		if (result == Armstrong) {
			System.out.println(
			"Thats Armstrong numbers\n" + "Actual result: " + result + "\n" + "Excpected result: " + Armstrong);
		} else {
			System.out.println("Thats not Armstrong numbers\n" + "Actual result: " + result + "\n"
					+ "Excpected result: " + Armstrong);
		}

	}

	public static void main(String[] args) {
		ArmstrongFormula(1);
	}
}
