package pages;

import org.openqa.selenium.By;

public class AddOrderPageSelectors extends BasePage{

    public By bookClick_locator = By.xpath("//a[@class='menu_menuLink___xE7K false text-[18px]']//span[contains(text(),'বই')]");
    public By submenu_locator = By.xpath("//span[contains(text(),'লেখক')]");
    public By writer_locator = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
    public By bestSeller_locator = By.xpath("//div[@class='custom-control custom-radio']//label[@for='SOLD_COUNT_DESC']");
    public By sortingClick_locator = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By onno_locator = By.xpath("//label[contains(text(),'অন্যপ্রকাশ')]");
    public By bangla_locator = By.xpath("//label[@for='rok-filter-languageIds-1']");
    public By clickableBook_locator = By.xpath("//div[@title='নন্দিত নরকে হুমায়ূন আহমেদ']");
    public By viewDetails_locator = By.xpath("//a[@class='btn home-details-btn btn-block transparent-background'][normalize-space()='View Details']");
    public By AddToCart_locator = By.xpath("//div[@class='col-span-2']//button[@id='ts--desktop-button']");
    public By GotoCart_locator = By.xpath("//span[@id='js--add-to-cart-button']");
    public By continueOrder_locator = By.xpath("//span[contains(text(),'অর্ডার করতে এগিয়ে যান')]");
    public By PaymentForm_locator = By.cssSelector("body > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(20) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > p:nth-child(3) > label:nth-child(2)");
    public By ShippingAdd_locator = By.xpath("//div[@id='shipping-payment']");
    public By name_locator = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By mobilePhone_locator = By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By payment_locator = By.xpath("//div[@id='shipping-payment']");
    public By country_locator = By.xpath("//select[@id='js--country']");
    public By city_locator = By.xpath("//select[@id='js--city']");
    public By area_locator = By.xpath("//select[@id='js--area']");
    public By zone_locator = By.xpath("//select[@id='js--zone']");
    public By text_area_locator = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
    public By checkPoint_locator = By.xpath("//label[@class='focus'][normalize-space()='Office']");


}
