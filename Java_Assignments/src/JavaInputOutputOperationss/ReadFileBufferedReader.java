package JavaInputOutputOperationss;

// 7. Read Text from a .txt File Using BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

