package Tasks;

import java.util.Scanner;

public class TaskGreaterNumber {

	
	public static void main(String[] args) {
				
				
		Scanner input = new Scanner(System.in);
		double max;
		System.out.println("Enter number 1 ");
		double num1 = input.nextDouble();
		System.out.println("Enter number 2 ");
		double num2 = input.nextDouble();
		
		if (num1>num2){
			max = num1;
			System.out.println("You max vallue " + max);
		}
		
		if (num2>num1) {
			max = num2;
			System.out.println("You max vallue " + max);
		}
		if (num2==num1) {
			
			System.out.println("Both digigts " + num1 + " " + num2+ " equal to each other");
		}
	}
	
			
		}
		
