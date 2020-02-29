package Tasks;

public class SimplePrintPattern {
 
	
	/*Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

	*/
	 public static void printHollowRect()
	  { 
		  System.out.println("*****");
		  for (int j = 0;j<3;j++) {
			  System.out.println("     ");
			  System.out.println("*   *");
		  }
		  System.out.println("     ");
		  System.out.println("*****");
	  
		 
	   
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	  }
}
