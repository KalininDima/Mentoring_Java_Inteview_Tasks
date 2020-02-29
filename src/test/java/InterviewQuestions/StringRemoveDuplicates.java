package InterviewQuestions;

public class StringRemoveDuplicates {
	/*
	 * Write a return method that can remove the duplicated values from String
	 */
	
	public static void RemoveDuplicates (String r) {
		
			String str =""; 
			
		for (int i =0;i<r.length();i++) {
			for (int j =0;j<r.length();j++) {
				if(r.charAt(i)==r.charAt(j)&&!str.contains(""+r.charAt(i))) {
					str+=""+r.charAt(i);
				}
			}
		}
		System.out.println(str);
		
			
	}
	
public static void main(String[] args) {
	String d = "aarrrttyueooepppfvvfbggm";
	RemoveDuplicates(d);
}
}
