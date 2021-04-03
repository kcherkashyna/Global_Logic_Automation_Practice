package test;

import actions.AddProductToCartAction;
import actions.ConfigurationAction;
import actions.LoginAction;
import org.testng.annotations.Test;

public class AddProductToCartTest {
    ConfigurationAction ca;
    AddProductToCartAction aptca;
    LoginAction la;

    //initalisation should not be in Test
    public AddProductToCartTest() {
        ca = new ConfigurationAction();
        aptca = new AddProductToCartAction();
        la = new LoginAction();
    }

    // Please add test description (test name from test design document it helps to map test coverege in futere)
    @Test(description = "User should be able to add a product to the cart")
    private void addToCart() {
        ca.openSite();
        aptca.clickOnPrintedChiffonDress();
        aptca.checkRightProductIsChosen("Printed Chiffon Dress", "demo_7");
        aptca.clickAddToCart();
        aptca.clickOnContinueShopping();
        aptca.viewMyShoppingCart();
        aptca.checkRightProductIsInCart("Printed Chiffon Dress", "demo_7");
    }

    @Test(description = "User should be able to add a product to the cart using Add to cart button on the product card")
    private void addToCartByAddToCartButton() {
        ca.openSite();
        aptca.openWomenCatalog();
        aptca.clickOnHiddenAddToCartButton();
        aptca.checkProductPrice("$26.00");
        aptca.clickOnCross();
        aptca.checkAddedProductPrice("$26.00");
    }

    @Test(description = "User should be able to add a product to the cart using More button on the product card")
    private void addToCartByMoreButton() {
        ca.openSite();
        aptca.openDressesCatalog();
        aptca.clickOnHiddenMoreButton();
        aptca.checkRightProductIsChosen("Printed Summer Dress", "demo_6");
        aptca.clickAddToCart();
        aptca.clickOnContinueShopping();
        aptca.viewMyShoppingCart();
        aptca.checkRightProductIsInCart("Printed Summer Dress", "demo_6");
    }

    @Test(description = "User should be able to add a product to the cart using color square button on the product card")
    private void addToCartByColorButton() {
        ca.openSite();
        aptca.openTShirtsCatalog();
        aptca.clickOnColorButton();
        aptca.checkRightProductIsChosen("Faded Short Sleeve T-shirts", "demo_1");
        aptca.clickAddToCart();
        aptca.clickOnCross();
        aptca.checkAddedProductPrice("$16.51");
    }

    @Test(description = "User should be able to change the amount, quantity and color of product and add it to the cart")
    private void addToCartWithChangedParameters() {
        ca.openSite();
        aptca.openTopsCatalog();
        aptca.clickOnBlouse();
        aptca.checkRightProductIsChosen("Blouse", "demo_2");
        aptca.clickOnPlus();
        aptca.clickOnMinus();
        aptca.chooseSize("M");
        aptca.chooseWhiteColor();
        aptca.clickAddToCart();
        aptca.clickOnContinueShopping();
        aptca.viewMyShoppingCart();
        aptca.checkRightProductIsInCart("Blouse", "demo_2");
    }

    @Test(description = "User should be able to add 3 products from different catalogs to the cart")
    private void addToCartSeveralProducts() {
        ca.openSite();
        aptca.clickOnPrintedChiffonDress();
        aptca.clickAddToCart();
        aptca.clickOnContinueShopping();
        aptca.openWomenCatalog();
        aptca.clickOnHiddenAddToCartButton();
        aptca.clickOnCross();
        aptca.openDressesCatalog();
        aptca.clickOnHiddenMoreButton();
        aptca.clickAddToCart();
        aptca.clickOnContinueShopping();
        aptca.viewMyShoppingCart();
        aptca.checkRightProductsAreInCart("Printed Chiffon Dress", "Printed Dress", "Printed Summer Dress");
    }

    @Test(description = "Registered user should be able to add 3 products from different catalogs to the cart")
    private void registerUserAddSeveralProductsToCart() {
        ca.openSite();
        la.clickOnSignIn();
        la.enterRegisteredEmail("a@testemail.com");
        la.enterPassword("qawsedrftgyhu");
        la.clickOnSubmitLogin();
        aptca.clickOnLogo();
        aptca.openTShirtsCatalog();
        aptca.clickOnColorButton();
        aptca.clickAddToCart();
        aptca.clickOnCross();
        aptca.openTopsCatalog();
        aptca.clickOnBlouse();
        aptca.clickAddToCart();
        aptca.clickOnContinueShopping();
        aptca.openWomenCatalog();
        aptca.clickOnHiddenAddToCartButton();
        aptca.clickOnCross();
        aptca.viewMyShoppingCart();
        aptca.checkRightProductsAreInCart("Faded Short Sleeve T-shirts", "Blouse", "Printed Dress");
    }


}

