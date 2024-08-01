package JavaInputOutputOperationss;

//8. Write Text to a .txt File Using BufferedWriter

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileBufferedWriter {
    public static void main(String[] args) {
        String text = "BufferedWriter Example";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

