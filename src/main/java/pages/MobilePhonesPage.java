package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePhonesPage {

    private WebDriver driver;
    private By appleFilter = By.xpath("//*[@id='filter-manufacturer']/label[2]/span[1]");
    private By goldFilter = By.xpath("//*[@id='filter-colors.color']/label[3]");
    private By iphone12ProMax = By.xpath("/html/body/div[21]/div/div/div/div[3]/div[1]/div[2]/div/a");

    public MobilePhonesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAppleFilter() {
        driver.findElement(appleFilter).click();
    }

    public void clickGoldFilter() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(goldFilter).click();
    }

    public Iphone12ProMaxPage clickIphone12ProMax() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(iphone12ProMax).click();
        return new Iphone12ProMaxPage(driver);
    }


}
