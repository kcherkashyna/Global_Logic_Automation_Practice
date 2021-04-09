package pages.phptravels;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MyAccountPage {

    public SelenideElement getAccountName(){
        return $x("//*[contains(@class, 'dropdown-login')]//*[@id='dropdownCurrency']");
    }


}
