package InterviewQuestions;

public class StringFindTheUnique {
public static void main(String[] args) {
	/*
	Write a return  method that can find the unique characters from the String

			Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
	*/
	
	
	String unique = "RRefbggioplktrfgvfgr";
	System.out.println(UniqueCharacters(unique));
	
	
}

public static String UniqueCharacters (String str) {
	/*
	 String u ="";

for(String each : str.split(""))

result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
return u;

	 */
	String u ="";
	int count =0;
	for (int i =0; i<str.length();i++) {
		
		for (int j = 0; j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if(count==1) {
			u+=""+str.charAt(i);
		}
		count=0;
	}
	return u;
	
	
}
}
