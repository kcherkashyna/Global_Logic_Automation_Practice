package test;

import actions.AddProductToCartAction;
import utils.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddProductToCartTest {
    private Configuration configuration;
    private AddProductToCartAction addProductToCartAction;

    @BeforeTest
    public void openSite() {
        addProductToCartAction = new AddProductToCartAction();
        configuration = new Configuration();
        configuration.openSite();
    }

    @Test(description = "User should be able to add a product to the cart")
    private void addToCart() {
        addProductToCartAction.addPrintedChiffonDressToCart();
        addProductToCartAction.checkRightProductIsInCart("Printed Chiffon Dress", "demo_7");
    }

    @Test(description = "User should be able to add a product to the cart using Add to cart button on the product card")
    private void addToCartByAddToCartButton() {
        addProductToCartAction.addPrintedDressModelThirdToCart();
        addProductToCartAction.checkAddedProductPrice("$26.00");
    }

    @Test(description = "User should be able to add a product to the cart using More button on the product card")
    private void addToCartByMoreButton() {
        addProductToCartAction.addPrintedSummerDressModelSixthToCart();
        addProductToCartAction.checkRightProductIsInCart("Printed Summer Dress", "demo_6");
    }

    @Test(description = "User should be able to add a product to the cart using color square button on the product card")
    private void addToCartByColorButton() {
        addProductToCartAction.addTShirtToCart();
        addProductToCartAction.checkAddedProductPrice("$16.51");
    }

    @Test(description = "User should be able to change the amount, quantity and color of product and add it to the cart")
    private void addToCartWithChangedParameters() {
        addProductToCartAction.addBlouseToCart();
        addProductToCartAction.checkRightProductIsInCart("Blouse", "demo_2");
    }

    @Test(description = "User should be able to add 3 products from different catalogs to the cart")
    private void addToCartSeveralProducts() {
        addProductToCartAction.addPrintedChiffonDressToCart();
        addProductToCartAction.addPrintedDressModelThirdToCart();
        addProductToCartAction.addPrintedSummerDressModelSixthToCart();
        addProductToCartAction.checkRightProductsAreInCart("Printed Chiffon Dress", "Printed Dress", "Printed Summer Dress");
    }

    @Test(description = "Registered user should be able to add 3 products from different catalogs to the cart")
    private void registerUserAddSeveralProductsToCart() {
        addProductToCartAction.login();
        addProductToCartAction.addTShirtToCart();
        addProductToCartAction.addBlouseToCart();
        addProductToCartAction.addPrintedDressModelThirdToCart();
        addProductToCartAction.checkRightProductsAreInCart("Faded Short Sleeve T-shirts", "Blouse", "Printed Dress");
    }


}

