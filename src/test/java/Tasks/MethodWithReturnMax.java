package Tasks;

public class MethodWithReturnMax {
public static void main(String[] args) {
	/*
	 max function gets two ints, x and max.
x is the test case, max is what we test against.

if  x is bigger then max return max
in any other case return x.
	 */
	int n = max(5,10);
 
	
}
public static int max(int x,int  max)
{
  int f = 0;
  if (x>max){
    f = max;
    System.out.println(f);
  } else { f = x;
  System.out.println(f);
    
  } 
  
  return f;
}
}
	
	
	


