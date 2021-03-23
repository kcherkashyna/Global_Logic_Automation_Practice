package test;

import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MyAccountPage;
import pages.StoreMainPage;

import static test.DataProviderClass.TESTDATA;

public class CreateAccountTest {

    @Test(dataProvider = TESTDATA, dataProviderClass = DataProviderClass.class)

    public void createAccount(String email, String password) {

        StoreMainPage storeMainPage = new StoreMainPage();
        AuthenticationPage authenticationPage = new AuthenticationPage();
        CreateAccountPage createAccountPage = new CreateAccountPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        storeMainPage.openSite();
        storeMainPage.clickOnSignIn();

        authenticationPage.enterEmail(email);
        authenticationPage.submitEmail();

        createAccountPage.enterFirstName("Kate");
        createAccountPage.enterLastName("Cherkashyna");
        createAccountPage.enterPassword(password);
        createAccountPage.enterAddress("Address");
        createAccountPage.enterCity("Kharkiv");
        createAccountPage.chooseState("Alabama");
        createAccountPage.enterPostcode("11111");
        createAccountPage.enterMobilePhone("111111");
        createAccountPage.submitNewAccount();

        myAccountPage.checkAccountIsCreated();
        myAccountPage.checkFirstAndLastName("Kate Cherkashyna");

        storeMainPage.clickOnSignOut();
    }

}


