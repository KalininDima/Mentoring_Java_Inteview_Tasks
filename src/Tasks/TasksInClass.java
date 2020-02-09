package Tasks;

public class TasksInClass {

	public static void main(String[] args) {
		//Task1GreaterNumber
		int num1=300;
		int num2=300;
		int max = 0; // local variables need to bee initializade before
		
		if (num1>num2) { //means that num1 is greater than num2
			//false
			max = num1;
			
		}
		if (num1<num2) {
			//true
			max = num2;
		}
		
		if ( num1 == num2) {
			max = num1;
		System.out.println("Both values equal");
			
		}
		
		
		System.out.println("Maximum number between " + num1 + " and " + num2+  " is " + max);
		
	//Task02Time
		
		int hours = 12;
		int minutes = 45;
		int seconds = 30;
		
		String amOrPm = "am";
		
		System.out.println(hours + ":" +minutes+ ":"+seconds+ " " + amOrPm);
		//
		
		//Task03BiggerNumber
		//solution 1
		int n1=100,n2=500,n3 = 700;
		int maximum = 0;
		
		/*
		 * in order top n1 be the maximum : n1>n2&&n1>n3
		 * in order top n2 be the maximum : n2>n1&&n2>n3
		 * in order top n3 be the maximum : n3>n1&&n3>n2
		 */
		
		if (n1>n2&&n1>n3) {
			maximum = n1;
		}
		
		if(n2>n1&&n2>n3) {
			maximum=n2;
		}
		
		if(n3>n1&&n3>n2) {
			maximum = n3;
			
		}
		System.out.println("Maximum number between "+ n1+ ", " +n2+" and " +n3+ " is " + maximum);
		
		//solution 2
		if (n1>n2&&n1>n3) {
			System.out.println("Maximum number is " + n1);
		}
		
		if(n2>n1&&n2>n3) {
			System.out.println("Maximum number is " + n2);
		}
		
		if(n3>n1&&n3>n2) {
			System.out.println("Maximum number is " + n3);
			
		}
		
		int A;
			A=12;
		System.out.println(A);
		
		//Task4HTTPS
		int statusCode = 200;
		String finalResult = "";
		if (statusCode ==200) {
			finalResult = "ok";
		
		}
		if (statusCode==201) {
			finalResult="created";
			
		}
		if(statusCode ==404) {
			finalResult = "Not found";
		}
		System.out.println("status code " + statusCode+" is: "+ finalResult);// if not here, paste 
		//it to each IF block
		
		//Task5Numbers
		//solution1
		int number = 1;
		String str="zero";
		
		/*
		 * number to be positive: number>0, 
		 * number to be negative: number < 0
		 * number to be zero: number ==0
		 * 
		 * 
		 */
		if (number>0) {
			str = "positive";
			
		}
		if (number<0) {
			str = "negative";
			
		}
		
		System.out.println(number+" is " + str);
		
		//solution2
		int number2=677;
		
		if(number2>0) {
			System.out.println("Positive");
			
		}
		if(number2<0) {
			System.out.println("Negative");
			
		}
		if(number2==0) {
			System.out.println("Zero");
		}
		}
		
	}
	