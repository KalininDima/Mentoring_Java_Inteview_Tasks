package Tasks;

import java.util.Scanner;

public class TaskSwitchStatement {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String days = "Monday";
		
		switch (days) {
		case "Monday":
			System.out.println("1. Monday");
		case "Tuesday":
			System.out.println("2. Tuesday");
		case "Wensday":
			System.out.println("3. Wednesday");
		case "Thursday":
			System.out.println("4. Thursday");
		case "Friday":
			System.out.println("5. Friday");
		case "Saturday":
			System.out.println("6. Saturday");
		case "Sunday":
			System.out.println("7. Sunday");
			break;
		
		}
		int a = 6;
		int b = a++; 
		System.out.println(a); System.out.println(b);
	
		System.out.println("Enter Laptop name");
		String laptop = in.nextLine();
		
		switch (laptop) {
		case "Apple":
			System.out.println("Apple - no virus");
			break;
		case "Acer":
			System.out.println("Cheap one");
			break;
		case "Dell":
			System.out.println("Tough one");
			break;
		default:
			System.out.println("do not buy that one!");
			break;
			
		}
		
		
		
	
		
	}
}
