package pages;

import org.openqa.selenium.By;

public class LoginPageSelectors extends BasePage{
    public String url_1 = "https://www.rokomari.com/";
    public By login_locator = By.xpath("//a[normalize-space()='Sign In']");
    public By mail_locator = By.xpath("//input[@placeholder='Email or phone']");
    public String email = "rokotest@yopmail.com";
    public By nextBtn_locator = By.xpath("//button[@id='js--btn-next']");
    public By login_mail_locator = By.xpath("//span[normalize-space()='Hello,rok****com']");
    public By my_profile_locator = By.xpath("//a[normalize-space()='My Profile']");
    public By point_text_locator = By.xpath("//span[@class='points__text']");
    public String url_2 = "https://www.rokomari.com/my-section/point";
    public String url_3 = "https://www.rokomari.com/my-section/profile";

}
