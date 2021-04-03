package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class StoreMainPage {

    //As this is initial action this should not be in page 
    // this is configuration. Think on that where you may put open site and other browser configuration actions. 

    public SelenideElement getSignInButton() {
        return $(".login");
    }

    public SelenideElement getSignOutButton() {
        return $(".logout");
    }

    public SelenideElement getLogoPicture() {
        return $x("//*[@src='http://automationpractice.com/img/logo.jpg']");
    }

    public SelenideElement getPrintedChiffonDressPicture() {
        return $(byText("Printed Chiffon Dress"));
    }

    public SelenideElement getMyShoppingCartButton() {
        return $x("//*[@title='View my shopping cart']");
    }

    public SelenideElement getWomenLinkText() {
        return $x("//*[@title='Women']");
    }

    public SelenideElement getDressesLinkText() {
        return $$x("//*[@title='Dresses']").last();
    }

    public SelenideElement getTShirtsLinkText() {
        return $$x("//*[@title='T-shirts']").last();
    }

    public SelenideElement getTopsLinkText() {
        $x("//*[@title='Women']").scrollTo().hover();
        return $x("//*[@title='Tops'][@class='sf-with-ul']");
    }

    public SelenideElement getSearchField() {
        return $("#search_query_top");
    }

    public SelenideElement getSubmitSearchButton() {
        return $x("//*[@name='submit_search']");
    }

    public ElementsCollection getDropDownListLinkText() {
        return $$x("//*[@class='ac_results']//*[contains(@class, 'ac')]");
    }

    public SelenideElement getErrorText(final String errorText) {
        return $(byText(errorText));
    }

}
