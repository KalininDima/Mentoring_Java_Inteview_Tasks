package Tasks;
import java.util.Scanner;
public class TaskScanner {
public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	System.out.println("First Task");
	System.out.println("Enter one digit : ");
	double one = in.nextDouble();
	System.out.println("You entered " + one);
	System.out.println("Enter second digit" );
	double second = in.nextDouble();
	System.out.println(one+"+"+second+"="+(one+second) );
	
	System.out.println("Second Task");
	System.out.println("Enter First Digit ");
	one = in.nextDouble();
	System.out.println("Enter Socond Digit ");
	second = in.nextDouble();
	System.out.println();
	
	
}
}
