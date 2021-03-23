package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PrintedChiffonDressPage {

    public void checkRightProductIsChosen() {
        $(By.xpath("//*[@itemprop='name']")).shouldHave(text("Printed Chiffon Dress"));
        $(By.xpath("//*[@itemprop='sku']")).shouldHave(text("demo_7"));
    }

    public void clickAddToCart() {
        $(By.xpath("//*[text()='Add to cart']")).click();
    }
}
