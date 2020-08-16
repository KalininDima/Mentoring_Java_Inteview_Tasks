package CodeWars;
public class HumanReadabletime {

    public static String makeReadable(int seconds) {
        long secondsss = 5 * 3600L;
        System.out.println(secondsss);
        System.out.println(3.56 * 3600);

        int h = 0;
        int m = 0;
        int left = 0;
        String result = "";
                h = seconds / 3600;
                result += (h>9)?h+":":"0"+h+":";
                left=seconds%3600;
                m=left/60;
                result+=(m>9)?m+":":"0"+m+":";
                left=left%60;
                result+=(left>9)?left:"0"+left;
        return result;

        /*
        public static String makeReadable(int seconds) {
        int h = seconds/60/60;
        int min = seconds/60%60;
        int sec = seconds%60;
        return String.format("%02d:%02d:%02d",h,min,sec);
         */

    }

    public static void main(String[] args) {
        System.out.println(makeReadable(11331));
    }


}
