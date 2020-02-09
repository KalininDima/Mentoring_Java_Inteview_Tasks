package Tasks;

public class MethodWithReturnHamletLogic {
public static void main(String[] args) {
	boolean hamlet = hamletQuote(false,true);
	System.out.println(hamlet);
}
	/*
	 The danish prince most famous quote is "to be or not to be". 
	 thats a classic example of boolean logic.
	the hamletQuote method only returns true if one of  
	or both of the boolean parameters is true.

	 */
	
	public static boolean hamletQuote(boolean toBe,boolean notToBe)
	  {
	     if (toBe==true||notToBe==true) {
	    	 return true;
	     } else {
	    	 return false;
	     }
	  }
	
}
