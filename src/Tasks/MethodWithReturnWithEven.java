package Tasks;

public class MethodWithReturnWithEven {
public static void main(String[] args) {
	
	isEven(6);
	
}
public static boolean isEven(int n)
{
	boolean result;;
	if(n%2==0) {
		result = true;
		System.out.println(result);
	} else { 
		result =false;
		System.out.println(result);
		}
  return result;
}
}
