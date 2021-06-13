package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyNewBasketPage {

    private WebDriver driver;
    private By header = By.xpath("/html/body/section/div/div/h2");
    private By totalAmount = By.xpath("//*[@id='shopping-cart-span']/div[1]/aside/div[1]/div/div[2]/span[2]");
    private By removeProductsButton = By.xpath("//*[@class='jsRemoveItemForm']/button");
    private By generalTerms = By.xpath("//*[@id='shopping-cart-span']/div[1]/aside/div[1]/div/div[3]/div[1]/div/a");
    private By continueAsClient = By.xpath("//*[@id='shopping-cart-span']/div[1]/aside/div[1]/div/div[3]/div[2]/div");
    private By continueAsGuest = By.xpath("//*[@id='shopping-cart-span']/div[1]/aside/div[1]/div/div[3]/div[4]/div");
    private By generalTermsCheckBox = By.xpath("//*[@id='shopping-cart-span']/div[1]/aside/div[1]/div/div[3]/div[1]/div/label/em");
    private By emptyBasketText1 = By.xpath("//*[@id='shopping-cart-span']/div[1]/div/div/section/div/div/h3");
    private By emptyBasketText2 = By.xpath("//*[@id='shopping-cart-span']/div[1]/div/div/section/div/div/p");

    public MyNewBasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(header).getText();
    }

    public void removeAppleHeadphones() {
        String string = driver.findElement(totalAmount).getText();
        String[] arrOfString = string.split(" ");
        double stringToDouble = Double.parseDouble(arrOfString[0]);
        if (stringToDouble > 2000) {
            driver.findElement(removeProductsButton).click();
        }
    }

    public boolean verifyGeneralTerms() {
        return driver.findElement(generalTerms).isDisplayed();
    }

    //method isEnabled() doesn't work correctly when the element is disabled
    public boolean verifyContinueAsClient() {
        return driver.findElement(continueAsClient).isEnabled();
    }

    //method isEnabled() doesn't work correctly when the element is disabled
    public boolean verifyContinueAsGuest() {
        return driver.findElement(continueAsGuest).isEnabled();
    }

    public void clickGeneralTermsCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(generalTermsCheckBox).click();
    }

    public void removeAllProducts() {
        while (driver.findElement(removeProductsButton).isDisplayed() == true) {
            driver.findElement(removeProductsButton).click();
            break;
        }
    }

    public String verifyEmptyBasketText1() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(emptyBasketText1).getText();
    }

    public String verifyEmptyBasketText2() {
        return driver.findElement(emptyBasketText2).getText();
    }

}
