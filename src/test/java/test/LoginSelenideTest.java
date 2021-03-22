package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MyAccountPage;
import pages.StoreMainPage;

public class LoginSelenideTest {

    private final static String TESTDATA = "DataProvider";

    @DataProvider(name = "DataProvider")
    public static Object[][] getUserData1() {
        return new Object[][]{

                {"onlyletters@gmail.com", "1234567890"},
                {"000777333111222@gmail.com", "1234567890"},
                {"user_&333@gmail.com", "1_&345"},
                {"CAPITALLETTERS@gmail.com", "ABCDE"},
                {"long_email_123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123@gmail.com",
                        "12345678901234567890123456789012"},

                {"", ""},
                {"", "12345"},
                {"email1___1@gmail.com", ""},
                {"@gmail.com", "12345"},
                {"email2___2@gmail.com", "1234"},

        };
    }

    @Test (dataProvider = TESTDATA)
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

        storeMainPage.clickOnSignOut();
    }
}