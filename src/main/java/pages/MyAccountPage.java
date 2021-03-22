package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {

    public void checkAccountIsCreated() {
        $(".page-heading").shouldHave(text("MY ACCOUNT"));
    }

}
