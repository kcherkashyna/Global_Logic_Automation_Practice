package test;

import org.testng.annotations.Test;
import pages.MyCartPage;
import pages.PrintedChiffonDressPage;
import pages.StoreMainPage;

public class AddProductToCartTest {
    //Test methods should starts fron shouldBeAble.
    // Please add test description (test name from test design document it helps to map test coverege in futere)
    @Test
    public void addToCart() {
        //initalisation should not be in Test
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

