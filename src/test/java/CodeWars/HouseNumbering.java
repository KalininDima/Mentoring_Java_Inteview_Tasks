package CodeWars;

public class HouseNumbering {

    public static int houseNumbersSum(final int[] arr) {

/*
return of(arr).takeWhile(i -> i > 0).sum();
 */


        int i = 0;
        for (Integer each : arr) {
            if (each == 0)
                break;
            i += each;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] ex = new int[]{8, 2, 6, 3, 6, 1, 0, 7, 2, 1, 4, 9, 3, 1, 7, 6, 10, 5, 3, 2, 2, 8, 0, 7, 9, 2};
        System.out.println(houseNumbersSum(ex));

    }


}
