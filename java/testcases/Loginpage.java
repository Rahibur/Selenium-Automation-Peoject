package testcases;

import Utilities.DriverSetup;
import org.testng.annotations.Test;
import pages.LoginPageSelectors;

public class Loginpage extends DriverSetup{
    LoginPageSelectors loginpage = new LoginPageSelectors();
    @Test
    public  void login() throws InterruptedException {

        //This code is to bypass OTP and make it reusable without login again
        loginpage.maximizeWindow();
        loginpage.loadPage(loginpage.url_1);
        Thread.sleep(13000);
        //click login page
        loginpage.getElement(loginpage.login_locator);
        loginpage.clickElement(loginpage.login_locator);
        Thread.sleep(2000);
        //Enter Email
        loginpage.getElement(loginpage.mail_locator);
        loginpage.inputKeys(loginpage.mail_locator,loginpage.email);
        loginpage.getElement(loginpage.nextBtn_locator);
        loginpage.clickElement(loginpage.nextBtn_locator);
        Thread.sleep(30000);
        //hover an element
        loginpage.getElement(loginpage.login_mail_locator);
        loginpage.hoverElement(loginpage.login_mail_locator);
        Thread.sleep(1000);
        //goto my profile
        loginpage.getElement(loginpage.my_profile_locator);
        loginpage.clickElement(loginpage.my_profile_locator);
        Thread.sleep(2000);
        //goto points page
        loginpage.getElement(loginpage.point_text_locator);
        loginpage.clickElement(loginpage.point_text_locator);
        Thread.sleep(1000);
        //Reload my profile
        loginpage.loadPage(loginpage.url_2);
        Thread.sleep(1000);
        //Reload points page
        loginpage.loadPage(loginpage.url_3);
        Thread.sleep(1000);
    }

}
