package Tasks;

public class MethodWithString3Char {
public static void main(String[] args) {
	
	String target = "Dima";
	String  word= "Valiarqw";
	
	
	String g =word.substring(0,3)+target+word.substring(3,word.length());
	System.out.println(g);
	
}
}
