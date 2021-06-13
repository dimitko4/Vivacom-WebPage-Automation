package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By devices = By.xpath("//*[@id='main-big-menu']/li[2]/a");
    private By mobilePhones = By.xpath("//*[@id='main-big-menu']/li[2]/ul/li[1]/div/div[2]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDevices() {
        driver.findElement(devices).click();
    }

    public MobilePhonesPage clickMobilePhones() {
        driver.findElement(mobilePhones).click();
        return new MobilePhonesPage(driver);
    }

}
