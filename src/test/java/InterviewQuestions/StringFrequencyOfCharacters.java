package InterviewQuestions;

public class StringFrequencyOfCharacters {
	public static void FrequencyCharacters(String a) {
		String str = "AAAAABBggDDQQELLLYY";
			int count = 0;
			String U= "";
			
			for (int i = 0; i<str.length();i++) {
				
				for (int j = 0; j<str.length();j++) {
					
					if(str.charAt(i) == str.charAt(j)) {
								count++;
						} 
				
				}
				if(count>0&&!U.contains(""+str.charAt(i))) {
					U += ""+str.charAt(i)+count;
				}
				count = 0;
				
			}
			
			System.out.println(U);
			
		}
public static void main(String[] args) {
	String ttt = "tqtqettttewfdsfggartw";
	FrequencyCharacters(ttt);
	


}

}
