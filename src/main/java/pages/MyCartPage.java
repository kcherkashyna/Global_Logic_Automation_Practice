package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MyCartPage {

    public SelenideElement getProceedToCheckoutOneButton() {
        return $x("//*[@title='Proceed to checkout']");
    }

    public SelenideElement getProceedToCheckoutSecondButton() {
        return $x("//*[contains(@class,'cart_navigation')]//*[@title='Proceed to checkout']");
    }

    public SelenideElement getProceedToCheckoutThirdButton() {
        return $x("//*[@name='processAddress']");
    }

    public SelenideElement getIAgreeCheckbox() { return $("#cgv"); }

    public SelenideElement getProceedToCheckoutForthButton() {
        return $x("//*[@name='processCarrier']");
    }

    public SelenideElement getPayByBankWireButton() {
        return $x("//*[@title='Pay by bank wire']");
    }

    public SelenideElement getIConfirmMyOrderButton() {
        return $x("//*[text()='I confirm my order']");
    }

    public SelenideElement getContinueShoppingButton() {
        return $x("//*[@title='Continue shopping']");
    }

    public SelenideElement getProductNameInCartText() {
        //update locator . replace get(2)
        return $x("//*[@class='cart_description']//*[@class='product-name']");
    }

    public SelenideElement getProductModelInCartText() {
        return $(".cart_ref");
    }

    public SelenideElement getAddedProductPrice() {
        $x("//*[@title='View my shopping cart']").scrollTo().hover();
        return $x("//*[@class='cart-info']//*[@class='price']");
    }

}
