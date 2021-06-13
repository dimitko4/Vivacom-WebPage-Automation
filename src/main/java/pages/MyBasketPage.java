package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyBasketPage {

    private WebDriver driver;
    private By headerMyBasket = By.xpath("/html/body/section/div/div/h2");
    private By continueBuying = By.xpath("//*[@id='shopping-cart-span']/div[1]/aside/div[1]/div/div[3]/div[6]/div/a");

    public MyBasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderMyBasketPage() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(headerMyBasket).getText();
    }

    public NewBuyingPage clickContinueBuying() {
        driver.findElement(continueBuying).click();
        return new NewBuyingPage(driver);
    }

}
