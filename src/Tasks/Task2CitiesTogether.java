package Tasks;

public class Task2CitiesTogether {

	public static void main(String[] args) {

		
		/*
		 * 
		 * Declare 3 String variables

            city1
            city2
            city3

Assign values:
            Tashkent
            Kyiv
            Moscow

Print:
            From Tashkent to Kyiv is $500
            From Moscow to Tashkent is $550
            I have been to Tashkent, Moscow, Kyiv.
		 */
		
		
		String city1 = " Tashkent";
		String city2 = " Kyiv";
		String city3 = " Moscow";
		
		char city$ = '$';
		int fromTtoK = 500;
		int fromMtoT = 550;
		String allCities = city1 + "," + city2 +"," + city3;
		
		System.out.println("From " + city1+ " to " +city2+ " is " + city$ + fromTtoK);
		System.out.println("From " + city3 + " to " + city1 + " is " + city$ + fromMtoT);
		System.out.println("I have been to " + allCities);
	}
}
