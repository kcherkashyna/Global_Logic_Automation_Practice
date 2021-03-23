package test;

import org.testng.annotations.Test;
import pages.MyCartPage;
import pages.PrintedChiffonDressPage;
import pages.StoreMainPage;

public class AddProductToCartTest {

    @Test
    public void addToCart() {

        StoreMainPage storeMainPage = new StoreMainPage();
        PrintedChiffonDressPage printedChiffonDressPage = new PrintedChiffonDressPage();
        MyCartPage myCartPage = new MyCartPage();

        storeMainPage.openSite();
        storeMainPage.clickOnPrintedChiffonDress();

        printedChiffonDressPage.checkRightProductIsChosen();
        printedChiffonDressPage.clickAddToCart();

        myCartPage.clickOnContinueShopping();

        storeMainPage.viewMyShoppingCart();

        myCartPage.checkRightProductIsAdded();
    }
}

