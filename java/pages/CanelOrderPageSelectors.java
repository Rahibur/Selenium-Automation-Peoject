package pages;

import org.openqa.selenium.By;

public class CanelOrderPageSelectors extends BasePage {
    public By cart_locator = By.xpath("//a[@class='navigation_cartContainer__9oZWv']//*[@class='cursor-pointer']");
    public By checkbox_locator = By.xpath("//label[@class=\"custom-control-label\"]");
    public By trash_locator = By.xpath("//img[@alt='trash']");
    public By confirm_locator = By.xpath("//button[contains(text(),'হ্যাঁ')]");
}
