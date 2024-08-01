package JavaInputOutputOperationss;

// 2. Write Text to a .txt File Using OutputStream

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileOutputStream {
    
	public static void main(String[] args) {
        String text = "Hello, World!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

