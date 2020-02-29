package Tasks;

public class Task04SwapDigits {

/*
 * declare two variables:

int a =10;

int b= 15;

swipe those two variables value without using a temporary variable

Ex:

System.out.println(a); ===> 15

System.out.println(b); ===> 10
 */
	public static void main(String[] args) {
		int a = 10;// need 15
		int b = 15;// need 10
		/*
		 * a=b 15
		 * b=a  15 not will work
		 */
		a = a + b; // a = 25
		b = a - b; // 25 - 15 = 10; b=10;
		a= a - b; // 25 - 10 = 15;
		System.out.println(a + "\n" + b); // 15, 10
		
		
		
		
	}
	
	
	
	
	
	
	
}
