package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MyAccountPage {

    public void checkAccountIsCreated() {
        $(".page-heading").shouldHave(text("MY ACCOUNT"));
    }

    public void checkFirstAndLastName(String firstAndLastName) {
        $$(By.xpath("//*[@rel='nofollow']/span")).get(0).shouldHave(text(firstAndLastName));
    }
}
