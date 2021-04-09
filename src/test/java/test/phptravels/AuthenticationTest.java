package test.phptravels;

import actions.phptravels.MyAccountAction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.phptravels.Helper;


public class AuthenticationTest {


    private String cookieName = "ci_session";

    private MyAccountAction myAccountAction;
    private Helper helper;

    @BeforeTest
    public void openSite() {
        myAccountAction = new MyAccountAction();
        helper = new Helper();
        helper.getCoookieValue();
    }

    @Test
    public void checkUserName() {
        myAccountAction.checkMyAccountName();
    }

}