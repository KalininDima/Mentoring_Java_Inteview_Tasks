package CodeWars;

public class YouOnlyNeedOne {

    public static boolean check(Object[] a, Object x) {
        for (Object each : a){
            if(each==x||each.equals(x)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Object [] a = {"13","31","1","4","5"};
        Object b = "7";
        System.out.println(check(a,b));

    }
}
