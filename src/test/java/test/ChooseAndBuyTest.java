package test;

import actions.ChooseAndBuyAction;
import utils.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChooseAndBuyTest {
    private Configuration configuration;
    private ChooseAndBuyAction chooseAndBuyAction;
    private static final String EMAIL = "a@testemail.com";
    private static final String PASSWORD = "qawsedrftgyhu";
    private static final String PRINTED_CHIFFON_DRESS = "Printed Chiffon Dress";
    private static final String PRICE = "$16.40";



    @BeforeTest
    private void openSite(){
        configuration = new Configuration();
        chooseAndBuyAction = new ChooseAndBuyAction();
        configuration.openSite();
    }

    @Test(description = "User buys a product and than login")
    private void buyAndLogin() {
        chooseAndBuyAction.firstStepOfPurchase();
        chooseAndBuyAction.loginDuringPurchase(EMAIL,PASSWORD);
        chooseAndBuyAction.secondStepOfPurchase();
        chooseAndBuyAction.openAccountAndOpenOrderHistoryAndCheckNameAndPriceInLastOrder(PRINTED_CHIFFON_DRESS, PRICE);
    }

    @Test(description = "User login and buys a product")
    private void loginAndBuy() {
        chooseAndBuyAction.loginAndOpenMainPage(EMAIL,PASSWORD);
        chooseAndBuyAction.firstStepOfPurchase();
        chooseAndBuyAction.secondStepOfPurchase();
        chooseAndBuyAction.openAccountAndOpenOrderHistoryAndCheckNameAndPriceInLastOrder(PRINTED_CHIFFON_DRESS, PRICE);
    }

}


