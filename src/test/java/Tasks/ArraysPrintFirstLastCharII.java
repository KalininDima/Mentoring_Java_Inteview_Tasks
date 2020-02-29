package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintFirstLastCharII {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),
    		input.nextLine(),
    		input.nextLine(),
    		input.nextLine(),
    		input.nextLine()};
    
    
    	 for (int i = 0; i<=words.length-1;i++) {
    		words[i] =""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
   
    	 }

    
    System.out.println(Arrays.deepToString(words));
    
}
}
