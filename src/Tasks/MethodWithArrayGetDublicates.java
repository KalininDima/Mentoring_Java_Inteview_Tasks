package Tasks;

import java.util.Arrays;

public class MethodWithArrayGetDublicates {

	
	public static int getDup(String [] r) {
		int count = 0;
		int countm = 0;
		for (int i = 0;i<r.length;i++) {
			for (int j = 0; j < r.length;j++) {
				if(r[i].equals(r[j])) {
				count++;
					
				}	
			}
		if(count>1) {	
			countm++;
			}
			count = 0;
		}
		return countm;
	}
	public static void main(String[] args) {
		String[] e = {"1","2","aa","1", "aa","1","aa","aaa1","aaaaaa1a","111","1","111","2"};
		System.out.println(getDup(e));
	}
}
