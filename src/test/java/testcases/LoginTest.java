package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import utilities.CommonMethods;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.ExtentManager;
import utilities.ScreenshotUtil;

public class LoginTest {
	
    public static void main(String[] args) throws IOException {

    	ExtentReports report = ExtentManager.getReport()                       ;
    	ExtentTest test = report.createTest("SauceDemo Login Test");

        ConfigReader.loadConfig();
        String url = ConfigReader.getProperty("url");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        
        try {
        	String username = ExcelReader.getData(1,0);
        	String password = ExcelReader.getData(1,1);

        	CommonMethods.enterText(driver.findElement(By.id("user-name")), username);
        	CommonMethods.enterText(driver.findElement(By.id("password")), password);
        	
        	CommonMethods.clickElem(driver.findElement(By.xpath("//input[@type='submit']")));
        	
        	String screenshotPath = ScreenshotUtil.captureScreenshot(driver, "loginTest");
        	test.addScreenCaptureFromPath(screenshotPath);
        	
        	test.pass("Passed", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch(Exception e) {
        	test.fail("Failed");
        } finally {
            report.flush();
		}
    }
}