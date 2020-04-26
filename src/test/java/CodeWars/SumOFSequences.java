package CodeWars;

import java.util.ArrayList;
import java.util.Collections;

public class SumOFSequences {

    public static int sequence(int[] arr) {

        ArrayList<Integer> listSum = new ArrayList<>();
        if(arr.length>0){
            int sum=0;
            for (int i =0;i<arr.length;i++){
                sum+=arr[i];
                for(int j=i+1;j<arr.length;j++){
                    sum+=arr[j];
                    listSum.add(sum);
                }
                sum=0;
            }
        } else {
            return 0;
        }

        if(Collections.max(listSum)<0){
            return 0;
        }
        return Collections.max(listSum);
    }

    public static void main(String[] args) {
        int r [] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sequence(r));
    }
}
