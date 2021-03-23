package test;

import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MyAccountPage;
import pages.StoreMainPage;

import static test.DataProviderClass.TESTDATA;

public class LoginTest {

    @Test(dataProvider = TESTDATA, dataProviderClass = DataProviderClass.class)

    private void userCanSignIn(final String email, final String password) {

        StoreMainPage storeMainPage = new StoreMainPage();
        AuthenticationPage authenticationPage = new AuthenticationPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        storeMainPage.openSite();
        storeMainPage.clickOnSignIn();

        authenticationPage.enterRegisteredEmail(email);
        authenticationPage.enterPassword(password);
        authenticationPage.clickOnSubmitLogin();

        myAccountPage.checkAccountIsCreated();
        myAccountPage.checkFirstAndLastName("Kate Cherkashyna");

        storeMainPage.clickOnSignOut();
    }
}