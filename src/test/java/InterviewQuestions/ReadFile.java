package InterviewQuestions;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class ReadFile {
    private static Properties properties;
    public static void main(String[] args) throws IOException {
        FileOutputStream nf = new FileOutputStream("newfile3.txt");
        nf.getChannel();
        System.out.println("==========");
        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);
        String zeile = br.readLine();
        System.out.println(zeile);
        System.out.println("==========");
        String next = "";
        File mappingsFile = new File("file.txt");
        try {
            Scanner scanner = new Scanner(mappingsFile);
            next = scanner.nextLine();
            System.out.println(next);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            next = e.getLocalizedMessage();
        }
        System.out.println("==========");
        String path = "file.txt";
        FileInputStream i = new FileInputStream(path);
        properties = new Properties();
        properties.load(i);
        System.out.println(i.getChannel());
        System.out.println("==========");

    }
}
