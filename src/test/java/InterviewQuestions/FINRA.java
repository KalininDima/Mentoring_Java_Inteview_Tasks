package InterviewQuestions;
/*
 Write a method which prints out the numbers from 1 to 30 
 but for numbers which are a multiple of 3, print "FIN" 
 instead of the number and for numbers which are a multiple 
 of 5, print "RA" instead of the number. for numbers which 
 are a multiple of both 3 and 5, print "FINRA" instead of the number.


 */
public class FINRA {
	
	public static void FINRa() {
		

		String result = "";

		for(int i=1; i <= 30; i++) {

		result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "

		:(i%3 == 0) ? "FIN " : i+" ";

		}

		System.out.println(result);

		}
		
	/*
	public static void FINRa () {
		String c="";
		for (int i =1;i<=30;i++) {
			if(i%3==0) {
				c+= " FIN";
			} else if (i%5==0) {
				c+=" RA";
			} else if (i%3==0&&i%5==0) {
				c+=" FINRA";
			} else {
				c+=" "+i;
			}
		}
		System.out.println(c);
	}
	*/
	
	public static void main(String[] args) {
		FINRa();
	}

}
