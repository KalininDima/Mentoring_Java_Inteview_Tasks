package CodeWars;

public class FiveBiggerNumbers {

    public static int solve(final String digits) {

        int r = 0;
        int step=0;
        String result="";
        for (int i =0; i<digits.length();i++){
            result=""+digits.charAt(i);
            for (int j=i+1;j<digits.length();j++){
                ++step;
                if(step==5) {
                    step=0;
                    break;
                }
                    result+=""+digits.charAt(j);
                if(r<Integer.parseInt(result)){
                    r=Integer.parseInt(result);
                }
            }
        }
        return r; // you code here
    }

    public static void main(String[] args) {
        System.out.println(solve("0123456789"));

    }


}
