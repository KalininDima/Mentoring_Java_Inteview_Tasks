package Tasks;

import java.util.Scanner;

public class TaskBiggerNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first value");
		int n1 = input.nextInt();
		
		System.out.println("Enter second value");
		int n2 = input.nextInt();
		System.out.println("Enter third number");
		
		int n3 = input.nextInt();
		
		if (n1>n2 && n2>n3) {
			System.out.println("First value " + n1 + " is greater");
		}
		
		if (n1<n2 && n2>n3) {
			System.out.println("Second value " + n2 + " is greater");
		}
		
		if (n1<n2&&n2<n3) {
			System.out.println("Third value " + n3 + " is greater");
			
		}
	
		
	}
}
