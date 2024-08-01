package JavaInputOutputOperationss;

//9. Read Data from a Properties File

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
            System.out.println("Property value: " + properties.getProperty("key"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

