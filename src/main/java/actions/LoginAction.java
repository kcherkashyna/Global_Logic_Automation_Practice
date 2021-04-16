package actions;

import com.codeborne.selenide.Condition;
import pages.AuthenticationPage;
import pages.MyAccountPage;
import pages.StoreMainPage;
import utils.User;

import java.util.logging.Level;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static utils.ActionsLogger.LOGGER;

public class LoginAction {
    private final StoreMainPage storeMainPage;
    private final AuthenticationPage authenticationPage;
    private final MyAccountPage myAccountPage;
    private static final String MY_ACCOUNT = "MY ACCOUNT";

    public LoginAction(){
        storeMainPage = new StoreMainPage();
        authenticationPage = new AuthenticationPage();
        myAccountPage = new MyAccountPage();
    }

    public void clickOnSignIn() {
        LOGGER.log(Level.INFO,"User clicks on sign in");
        storeMainPage.getSignInButton().shouldBe(visible).click();
    }

    public void enterRegisteredEmail(final String registeredEmail) {
        LOGGER.log(Level.INFO,"User enters registered email");
        authenticationPage.getRegisteredEmailField().shouldBe(Condition.visible).setValue(registeredEmail);
    }

    public void enterPassword(final String password) {
        LOGGER.log(Level.INFO,"User enters password");
        authenticationPage.getPasswordField().shouldBe(Condition.visible).setValue(password);
    }

    public void clickOnSubmitLogin() {
        LOGGER.log(Level.INFO,"User submits login");
        authenticationPage.getSubmitLoginButton().shouldBe(Condition.enabled).click();
    }

    public void checkAccountIsCreated() {
        LOGGER.log(Level.INFO,"User checks account is created");
        myAccountPage.getMyAccountText().shouldHave(text(MY_ACCOUNT));
    }

    public void checkAccountIsNotCreated() {
        LOGGER.log(Level.INFO,"User checks account is not created");
        myAccountPage.getMyAccountText().shouldNotHave(text(MY_ACCOUNT));
    }

    public void clickOnSignOut() {
        LOGGER.log(Level.INFO,"User clicks on sign out");
        if(storeMainPage.getSignOutButton().isDisplayed()){
            storeMainPage.getSignOutButton().click();
        }
    }

    public void enterCredentialsAndSubmitLogin(final User user) {
        LOGGER.log(Level.INFO,"User enters credentials and submit login");
        clickOnSignIn();
        enterRegisteredEmail(user.getEmail());
        enterPassword(user.getPassword());
        clickOnSubmitLogin();
    }

}
