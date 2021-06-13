package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleHeadphonesPage {

    private WebDriver driver;
    private By buy = By.xpath("//*[@id='command']/div[4]/div[1]/button");

    public AppleHeadphonesPage(WebDriver driver) {
        this.driver = driver;
    }

    public MyNewBasketPage clickBuy() {
        driver.findElement(buy).click();
        return new MyNewBasketPage(driver);
    }

}
