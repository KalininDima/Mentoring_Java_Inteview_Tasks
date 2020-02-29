package Tasks;

import java.util.ArrayList;

public class MethodWithArrayListSearch {
	
	public static String search(ArrayList<String> r, String find) 
	  {
		 String n = "";
		    if(r.size()>0) {
			    for (int i = 0;i<r.size();i++) {
			    	if(r.get(i).contains(find)) {
			    		n = r.get(i);
			    		return n;
			    	}
			    
			    	
			    } 
			    
		    } 
		    
		    else {
		    	return "search is failed";
		    }
		    
		    if(!r.isEmpty()) {
		    	return "search is failed"; 
		    } else {
		    	return n;
		    }
		    
		    
	  }
	  //end wineSeller
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<String>  arr = new ArrayList<String>();
	
	    
	  
	    String find_tst = search(arr,"foo");
	    System.out.print(find_tst);//foo bar
	   
	    
	  }//end main
	}

