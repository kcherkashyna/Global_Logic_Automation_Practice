package test;

import actions.ChooseAndBuyAction;
import actions.ConfigurationAction;
import actions.LoginAction;
import org.testng.annotations.Test;

public class ChooseAndBuyTest {

    ConfigurationAction ca;
    LoginAction la;
    ChooseAndBuyAction caba;

    ChooseAndBuyTest(){
        ca = new ConfigurationAction();
        la = new LoginAction();
        caba = new ChooseAndBuyAction();
    }

    @Test(description = "User buys a product and than login")
    private void buyAndLogin() {
        ca.openSite();
        caba.clickOnProduct();
        caba.addToCart();
        caba.proceedToCheckoutFirst();
        caba.proceedToCheckoutSecond();
        la.enterRegisteredEmail("a@testemail.com");
        la.enterPassword("qawsedrftgyhu");
        la.clickOnSubmitLogin();
        caba.proceedToCheckoutThird();
        caba.checkIAgree();
        caba.proceedToCheckoutForth();
        caba.choosePayByBankWire();
        caba.confirmMyOrder();

        caba.openMyAccount();
        caba.openMyOrderHistory();
        caba.openMyLastOrder();

        caba.checkItemNameInOrder("Printed Chiffon Dress");
        caba.checkTotalOrderPrice("$16.40");
    }

    @Test(description = "User login and buys a product")
    private void loginAndBuy() {
        ca.openSite();
        la.clickOnSignIn();
        la.enterRegisteredEmail("a@testemail.com");
        la.enterPassword("qawsedrftgyhu");
        la.clickOnSubmitLogin();
        caba.clickOnLogo();

        caba.clickOnProduct();
        caba.addToCart();
        caba.proceedToCheckoutFirst();
        caba.proceedToCheckoutSecond();
        caba.proceedToCheckoutThird();
        caba.checkIAgree();
        caba.proceedToCheckoutForth();
        caba.choosePayByBankWire();
        caba.confirmMyOrder();

        caba.openMyAccount();
        caba.openMyOrderHistory();
        caba.openMyLastOrder();

        caba.checkItemNameInOrder("Printed Chiffon Dress");
        caba.checkTotalOrderPrice("$16.40");
    }

}


