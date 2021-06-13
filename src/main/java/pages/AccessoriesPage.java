package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage {

    private WebDriver driver;
    private By appleFilter = By.xpath("//*[@id='filter-manufacturer']/label[2]/span[1]");
    private By priceFilter = By.xpath("//*[@id='filter-price']/label[2]/span[1]");
    private By appleHeadphonesWithLighting = By.xpath("/html/body/div[22]/div/div/div/div[3]/div[1]/div/div/a");

    public AccessoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAppleFilter() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(appleFilter).click();
    }

    public void clickPriceFilter() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(priceFilter).click();
    }

    public AppleHeadphonesPage clickAppleHeadphonesWithLighting() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(appleHeadphonesWithLighting).click();
        return new AppleHeadphonesPage(driver);
    }

}
