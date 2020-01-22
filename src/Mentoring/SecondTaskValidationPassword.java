package Mentoring;

public class SecondTaskValidationPassword {
	/*
	 * 1. Write a return method that can verify if a password is valid or not.
	 * 
	 * requirements:
	 * 
	 * 1. Password MUST be at least have 6 characters
	 * 
	 * 2. PAssword should not contain space
	 * 
	 * 3. PassWord should at least contain one upper case letter
	 * 
	 * 4. PassWord should at least contain one lowercase letter
	 * 
	 * 5. Password should at least contain one special characters
	 * 
	 * 6. Password should at least contain a digit
	 * 
	 * 
	 * 
	 * if all requirements above are met, the method returns true, otherwise returns
	 * false
	 */

	// FIRST WAY
	// creating the method which return boolean and has a String as a parameter
	public static boolean Validation(String password) {

		// creating boolean value and assign the false by default
		boolean result = false;

		// creating int whic will count how many requirements were passed.
		int count = 0;

		// create the if statement where we check does have a space our password
		if (password.contains(" ")) {

			// if true , return result (by default its false already)
			// and our method will not continue running the code after that. No sense? that
			// its already false.
			return result;

			// if first statement was false (that means that password doesnt have spaces)
			// check the length of password? if its less the 6, same return result (false by
			// default)
		} else if (password.length() < 6) {
			return result;
		}

		// if code comes to that line that mean that previous to statements were false,
		// that means that 2 first requirements passed
		// adding 2 to our count variable
		count += 2;

		// Creating the array and use the method toCharArraym i converting the main
		// string to char array. Why?
		char[] passWord = password.toCharArray();

		// Because i will compare digits from string with digits from int,and i can use
		// parseInt method,
		// but i decided that way. Here as example ? what should i type if i want to
		// check text(string) and digit(int)

		String a = "1";
		int b = 1;
//    	System.out.println((""+b).equals(""+a.charAt(0)));//true but long code
//    	System.out.println(b==a);
//    	System.out.println(a==b);
//    	System.out.println(b.equals(a));
//    	System.out.println(a.equals(b));// false, should be true

		// creating a String with value of almost all or all specific characters
		String sc = "@#$%!^&*()_-=+/|{}[]'~`;:,.\";";

		// converting this string with special characters into char array
		char[] SC = sc.toCharArray();

		// create the for loop, and check, does have a at least one digit our password.
		// Why i using char as initializer , because our string was converted char
		// array.
		for (char i = '0'; i <= '9'; i++) {

			// then inside a loop creating another one, and as a condition take
			// length of char array where we saved all characters from main string
			for (int j = 0; j < passWord.length; j++) {

				// Creating the if statement inside that loop, and check that
				// mine char array has an at least one value from char i variable. We are
				// looking for digit
				if (passWord[j] == i) {

					// if its pass , increase value of count variable on 1;
					count++;

					// then exit from the loop, because that condition already pass
					break;
				}

				// then check the value of count, it must be equals to count of passes
				// paragraphs.
				// we still need exit from current loop
				if (count == 3) {

					// if its passes, exit from current loop
					break;
				}
			}
		}

		// Before start check another requirements , check again the value of count,
		// it must be equals to count of passed requirements.
		if (count == 3) {

			// create the for loop, and check, does have a at least one lower case letter
			// our password.
			// the condition we can use a last letter of the alphabet
			for (char l = 'a'; l < 'z'; l++) {

				// inside a loop creating another one, and as a condition take
				// length of char array where we saved all characters from main string
				for (int i = 0; i < passWord.length; i++) {

					// Creating the if statement inside that loop, and check that
					// mine char array has an at least one value from char i variable. We are
					// looking for lower case letter
					if (passWord[i] == l) {

						// if its pass , increase value of count variable on 1;
						count++;

						// then exit from the loop, because that condition already pass
						break;
					}
				}

				// then check the value of count, it must be equals to count of passes
				// requirements.
				// and we still need to exit from current loop
				if (count == 4) {

					// if its passes, exit current another loop
					break;
				}
			}

			// here , if our first if statement, before the for loop, which check the count
			// of passed requirements will be false
			// we go under else statement and exit from the method, Java will stop runs the
			// code
		} else {
			return result = false;
		}

		// Before start check another requirements , check again the value of count,
		// it must be equals to count of passed requirements.
		if (count == 4) {

			// create the for loop, and check, does have a at least one upper case letter
			// our password.
			// the condition we can use a last letter of the alphabet
			for (char U = 'A'; U <= 'Z'; U++) {

				// inside a loop creating another one, and as a condition take
				// length of char array where we saved all characters from main string
				for (int i = 0; i < passWord.length; i++) {

					// Creating the if statement inside that loop, and check that
					// mine char array has an at least one value from char i variable. We are
					// looking for upper case letter
					if (passWord[i] == U) {
						// if its pass , increase value of count variable on 1;
						count++;

						// then exit from the loop, because that condition already pass
						break;
					}
				}

				// then check the value of count, it must be equals to count of passes
				// requirements.
				// and we still need to exit from current loop
				if (count == 5) {

					// if its passes, exit current another loop
					break;
				}
			}
		}

		// here , if our first if statement, before the for loop, which check the count
		// of passed requirements will be false
		// we go under else statement and exit from the method, Java will stop runs the
		// code
		else {
			return result = false;
		}

		// Before start check another requirements , check again the value of count,
		// it must be equals to count of passed requirements.
		if (count == 5) {

			// create the for loop, and check, does have a at least one special character in
			// our password.
			// the condition we can using length of char array with special characters
			for (int s = 0; s < SC.length; s++) {

				// inside a loop creating another one, and as a condition take
				// length of char array where we saved all characters from main string
				for (int i = 0; i < passWord.length; i++) {

					// Creating the if statement inside that loop, and check that
					// char array where we saved the password has an at least one value from char
					// array where we saved the special characters.
					// We are looking for special character.
					if (passWord[i] == SC[s]) {
						// if its pass , increase value of count variable on 1;
						count++;

						// then exit from the loop, because that condition already pass
						break;
					}
				}

				// then check the value of count, it must be equals to count of passes
				// requirements.
				// and we still need to exit from current loop
				if (count == 6) {
					// then assign to boolean variable truem because that last checked requirement.
					result = true;

					// exit from current loop
					break;
				}
			}

		}

		// here , if our first if statement, before the for loop, which check the count
		// of passed requirements will be false
		// we go under else statement and exit from the method, Java will stop runs the
		// code
		else {
			return result = false;
		}

		// if we are came to that line, that means that our requirements were passed and
		// last if statement
		// changed the value of our boolean variable from false to true. Returning
		// boolean value we are returning true
		return result;
	}

	// SECOND WAY
	public static boolean PassWordvalidation(String password) {

		// Create 4 String variables where we store different values
		String lowercase = "(.*[a-z].*)", uppercase = "(.*[A-Z].*)", numbers = "(.*[0-9].*)",
				specialchars = "(.*[ -/, :-@].*)";

		boolean HasLower = password.matches(lowercase), HasUppere = password.matches(uppercase),
				HasDigits = password.matches(numbers), HasSpecial = password.matches(specialchars), Valid = false;

		if (password.length() >= 6 && !password.contains(" "))

			if (HasLower && HasUppere && HasDigits && HasSpecial)

				Valid = true;

		return Valid;

	}

	// main method where we will call the method which will check the requirements
	// for password
	public static void main(String[] args) {

		// Call the method and to it string password;
		System.out.println(Validation("===(1)(opa/etrwer__P_"));
		System.out.println(PassWordvalidation("===(1)(opa/etrwer__P_"));
	}
}
