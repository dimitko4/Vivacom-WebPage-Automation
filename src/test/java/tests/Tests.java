package tests;

import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class Tests extends BaseTests {

    @Test
    public void automationVivacomPage() throws InterruptedException {
        homePage.clickDevices();
        MobilePhonesPage mobilePhonesPage = homePage.clickMobilePhones();
        mobilePhonesPage.clickAppleFilter();
        mobilePhonesPage.clickGoldFilter();
        Iphone12ProMaxPage iphone12ProMaxPage = mobilePhonesPage.clickIphone12ProMax();
        iphone12ProMaxPage.clickPhonePrice();
        MyBasketPage myBasketPage = iphone12ProMaxPage.clickBuy();
        assertEquals(myBasketPage.getHeaderMyBasketPage(), "Моята кошница", "You are not in My Basket page!");
        NewBuyingPage newBuyingPage = myBasketPage.clickContinueBuying();
        newBuyingPage.clickDevices();
        AccessoriesPage accessoriesPage = newBuyingPage.clickAccessories();
        accessoriesPage.clickAppleFilter();
        accessoriesPage.clickPriceFilter();
        AppleHeadphonesPage appleHeadphonesPage = accessoriesPage.clickAppleHeadphonesWithLighting();
        MyNewBasketPage myNewBasketPage = appleHeadphonesPage.clickBuy();
        assertEquals(myNewBasketPage.getHeader(), "Моята кошница", "You are not in My basket page!");
        myNewBasketPage.removeAppleHeadphones();
        assertEquals(myNewBasketPage.verifyGeneralTerms(), true, "The checkbox 'Общи условия за мобилни услуги' is not displayed, but it should be!");
        /*
        //method isEnabled() doesn't work correctly when the element is disabled
        assertEquals(myNewBasketPage.verifyContinueAsClient(), false,"The checkbox 'Продължи като клиент' is enabled, but it should be disabled!");
        assertEquals(myNewBasketPage.verifyContinueAsGuest(), false, "The checkbox 'Продължи като гост' is enabled, but it should be disabled!");
        */
        myNewBasketPage.clickGeneralTermsCheckBox();
        assertEquals(myNewBasketPage.verifyContinueAsClient(), true, "The checkbox 'Продължи като клиент' is disabled, but it should be enabled!");
        assertEquals(myNewBasketPage.verifyContinueAsGuest(), true, "The checkbox 'Продължи като гост' is disabled, but it should be enabled!");
        myNewBasketPage.removeAllProducts();
        assertEquals(myNewBasketPage.verifyEmptyBasketText1(), "В момента кошницата ви е празна", "The message is not correct!");
        assertEquals(myNewBasketPage.verifyEmptyBasketText2(), "Вижте актуалните ни оферти и изберете най-подходящата за вас. Ако искате да разгледате предходно добавени продукти, натиснете \"Вход\".", "The message is not correct!");
    }
}
