package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iphone12ProMaxPage {

    private WebDriver driver;
    private By phonePrice = By.xpath("//*[@id='relatedOfferDiv-epc_jjl210528140034250049_so_jyx210531150154654235']/div[3]/div[2]/div[1]/label/span[2]");
    private By buy = By.cssSelector("#command button");

    public Iphone12ProMaxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPhonePrice() {
        driver.findElement(phonePrice).click();
    }

    public MyBasketPage clickBuy() {
        driver.findElement(buy).click();
        return new MyBasketPage(driver);
    }


}
