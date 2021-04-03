package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    public SelenideElement getFirstNameField(){
        return $("#customer_firstname");
    }
    public SelenideElement getLastNameField(){
        return $("#customer_lastname");
    }

    public SelenideElement getPasswordField(){
        return $("#passwd");
    }

    public SelenideElement getAddressField(){
        return $("#address1");
    }

    public SelenideElement getCityField(){
        return $("#city");
    }

    public SelenideElement getStateDropDownList(){
        return $("#id_state");
    }

    public SelenideElement getPostcodeField(){
        return $("#postcode");
    }

    public SelenideElement getCountryDropDownList(){
        return $("#id_country");
    }

    public SelenideElement getMobilePhoneField(){
        return $("#phone_mobile");
    }

    public SelenideElement getFirstNameYourAddressField(){
        return $(".form-control#firstname");
    }

    public SelenideElement getLastNameYourAddressField(){
        return $(".form-control#lastname");
    }

    public SelenideElement getAddressAliasField(){
        return $("#alias");
    }

    public SelenideElement getSubmitNewAccountButton(){
        return $("#submitAccount");
    }

    //optional fields

    public SelenideElement getManGenderRadioButton(){
        return $("#id_gender1");
    }

    public SelenideElement getWomanRadioButton(){
        return $("#id_gender2");
    }

    public SelenideElement getDayOfBirthDropDownList(){
        return $("#days");
    }

    public SelenideElement getMonthOfBirthDropDownList(){
        return $("#months");
    }

    public SelenideElement getYearOfBirthDropDownList(){
        return $("#years");
    }

    public SelenideElement getNewsletterCheckBox(){
        return $("#newsletter");
    }

    public SelenideElement getOffersCheckBox(){
        return $("#optin");
    }

    public SelenideElement getCompanyField(){
        return $("#company");
    }

    public SelenideElement getAdditionalAddressField(){
        return $("#address2");
    }

    public SelenideElement getAddInfoField(){
        return $("#other");
    }

    public SelenideElement getHomePhoneField(){
        return $("#phone");
    }

}


