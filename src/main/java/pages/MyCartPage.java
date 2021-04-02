package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MyCartPage {

    public SelenideElement getProceedToCheckout1Button() {
        return $x("//*[@title='Proceed to checkout']");
    }

    public SelenideElement getProceedToCheckout2Button() {
        return $x("//*[contains(@class,'cart_navigation')]//*[@title='Proceed to checkout']");
    }

    public SelenideElement getProceedToCheckout3Button() {
        return $x("//*[@name='processAddress']");
    }

    public SelenideElement getIAgreeCheckbox() {
        return $("#cgv");
    }

    public SelenideElement getProceedToCheckout4Button() {
        return $x("//*[@name='processCarrier']");
    }

    public SelenideElement getPayByBankWireButton() {
        return $x("//*[@title='Pay by bank wire']");
    }

    public SelenideElement getIConfirmMyOrderButton() {
        return $x("//*[text()='I confirm my order']");
    }

    public void clickOnContinueShopping() {
        $x("//*[@title='Continue shopping']").shouldBe(enabled).click();
    }

    public void checkRightProductIsAdded() {
        //update locator . replace get(2)
        $$(By.xpath("//*[@class='product-name']//*[contains(@href,'id_product')]")).get(2).shouldHave(text("Printed Chiffon Dress"));
        $(".cart_ref").shouldHave(text("demo_7"));
    }
}
