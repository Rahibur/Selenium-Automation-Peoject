package testcases;

import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Loginpage extends DriverSetup {

    @Test
    public  void login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.rokomari.com/");
        Thread.sleep(4000);

        //click login page
        WebElement login;
        login = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
        login.click();
        Thread.sleep(2000);

        //Enter Email
        WebElement mail;
        mail = driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
        mail.sendKeys("sabito7186@decodewp.com");
        driver.findElement(By.xpath("//button[@id='js--btn-next']")).click();
        Thread.sleep(30000);

        Actions scroll = new Actions(driver);
        WebElement hover= driver.findElement(By.xpath("//span[normalize-space()='Hello,sab****com']"));
        scroll.moveToElement(hover).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='points__text']")).click();
        Thread.sleep(1000);
        driver.get("https://www.rokomari.com/my-section/point");
        Thread.sleep(1000);
        driver.get("https://www.rokomari.com/my-section/profile");

    }

}
