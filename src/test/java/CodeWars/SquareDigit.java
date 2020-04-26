package CodeWars;

public class SquareDigit {

    public static int squareDigits(int n) {

        String  s =""+n;
        String  sn="";
        for(Character each : s.toCharArray() ){
            int v = Integer.parseInt(each.toString());
            sn+=""+(v*v);
        }
        return Integer.parseInt(sn);
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}
