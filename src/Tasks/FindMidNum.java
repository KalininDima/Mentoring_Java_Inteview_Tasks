package Tasks;

import java.util.Scanner;

public class FindMidNum {
	 public static void main(String[] args) {
		    //WRITE YOUR CODE HERE
		    Scanner s = new Scanner (System.in);
		    System.out.println("Enter first number:");
		    int num1 = s.nextInt();
		    
		    System.out.println("Enter second number:");
		    int num2 = s.nextInt();
		    
		    System.out.println("Enter third number:");
		    int num3 = s.nextInt();
		   if(num1==num2&&num1==num3||num2==num3&&num2==num1||num3==num1&&num3==num2);{
		    if(num1>num2&&num2>num3||num3>num2&&num2>num1){
		      System.out.println("Medium value is: "+num2);
		   } else if (num1<num2&&num1>num3||num1>num2&&num2<num3){
		       System.out.println("Medium value is: "+num1);
		    } else if (num3<num2&&num3>num1||num3<num1&&num3>num2) {
		       System.out.println("Medium value is: "+num3);
		    }else{System.out.println("Some numbers are equal");}
		   }
		    
		    
		    
		    
		    
		    
		  }
		  
		  
}
