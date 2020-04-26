package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;


class A {
    public Number getNumber(){
        return 1;
    }
        }
        class B extends A{
    public int getNumber(){
        return 2;
    }
        }
public class Main{
    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.getNumber());
    }
}
Collapse