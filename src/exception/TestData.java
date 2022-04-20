package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class TestData {

    // Creates a file of test data that consists of ten lines
    // each containing ten integer values in the range 10 to 99.
    public static void main(String[] args) throws FileNotFoundException {

        final int MAX = 10;
        int value;
        String fileName = "test.txt";
        Random rand = new Random();
        PrintWriter outFile = new PrintWriter(fileName);

        for (int line=1; line <=MAX; line++) {
            for (int num=1; num <= MAX; num++) {
                value = rand.nextInt(90)+10;
                outFile.print(value +" ");
            } outFile.println();
        }
        outFile.close(); //close() 안넣으면 파일에 데이터 제대로 안들어감
        System.out.println("Output file has been created: " + fileName);
    }
}
