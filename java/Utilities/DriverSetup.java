package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class DriverSetup {
    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    public static void setDriver(WebDriver driver) {
        DriverSetup.DRIVER_THREAD_LOCAL.set(driver);
    }
    public static WebDriver getDriver() {
        return DRIVER_THREAD_LOCAL.get();
    }
    @BeforeMethod
    public void startbrowser() {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setBinary("C:\\Users\\COMPUTER WORLD\\Downloads\\chrome-win64\\chrome.exe");
        chromeoptions.addArguments("user-data-dir=C:\\Users\\COMPUTER WORLD\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
        ChromeDriver driver = new ChromeDriver(chromeoptions);
        setDriver(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        getDriver().quit();
    }




}