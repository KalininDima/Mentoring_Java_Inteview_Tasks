package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	public static int fiba(int n){
		if(n<2){
			return n;
		} else { return fiba(n-1)+fiba(n-2);
		}
	}
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		    int n =20;
		 System.out.println(fiba(n));
	 }
		  
		  public static void fib(int num){
		    //WRITE YOUR CODE HERE
		    int [] list = new int[num+1];
		 
		    if(num>1) {
		    list[0] = 0;
			list[1] = 1;
		    for (int i = 2;i<list.length;i++) {
		    	 
		    	list[i]+=list[i-1]+list[i-2];
		    }
		   
		     System.out.println(list[num]);
		    } else if (num==1) {
		    	System.out.println(1);
		    } else {
		    	System.out.println(0);
		    }
		    
		  }
		}

