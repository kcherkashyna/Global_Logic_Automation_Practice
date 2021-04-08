package test;

import actions.LoginAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Configuration;
import utils.DataProviderLogin;
import utils.User;

import static utils.DataProviderLogin.TEST_DATA_NEGATIVE;
import static utils.DataProviderLogin.TEST_DATA_POSITIVE;

public class LoginTest {
    private Configuration configuration;
    private LoginAction loginAction;

    @BeforeTest
    private void openSite(){
        configuration = new Configuration();
        loginAction = new LoginAction();
        configuration.openSite();
    }

    @Test(description = "User should be able to login in to app", dataProvider = TEST_DATA_POSITIVE, dataProviderClass = DataProviderLogin.class)
    private void userSignInWithValidCredentials(User user) {
        loginAction.enterEmailAndLogin(user);
        loginAction.checkAccountIsCreated();

    }

    @Test(description = "User tries to login with invalid credentials", dataProvider = TEST_DATA_NEGATIVE, dataProviderClass = DataProviderLogin.class)
    private void userSignInWithInvalidCredentials(User user) {
        loginAction.enterEmailAndLogin(user);
        loginAction.checkAccountIsNotCreated();
    }

    @AfterMethod
    private void closeSite(){
        loginAction.clickOnSignOut();
    }

}