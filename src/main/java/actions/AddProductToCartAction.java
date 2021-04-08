package actions;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import pages.MyCartPage;
import pages.ProductPage;
import pages.StoreMainPage;

import static com.codeborne.selenide.Condition.*;

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
        storeMainPage.getPrintedChiffonDressPicture().should(exist).click();
    }

    public void checkRightProductIsChosen(final String name, final String model) {
        productPage.getProductNameText().shouldHave(text(name));
        productPage.getProductModelText().shouldHave(text(model));
    }

    public void clickAddToCart() {
        productPage.getAddToCartButton().shouldBe(enabled).click();
    }

    public void clickOnContinueShopping() {
        myCartPage.getContinueShoppingButton().shouldBe(enabled).click();
    }

    public void viewMyShoppingCart() {
        storeMainPage.getMyShoppingCartButton().shouldBe(enabled).click();
    }

    public void checkRightProductIsInCart(final String name, final String model) {
        viewMyShoppingCart();
        myCartPage.getProductNameInCartText().shouldHave(text(name));
        myCartPage.getProductModelInCartText().shouldHave(text(model));
    }

    public void openWomenCatalog() {
        storeMainPage.getWomenLinkText().shouldBe(visible).click();
    }

    public void clickOnHiddenAddToCartButton() {
        productPage.getHiddenAddProductToCartButton().waitUntil(appear, 8000).click();
    }

    public void checkProductPrice(final String price) {
        productPage.getProductPriceText().shouldHave(text(price));
    }

    public void clickOnCross() {
        productPage.getCrossButton().shouldBe(enabled).click();
    }

    public void checkAddedProductPrice(final String price) {
        viewMyShoppingCart();
        myCartPage.getAddedProductPrice().shouldBe(visible).shouldHave(text(price));
    }

    public void openDressesCatalog() {
        storeMainPage.getDressesLinkText().should(exist).click();
    }

    public void clickOnHiddenMoreButton() {
        productPage.getHiddenMoreButton().shouldBe(visible).click();
    }

    public void openTShirtsCatalog() {
        storeMainPage.getTShirtsLinkText().shouldBe(visible).click();
    }

    public void clickOnColorButton() {
        productPage.getColorButton().shouldBe(enabled).click();
    }

    public void openTopsCatalog() {
        storeMainPage.getTopsLinkText().shouldBe(visible).click();
    }

    public void clickOnBlouse() {
        productPage.getBlousePicture().shouldBe(enabled).click();
    }

    public void clickOnPlus() {
        productPage.getPlusButton().shouldBe(enabled).doubleClick();
    }

    public void clickOnMinus() {
        productPage.getMinusButton().shouldBe(enabled).click();
    }

    public void chooseSize(final String size) {
        productPage.getSizeDropDownList().should(exist).selectOptionContainingText(size);
    }

    public void chooseWhiteColor() {
        productPage.getWhiteColorButton().should(exist).click();
    }

    public void checkRightProductsAreInCart(final String firstProduct, final String secondProduct, final String thirdProduct) {
        viewMyShoppingCart();
        productPage.getProductNamesText().shouldHave(CollectionCondition.itemWithText(firstProduct));
        productPage.getProductNamesText().shouldHave(CollectionCondition.itemWithText(secondProduct));
        productPage.getProductNamesText().shouldHave(CollectionCondition.itemWithText(thirdProduct));
    }

    public void clickOnLogo() {
        storeMainPage.getLogoPicture().shouldBe(Condition.visible).click();
    }

    public void addPrintedChiffonDressToCart() {
        clickOnPrintedChiffonDress();
        checkRightProductIsChosen("Printed Chiffon Dress", "demo_7");
        clickAddToCart();
        clickOnContinueShopping();
    }

    public void addPrintedDressModelThirdToCart() {
        openWomenCatalog();
        clickOnHiddenAddToCartButton();
        checkProductPrice("$26.00");
        clickOnCross();
    }

    public void addPrintedSummerDressModelSixthToCart() {
        openDressesCatalog();
        clickOnHiddenMoreButton();
        checkRightProductIsChosen("Printed Summer Dress", "demo_6");
        clickAddToCart();
        clickOnContinueShopping();
    }

    public void addTShirtToCart() {
        openTShirtsCatalog();
        clickOnColorButton();
        checkRightProductIsChosen("Faded Short Sleeve T-shirts", "demo_1");
        clickAddToCart();
        clickOnCross();
    }

    public void addBlouseToCart() {
        openTopsCatalog();
        clickOnBlouse();
        checkRightProductIsChosen("Blouse", "demo_2");
        clickOnPlus();
        clickOnMinus();
        chooseSize("M");
        chooseWhiteColor();
        clickAddToCart();
        clickOnContinueShopping();
    }

    public void login() {
        loginAction.clickOnSignIn();
        loginAction.enterRegisteredEmail("a@testemail.com");
        loginAction.enterPassword("qawsedrftgyhu");
        loginAction.clickOnSubmitLogin();
    }
}
