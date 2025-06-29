package testcases;

import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AfterLoginPage extends DriverSetup {
    @Test
    public void afterlogin() throws InterruptedException {
        driver.manage().window().maximize();
        //Goto Rokomari.com site after login
        driver.get("https://www.rokomari.com/");
        Thread.sleep(2000);

        // Click on "বই"
        WebElement bookClick;
        bookClick = driver.findElement(By.xpath("//a[@class='menu_menuLink___xE7K false text-[18px]']//span[contains(text(),'বই')]"));
        bookClick.click();
        Thread.sleep(2000);

        //Hover submenu
        Actions hover = new Actions(driver);
        WebElement submenu = driver.findElement(By.xpath("//span[contains(text(),'লেখক')]"));
        hover.moveToElement(submenu).build().perform();
        Thread.sleep(1000);

        // Click on "হুমায়ূন আহমেদ"
        WebElement writer;
        writer = driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
        writer.click();
        Thread.sleep(2000);

        // Click on "Best Seller"
        WebElement bestSeller;
        bestSeller=driver.findElement(By.xpath("//div[@class='custom-control custom-radio']//label[@for='SOLD_COUNT_DESC']"));
        System.out.println("Sorting is Enable : " + bestSeller.isEnabled());
        bestSeller.click();
        Thread.sleep(1000);

        Actions scroll = new Actions(driver);
        scroll.scrollByAmount(0, 100).build().perform();

        //Click on "সমকালীন উপন্যাস"
        WebElement sorting_click;
        sorting_click = driver.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]"));
        sorting_click.click();
        Thread.sleep(1000);

        // Click on "অন্যপ্রকাশ"
        WebElement Onno = driver.findElement(By.xpath("//label[contains(text(),'অন্যপ্রকাশ')]"));
        scroll.scrollToElement(Onno).build().perform();
        sorting_click =driver.findElement(By.xpath("//label[contains(text(),'অন্যপ্রকাশ')]"));
        sorting_click.click();
        Thread.sleep(1000);

        // Click on "বাংলা"
        WebElement bangla = driver.findElement(By.xpath("//label[@for='rok-filter-languageIds-1']"));
        scroll.scrollToElement(bangla).build().perform();
        sorting_click =driver.findElement(By.xpath("//label[@for='rok-filter-languageIds-1']"));
        sorting_click.click();
        Thread.sleep(1000);

        // Click on "View Details"
        scroll.scrollByAmount(0, 100).build().perform();
        WebElement clikableBook ;
        clikableBook = driver.findElement(By.xpath("//div[@title='নন্দিত নরকে হুমায়ূন আহমেদ']"));
        hover.moveToElement(clikableBook).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn home-details-btn btn-block transparent-background'][normalize-space()='View Details']")).click();
        Thread.sleep(1000);

        //Click on "Add to Cart"
//        WebElement AddTocart;
//        AddTocart = driver.findElement(By.xpath("//div[@class='col-span-2']//button[@id='ts--desktop-button']"));
//        AddTocart.click();
//        Thread.sleep(1000);

        //Click on "Go to Cart ->"
        WebElement GotoCart;
        GotoCart = driver.findElement(By.xpath("//span[@id='js--add-to-cart-button']"));
        GotoCart.click();
        Thread.sleep(1000);

        //Click on "অর্ডার করতে এগিয়ে যান"
        WebElement ContinureOrder;
        ContinureOrder = driver.findElement(By.xpath("//span[contains(text(),'অর্ডার করতে এগিয়ে যান')]"));
        ContinureOrder.click();
        Thread.sleep(1000);

        // Giving Form Input
        WebElement ShippingAdd,Fill,fill,last,Checkpoint,name,zone,textarea;
        driver.findElement(By.cssSelector("body > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(20) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > p:nth-child(3) > label:nth-child(2)")).click();
        ShippingAdd = driver.findElement(By.xpath("//div[@id='shipping-payment']"));
        ShippingAdd.click();
        name = driver.findElement(By.xpath("//div[@class='shipping-form-container']//input[@id='name']"));
        name.sendKeys("Rahib Rahman");
        ShippingAdd=driver.findElement(By.xpath("//fieldset[@class='group']//input[@id='phone']"));
        ShippingAdd.sendKeys("01767766776");
        ShippingAdd=driver.findElement(By.xpath("//div[@id='shipping-payment']"));
        ShippingAdd.click();
        Fill = driver.findElement(By.xpath("//select[@id='js--country']"));
        Fill.click();

        Select dropdown_1= new Select(Fill);
        Thread.sleep(1000);
        dropdown_1.selectByVisibleText("Bangladesh");
        Thread.sleep(1000);

        fill=driver.findElement(By.xpath("//select[@id='js--city']"));
        fill.click();
        Select dropdown_2= new Select(fill);
        Thread.sleep(1000);
        dropdown_2.selectByVisibleText("সিলেট");
        Thread.sleep(1000);

        last=driver.findElement(By.xpath("//select[@id='js--area']"));
        last.click();
        Select dropdown_3= new Select(last);
        Thread.sleep(1000);
        dropdown_3.selectByVisibleText("ওসমানিনগর");
        Thread.sleep(1000);

        zone = driver.findElement(By.xpath("//select[@id='js--zone']"));
        zone.click();
        Select dropdown4=new Select(zone);
        Thread.sleep(1000);
        dropdown4.selectByVisibleText("সাদীপুর ইউনিয়ন");
        Thread.sleep(1000);

        textarea=driver.findElement(By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']"));
        textarea.sendKeys("Osmani Nagar,Sylhet");
        Thread.sleep(1000);

        Checkpoint = driver.findElement(By.xpath("//label[@class='focus'][normalize-space()='Office']"));
        Checkpoint.click();

    }
}
