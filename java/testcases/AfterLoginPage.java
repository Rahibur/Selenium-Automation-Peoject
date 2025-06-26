package testcases;

import Utilities.DriverSetup;
import org.testng.annotations.Test;

public class AfterLoginPage extends DriverSetup {
    @Test
    public void afterlogin() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.rokomari.com/");
        Thread.sleep(2000);
        driver.get("https://www.rokomari.com/my-section/point");
        Thread.sleep(1000);
        driver.get("https://www.rokomari.com/my-section/profile");

    }
}
