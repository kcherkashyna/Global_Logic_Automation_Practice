package actions;

import com.codeborne.selenide.Condition;
import pages.ProductPage;
import pages.StoreMainPage;

import static com.codeborne.selenide.Condition.*;

public class SearchForProductAction {
    private final StoreMainPage storeMainPage;
    private final ProductPage productPage;

    public SearchForProductAction() {
        storeMainPage = new StoreMainPage();
        productPage = new ProductPage();
    }

    public void searchForProductByEnter(final String product) {
        storeMainPage.getSearchField().shouldBe(Condition.visible).setValue(product).pressEnter();
    }

    public void checkRightProductIsFound(final String productName) {
        productPage.getFoundProductNameText().shouldBe(Condition.visible).shouldHave(text(productName));
    }

    public void searchForProductByMagnifer(final String product) {
        storeMainPage.getSearchField().shouldBe(Condition.visible).setValue(product);
        storeMainPage.getSubmitSearchButton().shouldBe(enabled).click();
    }

    public void searchForProductByDropDownList(final String product) {
        storeMainPage.getSearchField().shouldBe(Condition.visible).setValue(product);
        storeMainPage.getDropDownListLinkText().first().shouldBe(visible).click();
    }

    public void checkRightProductIsFoundInList(final String productName) {
        productPage.getProductNameText().shouldBe(Condition.visible).shouldHave(text(productName));
    }

    public void checkErrorTextIsPresent(final String errorText) {
        storeMainPage.getErrorText(errorText).shouldBe(Condition.visible);
    }

}
