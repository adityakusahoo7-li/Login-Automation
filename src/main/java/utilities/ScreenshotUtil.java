package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String name) throws IOException {
        //String path = "screenshots/" + name + ".png";
        
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String path = "/home/aditya.sahoo@apmosys.mahape/eclipse-workspace/Apmosys/screenshots/loginTest.png";
            File dest = new File(path);
            FileHandler.copy(src, dest);
        
        return path;
    }
}