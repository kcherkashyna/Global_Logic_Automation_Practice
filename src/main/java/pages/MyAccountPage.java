package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MyAccountPage {
    //Is good to have matcher method in action class too
    public SelenideElement getMyAccountText(){
        return $(".page-heading");
    }

    // use $x() for xpath and think how you can avoid .get(0)
    public SelenideElement getMyFirstAndLastNameText(){
        return $x("//*[@class='account']/span");
    }

    public SelenideElement getMyNameLinkText(){
        return $(".account");
    }

    public SelenideElement getMyOrderHistoryButton(){
        return $x("//*[text()='Order history and details']");
    }

}
