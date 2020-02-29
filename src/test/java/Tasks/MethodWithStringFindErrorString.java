package Tasks;

public class MethodWithStringFindErrorString {

	
	  public static boolean isError(String line) 
	  {
		  boolean result;
		  
	    if (line.substring(0,5).equals("error")){
	   result=true;
	    } else {
	    	result = false;
	    }
	  
	  return result;
	}
	  
	  public static void main(String[] args) {
		  String check = "error gga dsgf dsgf  sgdf  ds";
		System.out.println(isError(check));
	}
}
