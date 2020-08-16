package CodeWars;

import java.util.stream.IntStream;

public class SquareSumOfArray {

    public static int squareSum(int[] n)
    {
        int r =0;
        for (Integer each : n){
            r+=Math.pow(each,2);
        }
        return r;
/*
        return Arrays.stream(xs).map(x -> x * x).sum();
*/
    }

}
