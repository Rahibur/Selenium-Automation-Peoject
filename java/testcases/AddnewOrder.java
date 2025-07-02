package testcases;

import Utilities.DriverSetup;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AddOrderPageSelectors;
import pages.LoginPageSelectors;

public class AddnewOrder extends DriverSetup {
    AddOrderPageSelectors addOrderPage = new AddOrderPageSelectors();
    LoginPageSelectors loginpage = new LoginPageSelectors();
    @Test
    public void afterlogin() throws InterruptedException {
        addOrderPage.maximizeWindow();

        //Goto Rokomari.com site after login
        loginpage.loadPage(loginpage.url_1);
        loginpage.addScreenShot("Main page");
        Thread.sleep(2000);

        // Click on "বই"
        addOrderPage.getElement(addOrderPage.bookClick_locator);
        addOrderPage.clickElement(addOrderPage.bookClick_locator);
        addOrderPage.addScreenShot("Click on বই");
        Thread.sleep(2000);

        //Hover submenu
        addOrderPage.getElement(addOrderPage.submenu_locator);
        addOrderPage.hoverElement(addOrderPage.submenu_locator);
        Thread.sleep(1000);

        // Click on "হুমায়ূন আহমেদ"
        addOrderPage.getElement(addOrderPage.writer_locator);
        addOrderPage.clickElement(addOrderPage.writer_locator);
        Thread.sleep(2000);

        // Click on "Best Seller"
        addOrderPage.getElement(addOrderPage.bestSeller_locator);
        addOrderPage.clickElement(addOrderPage.bestSeller_locator);
        Thread.sleep(1000);

        Actions scroll = new Actions(getDriver());
        scroll.scrollByAmount(0, 100).build().perform();

        //Click on "সমকালীন উপন্যাস"
        addOrderPage.getElement(addOrderPage.sortingClick_locator);
        addOrderPage.clickElement(addOrderPage.sortingClick_locator);
        Thread.sleep(1000);

        // Click on "অন্যপ্রকাশ"
        addOrderPage.getElement(addOrderPage.onno_locator);
        scroll.scrollToElement(addOrderPage.getElement(addOrderPage.onno_locator)).build().perform();
        addOrderPage.getElement(addOrderPage.onno_locator);
        addOrderPage.clickElement(addOrderPage.onno_locator);
        Thread.sleep(1000);

        // Click on "বাংলা"
        addOrderPage.getElement(addOrderPage.bangla_locator);
        scroll.scrollToElement(addOrderPage.getElement(addOrderPage.bangla_locator)).build().perform();
        addOrderPage.getElement(addOrderPage.bangla_locator);
        addOrderPage.clickElement(addOrderPage.bangla_locator);
        Thread.sleep(1000);

        // Click on "View Details"
        scroll.scrollByAmount(0, 100).build().perform();
        addOrderPage.getElement(addOrderPage.clickableBook_locator);
        addOrderPage.hoverElement(addOrderPage.clickableBook_locator);
        Thread.sleep(1000);
        addOrderPage.getElement(addOrderPage.viewDetails_locator);
        addOrderPage.clickElement(addOrderPage.viewDetails_locator);
        Thread.sleep(1000);


        //Click on "Add to Cart"
        addOrderPage.getElement(addOrderPage.AddToCart_locator);
        addOrderPage.addScreenShot("Add to Cart");
        addOrderPage.clickElement(addOrderPage.AddToCart_locator);
        Thread.sleep(1000);

        //Click on "Go to Cart ->"
        addOrderPage.getElement(addOrderPage.GotoCart_locator);
        addOrderPage.addScreenShot("Go to Cart");
        addOrderPage.clickElement(addOrderPage.GotoCart_locator);
        Thread.sleep(1000);

        //Click on "অর্ডার করতে এগিয়ে যান"
        addOrderPage.getElement(addOrderPage.continueOrder_locator);
        addOrderPage.clickElement(addOrderPage.continueOrder_locator);
        Thread.sleep(1000);

        // Giving Form Input
        addOrderPage.getElement(addOrderPage.PaymentForm_locator);
        addOrderPage.clickElement(addOrderPage.PaymentForm_locator);

        addOrderPage.getElement(addOrderPage.ShippingAdd_locator);
        addOrderPage.clickElement(addOrderPage.ShippingAdd_locator);

        addOrderPage.getElement(addOrderPage.name_locator);
        addOrderPage.inputKeys(addOrderPage.name_locator,"Rahib Rahman");

        addOrderPage.getElement(addOrderPage.mobilePhone_locator);
        addOrderPage.inputKeys(addOrderPage.mobilePhone_locator,"01767766776");

        addOrderPage.getElement(addOrderPage.payment_locator);
        addOrderPage.clickElement(addOrderPage.payment_locator);

        addOrderPage.getElement(addOrderPage.country_locator);
        addOrderPage.clickElement(addOrderPage.country_locator);

        // Selecting Dropdowns
        Select dropdown_1= new Select(addOrderPage.getElement(addOrderPage.country_locator));
        Thread.sleep(1000);
        dropdown_1.selectByVisibleText("Bangladesh");
        Thread.sleep(1000);

        addOrderPage.getElement(addOrderPage.city_locator);
        addOrderPage.clickElement(addOrderPage.city_locator);
        Select dropdown_2= new Select(addOrderPage.getElement(addOrderPage.city_locator));
        Thread.sleep(1000);
        dropdown_2.selectByVisibleText("সিলেট");
        Thread.sleep(1000);

        addOrderPage.getElement(addOrderPage.area_locator);
        addOrderPage.clickElement(addOrderPage.area_locator);
        Select dropdown_3= new Select(addOrderPage.getElement(addOrderPage.area_locator));
        Thread.sleep(1000);
        dropdown_3.selectByVisibleText("ওসমানিনগর");
        Thread.sleep(1000);

        addOrderPage.getElement(addOrderPage.zone_locator);
        addOrderPage.clickElement(addOrderPage.zone_locator);
        Select dropdown4=new Select(addOrderPage.getElement(addOrderPage.zone_locator));
        Thread.sleep(1000);
        dropdown4.selectByVisibleText("সাদীপুর ইউনিয়ন");
        Thread.sleep(1000);

        //input textarea
        addOrderPage.getElement(addOrderPage.text_area_locator);
        addOrderPage.inputKeys(addOrderPage.text_area_locator,"Osmani Nagar,Sylhet");
        addOrderPage.addScreenShot("Payment order Information");
        Thread.sleep(1000);

        //Clicking CheckPoint
        addOrderPage.getElement(addOrderPage.checkPoint_locator);
        addOrderPage.clickElement(addOrderPage.checkPoint_locator);

    }
}
