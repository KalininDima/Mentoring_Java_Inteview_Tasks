package InterviewQuestions;

public class FiveButtons{


    static SecondClass SCobj;
    static ThirdClass TCobj;

    public static void main(String[] args) throws InterruptedException {

        SCobj = new SecondClass();
        TCobj = new ThirdClass();
        System.out.println("Main class");
        SCobj.start();
        TCobj.start();
        Thread.sleep(2000);
    }


}

class SecondClass extends Thread{

    public void run(){
        System.out.println( "Second Class");

    }



}

class ThirdClass extends Thread{

    public void run(){
        System.out.println( "Third Class");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
