package CodeWars;

public class NonConsecutiveNumber {

    static Integer find(final int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1 && array[i] + 1 != array[i + 1]) {
                return array[i + 1];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] p = {4, 6, 7, 8, 9, 11};

        System.out.println(find(p));
    }

}
