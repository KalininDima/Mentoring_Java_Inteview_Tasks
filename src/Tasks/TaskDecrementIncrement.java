package Tasks;

public class TaskDecrementIncrement {

	
	public static void main(String[] args) {
		
	//1.	int P = 50;
		int P = 50;
		P = --P + P++ + P-- + P++; 
		// pre	  post  post  post
		//49 +    49 +  50	+  50
		System.out.println(P); //197
		
		
		
    //2.   
		short sNum = 4;
		int R = sNum * 4 - sNum--;
		
		System.out.println(R); //12
		System.out.println(sNum);
		
		int a = 1;
		a = -a-- + a++ / -a-- * --a;
		//  post  post   post   pre
		//  -1  + 0   /  -1     -1
		// -1 + 0 * -1
		// -1 + 0
		// -1
		System.out.println(a);
		
		//3.
		
		
		
		
		
	}
	
	
}
