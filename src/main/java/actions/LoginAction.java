package actions;

import com.codeborne.selenide.Condition;
import pages.AuthenticationPage;
import pages.MyAccountPage;
import pages.StoreMainPage;
import utils.User;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;

public class LoginAction {
    private final StoreMainPage storeMainPage;
    private final AuthenticationPage authenticationPage;
    private final MyAccountPage myAccountPage;

    public LoginAction(){
        storeMainPage = new StoreMainPage();
        authenticationPage = new AuthenticationPage();
        myAccountPage = new MyAccountPage();
    }

    public void clickOnSignIn() {
        storeMainPage.getSignInButton().shouldBe(exist).click();
    }

    public void enterRegisteredEmail(final String registeredEmail) {
        authenticationPage.getRegisteredEmailField().shouldBe(Condition.visible).setValue(registeredEmail);
    }

    public void enterPassword(final String password) {
        authenticationPage.getPasswordField().shouldBe(Condition.visible).setValue(password);
    }

    public void clickOnSubmitLogin() {
        authenticationPage.getSubmitLoginButton().shouldBe(Condition.enabled).click();
    }

    public void checkAccountIsCreated() {
        myAccountPage.getMyAccountText().waitUntil(appear, 8000).shouldHave(text("MY ACCOUNT"));
    }

    public void checkAccountIsNotCreated() {
        myAccountPage.getMyAccountText().waitUntil(appear, 8000).shouldNotHave(text("MY ACCOUNT"));
    }

    public void clickOnSignOut() {
        if(storeMainPage.getSignOutButton().isDisplayed()){
            storeMainPage.getSignOutButton().click();
        }
    }

    public void enterEmailAndLogin(final User user) {
        clickOnSignIn();
        enterRegisteredEmail(user.getEmail());
        enterPassword(user.getPassword());
        clickOnSubmitLogin();
    }

}
