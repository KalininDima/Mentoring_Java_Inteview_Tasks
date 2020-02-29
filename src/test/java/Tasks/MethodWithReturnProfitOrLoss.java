package Tasks;

public class MethodWithReturnProfitOrLoss {
/*
 c_profits gets the buyPrice(int) and sellPrice(int)
  and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

 */
	
	public static void main(String[] args) {
		
		System.out.println(c_profits(100,500));
	}
	
	 public static String c_profits (int buyPrice,int sellPrice)
	  {
	    String result = "loss",profit = "profit",noLoss="no loss";
	    if (buyPrice < sellPrice ) {
	    	result = "profit";
	    } else if (buyPrice>sellPrice) {
	    	result = "loss";
	      }
	    else { result = "no loss";
	    }
	    
	return result; 
	   
	   
	   
	  }
}
