package actions;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import pages.MyCartPage;
import pages.ProductPage;
import pages.StoreMainPage;

import static com.codeborne.selenide.Condition.*;

public class AddProductToCartAction {
    private final StoreMainPage smp;
    private final ProductPage pp;
    private final MyCartPage mcp;

    public AddProductToCartAction() {
        smp = new StoreMainPage();
        pp = new ProductPage();
        mcp = new MyCartPage();
    }

    //Test methods should starts from shouldBeAble
    public void clickOnPrintedChiffonDress() {
        smp.getPrintedChiffonDressPicture().should(exist).click();
    }

    public void checkRightProductIsChosen(final String name, final String model) {
        pp.getProductNameText().shouldHave(text(name));
        pp.getProductModelText().shouldHave(text(model));
    }

    public void clickAddToCart() {
        pp.getAddToCartButton().shouldBe(enabled).click();
    }

    public void clickOnContinueShopping() {
        mcp.getContinueShoppingButton().shouldBe(enabled).click();
    }

    public void viewMyShoppingCart() {
        smp.getMyShoppingCartButton().shouldBe(enabled).click();
    }

    public void checkRightProductIsInCart(final String name, final String model) {
        mcp.getProductNameInCartText().shouldHave(text(name));
        mcp.getProductModelInCartText().shouldHave(text(model));
    }

    public void openWomenCatalog() {
        smp.getWomenLinkText().shouldBe(visible).click();
    }

    public void clickOnHiddenAddToCartButton() {
        pp.getHiddenAddProductToCartButton().waitUntil(appear, 8000).click();
    }

    public void checkProductPrice(final String price) {
        pp.getProductPriceText().shouldHave(text(price));
    }

    public void clickOnCross() {
        pp.getCrossButton().shouldBe(enabled).click();
    }

    public void checkAddedProductPrice(final String price) {
        mcp.getAddedProductPrice().shouldBe(visible).shouldHave(text(price));
    }

    public void openDressesCatalog() {
        smp.getDressesLinkText().should(exist).click();
    }

    public void clickOnHiddenMoreButton() {
        pp.getHiddenMoreButton().shouldBe(visible).click();
    }

    public void openTShirtsCatalog() {
        smp.getTShirtsLinkText().shouldBe(visible).click();
    }

    public void clickOnColorButton() {
        pp.getColorButton().shouldBe(enabled).click();
    }

    public void openTopsCatalog() {
        smp.getTopsLinkText().shouldBe(visible).click();
    }

    public void clickOnBlouse() {
        pp.getBlousePicture().shouldBe(enabled).click();
    }

    public void clickOnPlus() {
        pp.getPlusButton().shouldBe(enabled).doubleClick();
    }

    public void clickOnMinus() {
        pp.getMinusButton().shouldBe(enabled).click();
    }

    public void chooseSize(final String size) {
        pp.getSizeDropDownList().should(exist).selectOptionContainingText(size);
    }

    public void chooseWhiteColor() {
        pp.getWhiteColorButton().should(exist).click();
    }

    public void checkRightProductsAreInCart(final String firstProduct, final String secondProduct, final String thirdProduct) {
        pp.getProductNamesText().shouldHave(CollectionCondition.itemWithText(firstProduct));
        pp.getProductNamesText().shouldHave(CollectionCondition.itemWithText(secondProduct));
        pp.getProductNamesText().shouldHave(CollectionCondition.itemWithText(thirdProduct));
    }

    public void clickOnLogo() {
        smp.getLogoPicture().shouldBe(Condition.visible).click();
    }

}
