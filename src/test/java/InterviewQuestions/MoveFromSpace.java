package InterviewQuestions;

public class MoveFromSpace {


    public static void MoveBackFromSpaces(String r, int inx){
        r=r.substring(0,r.lastIndexOf(" ",inx));
        System.out.println(r);

    }

    public static void main(String[] args) {
        MoveBackFromSpaces("qwert trew gfsgdffdgs gpt adf",21);
        String s = "qwert        trew    gfsgdffdgs     gpt      adf";
      s=s.replaceAll("( )+"," ");
        System.out.println(s);


    }


}
