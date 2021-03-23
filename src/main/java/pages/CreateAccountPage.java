package pages;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    public void enterFirstName(String firstName) {
        $("#customer_firstname").setValue(firstName);
    }

    public void enterLastName(String customerLastName) {
        $("#customer_lastname").setValue(customerLastName);
    }

    public void enterPassword(String password) {
        $("#passwd").setValue(password);
    }

    public void enterAddress(String addressText) {
        $("#address1").setValue(addressText);
    }

    public void enterCity(String cityText) {
        $("#city").setValue(cityText);
    }

    public void chooseState(String state) {
        $("#id_state").selectOption(state);
    }

    public void enterPostcode(String postcodeText) {
        $("#postcode").setValue(postcodeText);
    }

    public void enterMobilePhone(String mobilePhoneText) {
        $("#phone_mobile").setValue(mobilePhoneText);
    }

    public void submitNewAccount() {
        $("#submitAccount").click();
    }


}


