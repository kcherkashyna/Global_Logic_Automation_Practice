package test;

import actions.ChooseAndBuyAction;
import utils.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChooseAndBuyTest {
    private Configuration configuration;
    private ChooseAndBuyAction chooseAndBuyAction;

    @BeforeTest
    private void openSite(){
        configuration = new Configuration();
        chooseAndBuyAction = new ChooseAndBuyAction();
        configuration.openSite();
    }

    @Test(description = "User buys a product and than login")
    private void buyAndLogin() {
        chooseAndBuyAction.firstStepOfPurchase();
        chooseAndBuyAction.loginDuringPurchase();
        chooseAndBuyAction.secondStepOfPurchase();
        chooseAndBuyAction.checkItemInOrder("Printed Chiffon Dress", "$16.40");
    }

    @Test(description = "User login and buys a product")
    private void loginAndBuy() {
        chooseAndBuyAction.loginBeforePurchase();
        chooseAndBuyAction.firstStepOfPurchase();
        chooseAndBuyAction.secondStepOfPurchase();
        chooseAndBuyAction.checkItemInOrder("Printed Chiffon Dress", "$16.40");
    }

}


