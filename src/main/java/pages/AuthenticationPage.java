package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
/*
Need to add action package with classes that will contain action methods
Page classes shall contain getters for SelenideElements and ElementCollection
*/
public class AuthenticationPage {

    public AuthenticationPage() {
    }

//Method parameters should be always final
//    public void enterEmail(final String email) {
//        $("#email_create").setValue(email);
//    }
//
//    public void submitEmail() {
//          Always check is element visible, present,etc before interact with it
//        $("#SubmitCreate").click();
//    }


    public SelenideElement getEmailField(){
        return $("#email_create");
    }

    public SelenideElement getSubmitEmailButton(){
        return $("#SubmitCreate");
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
