package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewBuyingPage {

    private WebDriver driver;
    private By devices = By.xpath("//*[@id='vivacom-devices-navbar']/a");
    private By accessories = By.xpath("//*[@id='vivacom-devices-navbar']/ul/li[1]/ul/div[6]/li/div/div[2]/a");

    public NewBuyingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDevices() {
        driver.findElement(devices).click();
    }

    public AccessoriesPage clickAccessories() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(accessories).click();
        return new AccessoriesPage(driver);
    }

}
