package test;

import actions.ConfigurationAction;
import actions.LoginAction;
import org.testng.annotations.Test;
import utils.DataProviderLogin;

import static utils.DataProviderLogin.TEST_DATA_POSITIVE;
import static utils.DataProviderLogin.TEST_DATA_NEGATIVE;

public class LoginTest {
    private final ConfigurationAction ca;
    private final LoginAction la;

    LoginTest(){
        ca = new ConfigurationAction();
        la = new LoginAction();
    }

    @Test(description = "User should be able to login in to app", dataProvider = TEST_DATA_POSITIVE, dataProviderClass = DataProviderLogin.class)
    private void userSignInWithValidCredentials(final String email, final String password) {
        ca.openSite();
        la.clickOnSignIn();
        la.enterRegisteredEmail(email);
        la.enterPassword(password);
        la.clickOnSubmitLogin();
        la.checkAccountIsCreated();
        la.clickOnSignOut();
    }

    @Test(description = "User tries to login with invalid credentials", dataProvider = TEST_DATA_NEGATIVE, dataProviderClass = DataProviderLogin.class)
    private void userSignInWithInvalidCredentials(final String email, final String password) {
        ca.openSite();
        la.clickOnSignIn();
        la.enterRegisteredEmail(email);
        la.enterPassword(password);
        la.clickOnSubmitLogin();
        la.checkAccountIsCreated();
        la.clickOnSignOut();
    }

}