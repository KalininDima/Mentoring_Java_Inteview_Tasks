package CodeWars;

public class MaximumDivisible {

    public static int maxMultiple(int divisor, int bound) {

        for (int n = bound; n >= 0; n--) {
            if (n % divisor == 0) {
                return n;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maxMultiple(37, 200));
    }

}
