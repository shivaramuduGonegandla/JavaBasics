package JavaInputOutputOperationss;

// 1. Read Text from a .txt File Using InputStream

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileInputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

