package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties prop;

    public static void loadConfig() throws IOException {
        
            prop = new Properties();
            FileInputStream fis = new FileInputStream("configs/config.properties");
            prop.load(fis);
        
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}