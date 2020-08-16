package InterviewQuestions;

import java.util.Arrays;

public class Concate2ArraysIn3rdArray {
    public static void main(String[] args) {

        int [] arr = {1,2,45,5,67,8};
        int [] arr2 = {4,3,2,67,7,7,7,78,12,333,41};


//        TwoArraysIn3rdArray(arr,arr2);
        TwoArraysIn3rdArrayString(arr,arr2);
    }
    public static void TwoArraysIn3rdArray(int[]a,int[]b){
        int l = a.length+b.length;
        int[] newarr=new int [l];
        System.arraycopy(a,0,newarr,0,a.length);
        System.arraycopy(b,0,newarr,a.length,b.length);
        System.out.println(Arrays.toString(newarr));
        //return concat(stream(arr1),stream(arr2)).sum();
    }

    public static void TwoArraysIn3rdArrayString(int[]a,int[]b){
        String[] n = {Arrays.toString(a),Arrays.toString(b)};
        System.out.println(Arrays.toString(n));
    }
}
