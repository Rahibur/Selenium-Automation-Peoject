package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.ByteArrayInputStream;

import static Utilities.DriverSetup.getDriver;


public class BasePage {
    public void maximizeWindow() {
       getDriver().manage().window().maximize();
    }
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }
    // page loading
    public void loadPage(String url){
        getDriver().get(url);
    }
    //click on an Element
    public void clickElement(By locator){
        getElement(locator).click();
    }
    //Sendkeys
    public void inputKeys(By locator, String text){
        getElement(locator).sendKeys(text);
    }
    //Hover
    public void hoverElement(By locator){
        Actions hover = new Actions(getDriver());
        hover.moveToElement(getElement(locator)).build().perform();
    }
    //take screenshot
    public void addScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
