package InterviewQuestions;

/*
 1. Write a return method that can verify if a password is valid or not.

requirements:

 1. Password MUST be at least have 6 characters and should not 
 contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit

 

if all requirements above are met, the method returns true, 
otherwise returns  false
 */

public class PasswordValidation {

	public static boolean Validation(String str) {
		boolean result = false;

		int count = 0;
		if (str.contains(" ")) {
			return result = false;
		} else if (str.length() < 6) {
			return result = false;
		}

		char[] pass = str.toCharArray();

		String sc = "@#$%!^&*()_-=+/|{}[]'~`;:,.\";";
		char[] SC = sc.toCharArray();

		for (char i = '0'; i <= '9'; i++) {
			for (int j = 0; j < pass.length; j++) {

				if (pass[j] == i) {
					count++;
					break;
				}
				if(count==1) {
					break;
				}
			}
		}

		if (count == 1) {

			for (char l = 'a'; l < 'z'; l++) {

				for (int i = 0; i < pass.length; i++) {

					if (pass[i] == l) {
						count++;
						break;
					}

				}
				if (count == 2) {
					break;
				}
			}

		} else {

			return result = false;

		}

		if (count == 2) {
			for (char U = 'A'; U <= 'Z'; U++) {
				for (int i = 0; i < pass.length; i++) {
					if (pass[i] == U) {
						count++;
						break;
					}
				}
				if (count == 3) {
					break;
				}
			}
		} else {

			return result = false;

		}

		if (count == 3) {
			for (int s = 0; s < SC.length; s++) {
				for (int i = 0; i < pass.length; i++) {
					if (pass[i] == SC[s]) {
						count++;
						break;
					}
				}
				if (count == 4) {
					result = true;
					break;
				}
			}
		} else {

			return result = false;
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(Validation("===()(opa/etrwer___"));
	}
}
