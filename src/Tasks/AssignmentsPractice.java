package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AssignmentsPractice {
public static void main(String[] args) {
Scanner in = new Scanner (System.in);
	
	/*System.out.println("Enter three words");
	String w1 = in.nextLine();	
	String w2 = in.nextLine();	
	String w3 = in.nextLine();
	
	int l1 = w1.length(),l2=w2.length(),l3=w3.length();
	
	if(l1==l2&&l2==l3) {
		System.out.println("All words are same length");
	} else if (l1==l2||l3==l2||l3==l1) {
		System.out.println("Not all same, some has different lengths");
	} else { System.out.println("All words have different lengths");}
	*/



   /* Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    String sentence = scan.nextLine();
    //WRITE YOUR CODE HERE
    boolean result = sentence.contains(word);
    System.out.println(result);*/


/*Scanner s = new Scanner(System.in);
String txt = s.next();
//your code here

txt = txt.substring(0,txt.length()-1);
System.out.println(txt);*/
/*
int freeBooks = 0;
Scanner scan = new Scanner(System.in);
boolean isPremiumCustomer = scan.nextBoolean();
int nbooksPurchased = scan.nextInt();

if (isPremiumCustomer) {
	if(nbooksPurchased>=5&&nbooksPurchased<8) {
		freeBooks+=1;
		
	} else if (nbooksPurchased>=8) {
		freeBooks+=2;
	} else { freeBooks=0;}
	
} else if(nbooksPurchased>=7&&nbooksPurchased<12) {
	freeBooks+=1;
} else if (nbooksPurchased>=12) {
	freeBooks+=2;
}else {freeBooks=0;}

System.out.println("Free Books: "+freeBooks);
*/



/*
int[] num1=new int[3];
int[] num2= {1,2,3,4,5};

num1=num2;
for(int i =0;i<num1.length;i++) {
	System.out.println(num1[i]);
}


int numbers[];
numbers=new int[2];
numbers[0]=10;
numbers[1]=20;
numbers=new int[4];
numbers[2]=30;
numbers[3] = 40;
System.out.println(Arrays.toString(numbers));

int[]intArr = {15,30,45,60,75};
intArr[2] = intArr[4];
intArr[4] = 90;
System.out.println(Arrays.toString(intArr));

String [] planets = {"mercury","venus","mars","earth"};
int x = planets.length;
int y = planets[1].length();
System.out.println(x+":"+y);



int arr[]= {1,2,3,4};
int i = 0;
do {
	System.out.println(arr[i]+" ");
	i++;
	
}while(i<arr.length-1);
	*/


double e =13000;

int c = (short)e;
System.out.println(c);
int r = 5;
ArrayList<Integer> a = new ArrayList<>();
a.add(r);
Integer t [] = new Integer[2];
t[0] = r;
Short y = 1;

long g =y;
Integer i = new Integer(1);

double h = i;
boolean check = h==g;
System.out.println(a);
System.out.println(Arrays.toString(t));
System.out.println(y);
System.out.println(g);
System.out.println(i);
System.out.println(h);
 
}
}
