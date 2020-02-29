package Tasks;

import java.util.Scanner;

public class TaskArithmaticOperators {
	
public static void main(String[] agrs) {
 //T1
	int outcome = 12 + 6 / 3;
	System.out.println(outcome);
	
	//T2
	int int1 = (5 + 2 ) * 4;
	int int2 = 10 / (5-3);	
	
	//T3
//	 Write a Java program that will print a sum of two numbersPlease use variables to store
//	 num1,num2,and sumSample output:46 + 90 = 136
	int num1 = 432, num2 = 231;
	int num3 = num1 + num2;
	System.out.println(num3);
	
	//T4;
	//Write a Java program to convert Fahrenheit to Celcius
	Scanner inputC = new Scanner (System.in);
			System.out.println("Enter Celsium : ");
			int C = inputC.nextInt();
			int F = 9 * C / 5 + 32;
	
	System.out.println(F);
	
	//T5
	//Write a Java program that converts mile to km
	
	Scanner inputM = new Scanner (System.in);
	System.out.println("Enter mile : ");
	double M = inputM.nextInt();
	double K = M * 1.609344;
	System.out.println(K);
	
	
	
}
}
