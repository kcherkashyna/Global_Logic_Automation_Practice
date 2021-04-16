package actions;

import com.codeborne.selenide.CollectionCondition;
import pages.MyCartPage;
import pages.ProductPage;
import pages.StoreMainPage;

import java.util.logging.Level;

import static com.codeborne.selenide.Condition.*;
import static utils.ActionsLogger.LOGGER;

public class AddProductToCartAction {
    private final StoreMainPage storeMainPage;
    private final ProductPage productPage;
    private final MyCartPage myCartPage;
    private final LoginAction loginAction;

    public AddProductToCartAction() {
        storeMainPage = new StoreMainPage();
        productPage = new ProductPage();
        myCartPage = new MyCartPage();
        loginAction = new LoginAction();
    }


    public void clickOnPrintedChiffonDress() {
        LOGGER.log(Level.INFO,"User clicks on product located on main page");
        storeMainPage.getPrintedChiffonDressPicture().should(visible).click();
    }

    public void checkRightProductIsChosen(final String name, final String model) {
        LOGGER.log(Level.INFO,"User checks name and model of chosen product");
        productPage.getProductNameText().shouldHave(text(name));
        productPage.getProductModelText().shouldHave(text(model));
    }

    public void clickAddToCart() {
        LOGGER.log(Level.INFO,"User clicks on Add to cart button");
        productPage.getAddToCartButton().shouldBe(enabled).click();
    }

    public void clickOnContinueShopping() {
        LOGGER.log(Level.INFO,"User clicks on Continue shopping button");
        myCartPage.getContinueShoppingButton().shouldBe(enabled).click();
    }

    public void viewMyShoppingCart() {
        LOGGER.log(Level.INFO,"User opens shopping cart");
        storeMainPage.getMyShoppingCartButton().shouldBe(enabled).click();
    }

    public void openCartAndCheckRightProductIsInCart(final String name, final String model) {
        LOGGER.log(Level.INFO,"User opens shopping cart and checks name and model of chosen product");
        viewMyShoppingCart();
        myCartPage.getProductNameInCartText().shouldHave(text(name));
        myCartPage.getProductModelInCartText().shouldHave(text(model));
    }

    public void openWomenCatalog() {
        LOGGER.log(Level.INFO,"User opens women catalog");
        storeMainPage.getWomenLinkText().shouldBe(visible).click();
    }

    public void clickOnHiddenAddToCartButton() {
        LOGGER.log(Level.INFO,"User clicks on hidden add to cart button");
        productPage.getHiddenAddProductToCartButton().shouldBe(enabled).click();
    }

    public void checkProductPrice(final String price) {
        LOGGER.log(Level.INFO,"User checks price of chosen product");
        productPage.getProductPriceText().shouldHave(text(price));
    }

    public void clickOnCross() {
        LOGGER.log(Level.INFO,"User checks price of chosen product");
        productPage.getCrossButton().shouldBe(enabled).click();
    }

    public void openCartAndCheckAddedProductPrice(final String price) {
        LOGGER.log(Level.INFO,"User open cart and checks price of added product");
        viewMyShoppingCart();
        myCartPage.getAddedProductPrice().shouldBe(visible).shouldHave(text(price));
    }

    public void openDressesCatalog() {
        LOGGER.log(Level.INFO,"User opens Dresses catalog");
        storeMainPage.getDressesLinkText().should(visible).click();
    }

    public void clickOnHiddenMoreButton() {
        LOGGER.log(Level.INFO,"User clicks on hidden More button");
        productPage.getHiddenMoreButton().shouldBe(visible).click();
    }

    public void openTShirtsCatalog() {
        LOGGER.log(Level.INFO,"User opens T-shirts catalog");
        storeMainPage.getTShirtsLinkText().shouldBe(visible).click();
    }

    public void clickOnColorButton() {
        LOGGER.log(Level.INFO,"User clicks on Color button");
        productPage.getColorButton().shouldBe(enabled).click();
    }

