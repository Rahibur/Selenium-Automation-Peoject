package testcases;

import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CancelOrder extends DriverSetup {
    @Test
    public void cancel() throws InterruptedException {
        driver.manage().window().maximize();
        //Goto Rokomari.com site after login
        driver.get("https://www.rokomari.com/");
        Thread.sleep(2000);
        WebElement cart,checkBox,trash,confirm;
        cart = driver.findElement(By.xpath("//a[@class='navigation_cartContainer__9oZWv']//*[@class='cursor-pointer']"));
        cart.click();
        checkBox=driver.findElement(By.xpath("//label[@class=\"custom-control-label\"]"));
        checkBox.click();
        trash=driver.findElement(By.xpath("//img[@alt='trash']"));
        trash.click();
        confirm=driver.findElement(By.xpath("//button[contains(text(),'হ্যাঁ')]"));
        confirm.click();
        Thread.sleep(1000);




    }
}
