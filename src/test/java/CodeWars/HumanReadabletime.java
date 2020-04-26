package CodeWars;

public class HumanReadabletime {

    public static String makeReadable(int seconds) {


        int h = 00;
        int m = 00;
        int left = 0;
        String result = "";
        h = seconds / 3600;
        left = seconds % 3600;
        m = left / 60;
        left = left % 60;

        result = h + ":" + m + ":" + left;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(makeReadable(7331));
    }


}
