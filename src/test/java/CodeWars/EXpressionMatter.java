package CodeWars;

public class EXpressionMatter {

    public static int expressionsMatter(int a, int b, int c)
    {
        int i = Integer.MIN_VALUE;
        int r = 0;

        r=a*b*c;
        if(r>i){
            i=r;
        }
        r=(a+b)*c;
        if (r > i) {
            i=r;
        }
        r=a+b*c;
        if(r>i){
            i=r;
        }
        r=a*(b+c);
        if(r>i){
            i=r;
        }
        r=a+b+c;
        if(r>i){
            i=r;
        }
        return i;

       // return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));

        /*
        Vector <Integer> sol = new Vector();

        sol.add(a + b + c);
        sol.add(a * b * c);
        sol.add((a+b)*c);
        sol.add(a*(c+b));

        Collections.sort(sol);

        return sol.lastElement();
         */
    }

    public static void main(String[] args) {
        System.out.println(expressionsMatter(1, 2, 3));
    }
}
