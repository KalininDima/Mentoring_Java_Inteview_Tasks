package Tasks;

import java.util.Scanner;

public class TaskNumbers {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number ");
	double num = input.nextDouble();
			if (num>0) {
				System.out.println("Positive");
			}
			if(num<0) {
				System.out.println("Negative");
			}
			if (num==0) {
				System.out.println("Zero");
			}
			
			}	
}