package Tasks;

public class MethodBiggerString {
public static void main(String[] args) {
	String one = "Dima";
	String two = "Milana";
	String threee = one.length()>two.length()?one:(two.length()>one.length())?two:"equal";
	System.out.println(threee);
	
	
	
}


}
