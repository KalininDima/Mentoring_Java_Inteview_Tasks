package CodeWars;
import java.util.Arrays;
public class DifferenceOf2 {


    public static int[][] twosDifference(int [] array) {

        int count =0;
        int c=0;
        int temp=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for(int i =0;i<array.length;i++){
            for(int j =0; j<array.length;j++){
                if(array[i]+2==array[j]){
                c++;
                }
            }
        }

        int [][]arr= new int [c][2];
        int [] ar = new int [c*2];
        for(int i =0;i<array.length;i++){
            for(int j =0; j<array.length;j++){
                if(array[i]+2==array[j]){
                 ar[count]=array[i];
                 ar[count+1]=array[j];
                 count+=2;
                    break;
                }
            }
        }
        count=0;
        for(int i =0 ;i<ar.length;i+=2){
            arr[count][0]=ar[i];
            arr[count][1]=ar[i+1];
            count++;
        }
            return arr;
    }

    public static void main(String[] args) {
        int [] u = {1, 2, 3, 4};
        System.out.println(Arrays.deepToString(twosDifference(u)));
    }

}
