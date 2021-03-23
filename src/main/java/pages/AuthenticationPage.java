package pages;

import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage {

    public void enterEmail(String email) {
        $("#email_create").setValue(email);
    }

    public void submitEmail() {
        $("#SubmitCreate").click();
    }

    public void enterRegisteredEmail(String registeredEmail) {
        $("#email").setValue(registeredEmail);
    }

    public void enterPassword(String password) {
        $("#passwd").setValue(password);
    }

    public void clickOnSubmitLogin() {
        $("#SubmitLogin").click();
    }

}
