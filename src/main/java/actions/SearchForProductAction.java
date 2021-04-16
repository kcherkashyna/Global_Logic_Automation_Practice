package actions;

import com.codeborne.selenide.Condition;
import pages.ProductPage;
import pages.StoreMainPage;

import java.util.logging.Level;

import static com.codeborne.selenide.Condition.*;
import static utils.ActionsLogger.LOGGER;

public class SearchForProductAction {
    private final StoreMainPage storeMainPage;
    private final ProductPage productPage;

    public SearchForProductAction() {
        storeMainPage = new StoreMainPage();
        productPage = new ProductPage();
    }

    public void searchForProductByEnter(final String product) {
        LOGGER.log(Level.INFO,"User searches for product using Enter button");
        storeMainPage.getSearchField().shouldBe(Condition.visible).setValue(product).pressEnter();
    }

    public void checkRightProductIsFound(final String productName) {
        LOGGER.log(Level.INFO,"User checks founded product name");
        productPage.getFoundProductNameText().shouldBe(Condition.visible).shouldHave(text(productName));
    }

    public void searchForProductByMagnifier(final String product) {
        LOGGER.log(Level.INFO,"User searches for product using Magnifier button");
        storeMainPage.getSearchField().shouldBe(Condition.visible).setValue(product);
        storeMainPage.getSubmitSearchButton().shouldBe(enabled).click();
    }

    public void searchForProductByDropDownList(final String product) {
        LOGGER.log(Level.INFO,"User searches for product using drop-down list");
        storeMainPage.getSearchField().shouldBe(Condition.visible).setValue(product);
        storeMainPage.getDropDownListLinkText().first().shouldBe(visible).click();
    }

    public void checkRightProductIsFoundInList(final String productName) {
        LOGGER.log(Level.INFO,"User checks founded product name");
        productPage.getProductNameText().shouldBe(Condition.visible).shouldHave(text(productName));
    }

    public void checkErrorTextIsPresent(final String errorText) {
        LOGGER.log(Level.INFO,"User checks displayed error text");
        storeMainPage.getErrorText(errorText).shouldBe(Condition.visible);
    }

    public void checkNotFoundErrorTextIsPresent(final String errorText, final String productName) {
        LOGGER.log(Level.INFO,"User checks displayed error text");
        storeMainPage.getErrorText(errorText + "\"" + productName + "\"").shouldBe(Condition.visible);
    }

}
