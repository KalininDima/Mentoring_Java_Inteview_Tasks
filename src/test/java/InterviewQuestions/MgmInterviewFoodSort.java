package InterviewQuestions;
import java.util.Arrays;
//Your task is to:
//- fix the code
//- improve the poor quality of this code.
//
// (You can change anything you want
//
//The class should sort food instances and output the following lines:
//
//Potato 1
//Potato 9
//Potato 11
//Tomato 11
//Potato 12
//Potato 42
//Potato 46
//Potato 55
//Potato 77
//Tomato 121
//
public class MgmInterviewFoodSort {
    public static FOOD[] potatoes = null;
    public abstract class FOOD {
        public int size = 0;
        public String whoAMI() {
            return this.getClass().getName()
                    .substring(MgmInterviewFoodSort.class.getName().length() + 1);
        }
    }
    public class Potato extends FOOD {
        //
    }
    public class Tomato extends FOOD {
        // default size for tomato
        public int size = 121;
    }
    public void main() {
        // sort food
        final FOOD[] SORTEDFOOD = new FOOD[10];
        for (int i = 0; i < 10; i++) {
            int index_of_the_smaller_food=i;
            for (int j = i; j < 10; j++) {
                if(potatoes[index_of_the_smaller_food].size > potatoes[j].size){
                    index_of_the_smaller_food=j;
                }
                if(potatoes[index_of_the_smaller_food].size == potatoes[j].size && potatoes[index_of_the_smaller_food].whoAMI().contains("Tomato")){
                    index_of_the_smaller_food=j;
                }
            }
            SORTEDFOOD[i]=potatoes[index_of_the_smaller_food];
            potatoes[index_of_the_smaller_food]=potatoes[i];
        }
        //print result
        for (final FOOD potato : Arrays.asList(SORTEDFOOD)) {
            System.out.println(potato.whoAMI() + " " + potato.size);
        }
    }
    public static void main(final String[] args) {
        MgmInterviewFoodSort fs=new MgmInterviewFoodSort();
        potatoes = new FOOD[10];
        final Tomato p3 = fs.new Tomato();
        p3.size = 11;
        potatoes[0] = p3;
        final Tomato p9 = fs.new Tomato();
        potatoes[1] = p9;
        final Potato p0 = fs.new Potato();
        p0.size = 1;
        potatoes[2] = p0;
        final Potato p1 = fs.new Potato();
        p1.size = 42;
        potatoes[3] = p1;
        final Potato p4 = fs.new Potato();
        p4.size = 77;
        potatoes[4] = p4;
        final Potato p5 = fs.new Potato();
        p5.size = 55;
        potatoes[5] = p5;
        final FOOD p6 = fs.new Potato();
        p6.size = 46;
        potatoes[6] = p6;
        final FOOD p7 = fs.new Potato();
        p7.size = 12;
        potatoes[7] = p7;
        final Potato p8 = fs.new Potato();
        p8.size = 11;
        potatoes[8] = p8;
        final Potato p2 = fs.new Potato();
        p2.size = 9;
        potatoes[9] = p2;
        fs.main();
    }

}