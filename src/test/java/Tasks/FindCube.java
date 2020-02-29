package Tasks;

import java.util.Scanner;

public class FindCube {
	  public static void cube()
	  {
	    //your code here
		  Scanner in = new Scanner (System.in);
		  int n1 =in.nextInt();
		  
		  System.out.println("result: "+(n1*n1*n1));
	  }//end cube
	  
	  public static void main(String[] args) {
	    
	    cube();
	    
}
}