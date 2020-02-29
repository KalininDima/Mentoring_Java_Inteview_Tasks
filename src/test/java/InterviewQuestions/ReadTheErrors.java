package InterviewQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ReadTheErrors {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("/Users/dmitriykalinin/IdeaProjects/Mentoring_Java_Inteview_Tasks/file.txt"));
            while (true)
            {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
//                strLine = br.readLine();
                if (strLine==null)
                    break;
                if(strLine.contains("Error")) {
                    list.add(strLine);
                }else{
                    continue;
                }
            }
            System.out.println(Arrays.toString(list.toArray()));
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
