package Tasks;

public class MethodWithStringMergeThem {
public static void main(String[] args) {
	
	
	
	
	
	String one = "123234523459333333";
	String two = "aasasgsdfhhtrrr";
	
	String result = "";
	int lO = one.length();
	int lT = two.length();
	int rem;
	if (lT>=lO) {
	for (int i = 0;i<lO;i++) {
		result += ""+one.charAt(i);
		
		for ( int j = 0;j<lT;j++) {
			j+=i;
			result += ""+two.charAt(j);
			break;
		}
	}
	rem = lT-lO;
	result += two.substring(lT-rem);
	
	}else if (lT<=lO) {
		for (int i = 0;i<lT;i++) {
			result += ""+one.charAt(i);
			
			for ( int j = 0;j<lO;j++) {
				j+=i;
				result += ""+two.charAt(j);
				break;
			}
	}
	rem = lO-lT;
	result+= one.substring(lO-rem);
	
	}
	
	System.out.println(result);
	
		
}
}
