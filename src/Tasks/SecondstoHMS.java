package Tasks;
import java.util.Scanner;
public class SecondstoHMS {
public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
    System.out.println("Enter seconds:");
    int inputSeconds =in.nextInt(),
    hours = inputSeconds / 3600 % 60,
    minutes = inputSeconds / 60 % 60,
    seconds = inputSeconds % 60;
    System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
    
    
	
}
}
