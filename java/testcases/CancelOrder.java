package testcases;

import Utilities.DriverSetup;
import org.testng.annotations.Test;
import pages.CanelOrderPageSelectors;
import pages.LoginPageSelectors;

public class CancelOrder extends DriverSetup {
    LoginPageSelectors loginpage = new LoginPageSelectors();
    CanelOrderPageSelectors cancelpage = new CanelOrderPageSelectors();
    @Test
    public void cancel() throws InterruptedException {
        loginpage.maximizeWindow();

        //Goto Rokomari.com site after login
        loginpage.loadPage(loginpage.url_1);
        Thread.sleep(1000);
        //click to cart
        cancelpage.getElement(cancelpage.cart_locator);
        cancelpage.clickElement(cancelpage.cart_locator);
        //click the checkbox
        cancelpage.getElement(cancelpage.checkbox_locator);
        cancelpage.clickElement(cancelpage.checkbox_locator);
        //click the trash
        cancelpage.getElement(cancelpage.trash_locator);
        cancelpage.clickElement(cancelpage.trash_locator);
        //click confirm
        cancelpage.getElement(cancelpage.confirm_locator);
        cancelpage.clickElement(cancelpage.confirm_locator);
        Thread.sleep(1000);

    }
}