    public void openTopsCatalog() {
        LOGGER.log(Level.INFO,"User opens Tops catalog");
        storeMainPage.getTopsLinkText().shouldBe(visible).click();
    }

    public void clickOnBlouse() {
        LOGGER.log(Level.INFO,"User clicks on Blouse product");
        productPage.getBlousePicture().shouldBe(enabled).click();
    }

    public void clickOnPlus() {
        LOGGER.log(Level.INFO,"User clicks on Plus button");
        productPage.getPlusButton().shouldBe(enabled).doubleClick();
    }

    public void clickOnMinus() {
        LOGGER.log(Level.INFO,"User clicks on Minus button");
        productPage.getMinusButton().shouldBe(enabled).click();
    }

    public void chooseSize(final String size) {
        LOGGER.log(Level.INFO,"User chooses size");
        productPage.getSizeDropDownList().should(visible).selectOptionContainingText(size);
    }

    public void chooseWhiteColor() {
        LOGGER.log(Level.INFO,"User changes product color");
        productPage.getWhiteColorButton().should(visible).click();
    }

    public void openCartAndCheckRightProductsAreInCart(final String firstProduct, final String secondProduct, final String thirdProduct) {
        LOGGER.log(Level.INFO,"User opens cart and checks product names in cart");
        viewMyShoppingCart();
        productPage.getProductNamesText().shouldHave(CollectionCondition.itemWithText(firstProduct));
        productPage.getProductNamesText().shouldHave(CollectionCondition.itemWithText(secondProduct));
        productPage.getProductNamesText().shouldHave(CollectionCondition.itemWithText(thirdProduct));
    }

    public void addProductToCartCheckChosenProductAndContinueShopping(String name, String model) {
        LOGGER.log(Level.INFO,"User adds product to cart, checks chosen product and continue shopping");
        clickOnPrintedChiffonDress();
        checkRightProductIsChosen(name, model);
        clickAddToCart();
        clickOnContinueShopping();
    }

    public void addProductToCartByHiddenAddToCartButtonCheckChosenProductAndClickOnCross(String price) {
        LOGGER.log(Level.INFO,"User adds product to cart using hidden Add to cart button, checks chosen product and clicks on cross");
        clickOnHiddenAddToCartButton();
        checkProductPrice(price);
        clickOnCross();
    }

    public void addProductToCartByHiddenMoreButtonCheckChosenProductAndContinueShopping(String name, String model) {
        LOGGER.log(Level.INFO,"User adds product to cart using hidden More button, checks chosen product and continue shopping");
        clickOnHiddenMoreButton();
        checkRightProductIsChosen(name, model);
        clickAddToCart();
        clickOnContinueShopping();
    }

    public void addProductToCartByColorButtonCheckChosenProductAndClickOnCross(String name, String model) {
        LOGGER.log(Level.INFO,"User adds product to cart using Color button, checks chosen product and clicks on cross");
        clickOnColorButton();
        checkRightProductIsChosen(name, model);
        clickAddToCart();
        clickOnCross();
    }

    public void addProductToCartCheckChosenProductChangeParametersAndContinueShopping(String name, String model) {
        LOGGER.log(Level.INFO,"User chooses product and checks it, change quantity, size, color, add to cart and continue shopping");
        clickOnBlouse();
        checkRightProductIsChosen(name, model);
        clickOnPlus();
        clickOnMinus();
        chooseSize("M");
        chooseWhiteColor();
        clickAddToCart();
        clickOnContinueShopping();
    }

    public void login(String email, String password) {
        LOGGER.log(Level.INFO,"User enters credentials and submit login");
        loginAction.clickOnSignIn();
        loginAction.enterRegisteredEmail(email);
        loginAction.enterPassword(password);
        loginAction.clickOnSubmitLogin();
    }
}
