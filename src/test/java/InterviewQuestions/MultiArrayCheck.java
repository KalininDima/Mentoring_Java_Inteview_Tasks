package InterviewQuestions;

public class MultiArrayCheck {
    public static boolean checkMA(int[][] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            for (int y = 0; y < arr[j][y]; y++) {
                if (i >= arr[j][y] && i <= arr[j][y + 1]) {
                    return false;
                }
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {


        int[][] arr = new int[][]{{830, 900}, {1045, 1130}, {1300, 1330}};

        int i = 901;

        System.out.println(checkMA(arr, i));


    }
}
