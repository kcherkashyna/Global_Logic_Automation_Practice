package actions;

import com.codeborne.selenide.Condition;
import pages.ProductPage;
import pages.StoreMainPage;

import static com.codeborne.selenide.Condition.*;

public class SearchForProductAction {
    private final StoreMainPage smp;
    private final ProductPage pp;

    public SearchForProductAction() {
        smp = new StoreMainPage();
        pp = new ProductPage();
    }

    public void searchForProductByEnter(final String product) {
        smp.getSearchField().shouldBe(Condition.visible).setValue(product).pressEnter();
    }

    public void checkRightProductIsFound(final String productName) {
        pp.getFoundProductNameText().shouldBe(Condition.visible).shouldHave(text(productName));
    }

    public void searchForProductByMagnifer(final String product) {
        smp.getSearchField().shouldBe(Condition.visible).setValue(product);
        smp.getSubmitSearchButton().shouldBe(enabled).click();
    }

    public void searchForProductByDropDownList(final String product) {
        smp.getSearchField().shouldBe(Condition.visible).setValue(product);
        smp.getDropDownListLinkText().first().shouldBe(visible).click();
    }

    public void checkRightProductIsFoundInList(final String productName) {
        pp.getProductNameText().shouldBe(Condition.visible).shouldHave(text(productName));
    }

    public void checkErrorTextIsPresent(final String errorText) {
        smp.getErrorText(errorText).shouldBe(Condition.visible);
    }

}
