package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;

    //Starting Browser
    @BeforeSuite
    public void startBrowser(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\COMPUTER WORLD\\Downloads\\chrome-win64\\chrome.exe");
        chromeoptions.addArguments("user-data-dir=C:\\Users\\COMPUTER WORLD\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
        driver=new ChromeDriver(chromeoptions);
    }
    //Close the browser
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }

}
