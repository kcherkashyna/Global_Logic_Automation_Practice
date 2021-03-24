package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MyCartPage {

    public void clickOnContinueShopping() {
        $(By.xpath("//*[@title='Continue shopping']")).click();
    }

    public void checkRightProductIsAdded() {
        //update locator . replace get(2)
        $$(By.xpath("//*[@class='product-name']//*[contains(@href,'id_product')]")).get(2).shouldHave(text("Printed Chiffon Dress"));
        $(".cart_ref").shouldHave(text("demo_7"));
    }
}
