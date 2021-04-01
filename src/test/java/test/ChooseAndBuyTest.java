package test;

import actions.ChooseAndBuyAction;
import actions.ConfigurationAction;
import actions.LoginAction;
import org.testng.annotations.Test;

public class ChooseAndBuyTest {

  ConfigurationAction configurationAction = new ConfigurationAction();
  LoginAction loginAction = new LoginAction();
  ChooseAndBuyAction chooseAndBuyAction = new ChooseAndBuyAction();

  @Test
  public void chooseAndBuy1() {
    configurationAction.openSite();
    chooseAndBuyAction.clickOnProduct();
    chooseAndBuyAction.addToCart();
    chooseAndBuyAction.proceedToCheckout1();
    chooseAndBuyAction.proceedToCheckout2();
    loginAction.enterRegisteredEmail("a@testemail.com");
    loginAction.enterPassword("qawsedrftgyhu");
    loginAction.clickOnSubmitLogin();
    chooseAndBuyAction.proceedToCheckout3();
    chooseAndBuyAction.checkIAgree();
    chooseAndBuyAction.proceedToCheckout4();
    chooseAndBuyAction.choosePayByBankWire();
    chooseAndBuyAction.confirmMyOrder();

    chooseAndBuyAction.openMyAccount();
    chooseAndBuyAction.openMyOrderHistory();
    chooseAndBuyAction.openMyLastOrder();

    chooseAndBuyAction.checkItemNameInOrder("Printed Chiffon Dress");
    chooseAndBuyAction.checkTotalOrderPrice("$16.40");
  }

  @Test
  public void chooseAndBuy2() {
    configurationAction.openSite();
    loginAction.clickOnSignIn();
    loginAction.enterRegisteredEmail("a@testemail.com");
    loginAction.enterPassword("qawsedrftgyhu");
    loginAction.clickOnSubmitLogin();
    chooseAndBuyAction.clickOnLogo();

    chooseAndBuyAction.clickOnProduct();
    chooseAndBuyAction.addToCart();
    chooseAndBuyAction.proceedToCheckout1();
    chooseAndBuyAction.proceedToCheckout2();
    chooseAndBuyAction.proceedToCheckout3();
    chooseAndBuyAction.checkIAgree();
    chooseAndBuyAction.proceedToCheckout4();
    chooseAndBuyAction.choosePayByBankWire();
    chooseAndBuyAction.confirmMyOrder();

    chooseAndBuyAction.openMyAccount();
    chooseAndBuyAction.openMyOrderHistory();
    chooseAndBuyAction.openMyLastOrder();

    chooseAndBuyAction.checkItemNameInOrder("Printed Chiffon Dress");
    chooseAndBuyAction.checkTotalOrderPrice("$16.40");
  }


}


