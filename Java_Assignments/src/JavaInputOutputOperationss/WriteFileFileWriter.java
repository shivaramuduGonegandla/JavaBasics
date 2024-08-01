package JavaInputOutputOperationss;

//6. Write Text to a .txt File Using FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileFileWriter {
    public static void main(String[] args) {
        String text = "Hello, FileWriter!";
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

