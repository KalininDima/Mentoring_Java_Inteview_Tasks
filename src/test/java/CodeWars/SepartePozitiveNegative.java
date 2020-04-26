package CodeWars;

import java.util.Arrays;

public class SepartePozitiveNegative {


    public static long[] wheatFromChaff(long[] values) {


        long[] n = new long[values.length];
        System.arraycopy(values, 0, n, 0, values.length);
        long temp = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0 && i != n.length - 1) {
                for (int j = n.length - 1; j >= 0; j--) {
                    if (n[j] < 0 && i < j) {
                        temp = n[i];
                        n[i] = n[j];
                        n[j] = temp;
                        break;
                    }
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        long []y = {31, 56, 5, 11, 42, 22, 11, 5, 55, 46, 4, -28,9};
        System.out.println(Arrays.toString(wheatFromChaff(y)));
    }

}
