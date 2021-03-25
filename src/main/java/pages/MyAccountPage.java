package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MyAccountPage {

    //Is good to have matcher metod in action class too
    public void checkAccountIsCreated() {
        $(".page-heading").shouldHave(text("MY ACCOUNT"));
    }
    // use $x() for xpath and  think how you can avoid .get(0) 
    public void checkFirstAndLastName(String firstAndLastName) {
        $$(By.xpath("//*[@rel='nofollow']/span")).get(0).shouldHave(text(firstAndLastName));
    }
}
