package InterviewQuestions;

import org.apache.commons.collections4.iterators.ArrayIterator;

import java.util.Arrays;
import java.util.Iterator;

public class DivideArayValue {


    public static void ArrayDivide(int[] arr, int number) {

        int result = 0;
        Iterator<Integer> it = new ArrayIterator<Integer>(arr);
        for (int i = number; i >= 0; i--) {
            while (it.hasNext()) {
                result+=it.next()/2;
            }
        }
        System.out.println(result/number);
    }

    public static void main(String[] args) {
        int[] a = {2,2,3,1};
        int b = 1;
        ArrayDivide(a, b);
        ArrayD(a,b);
    }

    public static void ArrayD(int [] arr, int number){



        Arrays.sort(arr);
        int t=0;
        for (int i=0;i<number;i++){
            double d = arr[arr.length-1];
            arr[arr.length-1]= (int) Math.ceil(d/2);
            Arrays.sort(arr);

        }

        for(int j=0;j<arr.length;j++){
            t+=arr[j];
        }

        System.out.println(t);

    }
}
