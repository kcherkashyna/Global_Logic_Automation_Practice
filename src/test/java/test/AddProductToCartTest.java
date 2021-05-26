package test;

import actions.AddProductToCartAction;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Configuration;

public class AddProductToCartTest {
    private Configuration configuration;
    private AddProductToCartAction addProductToCartAction;
    private static final String PRINTED_CHIFFON_DRESS = "Printed Chiffon Dress";
    private static final String MODEL_SEVEN = "demo_7";
    private static final String PRINTED_DRESS_PRICE = "$26.00";
    private static final String PRINTED_SUMMER_DRESS = "Printed Summer Dress";
    private static final String MODEL_SIX = "demo_6";
    private static final String T_SHIRT = "Faded Short Sleeve T-shirts";
    private static final String MODEL_ONE = "demo_1";
    private static final String T_SHIRT_PRICE = "$16.51";
    private static final String BLOUSE = "Blouse";
    private static final String MODEL_TWO = "demo_2";
    private static final String PRINTED_DRESS = "Printed Dress";
    private static final String EMAIL = "a@testemail.com";
    private static final String PASSWORD = "qawsedrftgyhu";

    @BeforeMethod
    public void openSite() {
        addProductToCartAction = new AddProductToCartAction();
        configuration = new Configuration();
        configuration.openSite();
    }

    @Test(description = "User should be able to add a product to the cart")
    private void addToCart() {
        addProductToCartAction.addProductToCartCheckChosenProductAndContinueShopping(PRINTED_CHIFFON_DRESS, MODEL_SEVEN);
        addProductToCartAction.openCartAndCheckRightProductIsInCart(PRINTED_CHIFFON_DRESS, MODEL_SEVEN);
    }

    @Test(description = "User should be able to add a product to the cart using Add to cart button on the product card")
    private void addToCartByAddToCartButton() {
        addProductToCartAction.openWomenCatalog();
        addProductToCartAction.addProductToCartByHiddenAddToCartButtonCheckChosenProductAndClickOnCross(PRINTED_DRESS_PRICE);
        addProductToCartAction.openCartAndCheckAddedProductPrice(PRINTED_DRESS_PRICE);
    }

    @Test(description = "User should be able to add a product to the cart using More button on the product card")
    private void addToCartByMoreButton() {
        addProductToCartAction.openDressesCatalog();
        addProductToCartAction.addProductToCartByHiddenMoreButtonCheckChosenProductAndContinueShopping(PRINTED_SUMMER_DRESS, MODEL_SIX);
        addProductToCartAction.openCartAndCheckRightProductIsInCart(PRINTED_SUMMER_DRESS, MODEL_SIX);
    }

    @Test(description = "User should be able to add a product to the cart using color square button on the product card")
    private void addToCartByColorButton() {
        addProductToCartAction.openTShirtsCatalog();
        addProductToCartAction.addProductToCartByColorButtonCheckChosenProductAndClickOnCross(T_SHIRT, MODEL_ONE);
        addProductToCartAction.openCartAndCheckAddedProductPrice(T_SHIRT_PRICE);
    }

    @Test(description = "User should be able to change the amount, quantity and color of product and add it to the cart")
    private void addToCartWithChangedParameters() {
        addProductToCartAction.openTopsCatalog();
        addProductToCartAction.addProductToCartCheckChosenProductChangeParametersAndContinueShopping(BLOUSE, MODEL_TWO);
        addProductToCartAction.openCartAndCheckRightProductIsInCart(BLOUSE, MODEL_TWO);
    }

    @Test(description = "User should be able to add 3 products from different catalogs to the cart")
    private void addToCartSeveralProducts() {
        addProductToCartAction.addProductToCartCheckChosenProductAndContinueShopping(PRINTED_CHIFFON_DRESS, MODEL_SEVEN);
        addProductToCartAction.openWomenCatalog();
        addProductToCartAction.addProductToCartByHiddenAddToCartButtonCheckChosenProductAndClickOnCross(PRINTED_DRESS_PRICE);
        addProductToCartAction.openDressesCatalog();
        addProductToCartAction.addProductToCartByHiddenMoreButtonCheckChosenProductAndContinueShopping(PRINTED_SUMMER_DRESS, MODEL_SIX);
        addProductToCartAction.openCartAndCheckRightProductsAreInCart(PRINTED_CHIFFON_DRESS, PRINTED_DRESS, PRINTED_SUMMER_DRESS);
    }

    @Test(description = "Registered user should be able to add 3 products from different catalogs to the cart")
    private void registerUserAddSeveralProductsToCart() {
        addProductToCartAction.login(EMAIL, PASSWORD);
        addProductToCartAction.openTShirtsCatalog();
        addProductToCartAction.addProductToCartByColorButtonCheckChosenProductAndClickOnCross(T_SHIRT, MODEL_ONE);
        addProductToCartAction.openTopsCatalog();
        addProductToCartAction.addProductToCartCheckChosenProductChangeParametersAndContinueShopping(BLOUSE, MODEL_TWO);
        addProductToCartAction.openWomenCatalog();
        addProductToCartAction.addProductToCartByHiddenAddToCartButtonCheckChosenProductAndClickOnCross(PRINTED_DRESS_PRICE);
        addProductToCartAction.openCartAndCheckRightProductsAreInCart(T_SHIRT, BLOUSE, PRINTED_DRESS);
    }

    @AfterMethod
    void closeSite() {
        Selenide.close();
    }

}

