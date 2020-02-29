package Tasks;

public class MethodReverseString {
public static void main(String[] args) {
	
	String q = "valia";
	String newq = "";
	for (int a  = q.length()-1;a>=0;a--) {
		newq+=q.charAt(a);
	}
	System.out.println(newq);
}
}
