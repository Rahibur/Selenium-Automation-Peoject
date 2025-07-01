
package testcases;

import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CancelOrder extends DriverSetup {
    @Test
    public void cancel() throws InterruptedException {
        getDriver().manage().window().maximize();
        //Goto Rokomari.com site after login
        getDriver().get("https://www.rokomari.com/");
        Thread.sleep(1000);
        WebElement cart,checkBox,trash,confirm;
        cart = getDriver().findElement(By.xpath("//a[@class='navigation_cartContainer__9oZWv']//*[@class='cursor-pointer']"));
        cart.click();
        checkBox=getDriver().findElement(By.xpath("//label[@class=\"custom-control-label\"]"));
        checkBox.click();
        trash=getDriver().findElement(By.xpath("//img[@alt='trash']"));
        trash.click();
        confirm=getDriver().findElement(By.xpath("//button[contains(text(),'হ্যাঁ')]"));
        confirm.click();
        Thread.sleep(1000);

    }
}
