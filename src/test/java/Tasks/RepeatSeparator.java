package Tasks;

import java.util.Scanner;

public class RepeatSeparator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String separator = scan.next();
    int count = scan.nextInt();
    
    
    for (int i = count;i>0;--i) {
    	System.out.print(word);
    	if(count>1) {
    		System.out.print(separator);
    		count--;
    	
    	}
    }
    
    
}
}
