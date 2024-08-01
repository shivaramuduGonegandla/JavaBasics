package JavaInputOutputOperationss;

//4. Write Text to a .txt File Using BufferedOutputStream

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileBufferedOutputStream {
    public static void main(String[] args) {
        String text = "Buffered Output Stream Example";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            bos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
