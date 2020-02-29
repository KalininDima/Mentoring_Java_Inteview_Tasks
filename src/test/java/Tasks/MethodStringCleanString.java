package Tasks;

public class MethodStringCleanString {
/*
 This method gets two strings (text and badWord)  and returns a string.

basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
 */
	
	public static void main(String[] args) {
		String text = "tex text vsiakiy text ohh text da da ubiraem text";
		String badWord = "text";
		
		text = text.replace(badWord, "");
		System.out.println(text);
	}
}
