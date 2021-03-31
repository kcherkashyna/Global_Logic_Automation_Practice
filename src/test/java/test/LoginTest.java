package test;

import actions.ConfigurationAction;
import actions.LoginAction;
import org.testng.annotations.Test;
import utils.DataProviderLogin;

import static utils.DataProviderLogin.TESTDATA1;
import static utils.DataProviderLogin.TESTDATA2;

public class LoginTest {

    ConfigurationAction configurationAction = new ConfigurationAction();
    LoginAction loginAction = new LoginAction();

    @Test(dataProvider = TESTDATA1, dataProviderClass = DataProviderLogin.class)
    private void userSignIn1(final String email, final String password) {

        configurationAction.openSite();

        loginAction.clickOnSignIn();
        loginAction.enterRegisteredEmail(email);
        loginAction.enterPassword(password);
        loginAction.clickOnSubmitLogin();
        loginAction.checkAccountIsCreated();
        loginAction.clickOnSignOut();
    }
    @Test(dataProvider = TESTDATA2, dataProviderClass = DataProviderLogin.class)
    private void userSignIn2(final String email, final String password) {

        configurationAction.openSite();

        loginAction.clickOnSignIn();
        loginAction.enterRegisteredEmail(email);
        loginAction.enterPassword(password);
        loginAction.clickOnSubmitLogin();
        loginAction.checkAccountIsCreated();
        loginAction.clickOnSignOut();
    }
}