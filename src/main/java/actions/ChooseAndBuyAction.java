package actions;

import com.codeborne.selenide.Condition;
import pages.*;

import java.util.logging.Level;

import static com.codeborne.selenide.Condition.*;
import static utils.ActionsLogger.LOGGER;

public class ChooseAndBuyAction {
    private final StoreMainPage storeMainPage;
    private final ProductPage productPage;
    private final MyCartPage myCartPage;
    private final MyAccountPage myAccountPage;
    private final OrderHistoryPage orderHistoryPage;
    private final LoginAction loginAction;

    public ChooseAndBuyAction() {
        storeMainPage = new StoreMainPage();
        productPage = new ProductPage();
        myCartPage = new MyCartPage();
        myAccountPage = new MyAccountPage();
        orderHistoryPage = new OrderHistoryPage();
        loginAction = new LoginAction();
    }

    public void clickOnLogo() {
        LOGGER.log(Level.INFO,"User clicks on site logo");
        storeMainPage.getLogoPicture().shouldBe(Condition.visible).click();
    }

    public void clickOnProduct(){
        LOGGER.log(Level.INFO,"User clicks on printed chiffon dress");
        storeMainPage.getPrintedChiffonDressPicture().should(visible).click();
    }

    public void addToCart() {
        LOGGER.log(Level.INFO,"User adds product to cart");
        productPage.getAddToCartButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutFirst() {
        LOGGER.log(Level.INFO,"User clicks on first Proceed to checkout button");
        myCartPage.getProceedToCheckoutOneButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutSecond() {
        LOGGER.log(Level.INFO,"User clicks on second Proceed to checkout button");
        myCartPage.getProceedToCheckoutSecondButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutThird() {
        LOGGER.log(Level.INFO,"User clicks on third Proceed to checkout button");
        myCartPage.getProceedToCheckoutThirdButton().shouldBe(enabled).click();
    }

    public void checkIAgree() {
        LOGGER.log(Level.INFO,"User checks I agree checkbox");
        myCartPage.getIAgreeCheckbox().should(visible).shouldNotBe(checked).click();
        myCartPage.getIAgreeCheckbox().shouldBe(checked);
    }

    public void proceedToCheckoutForth() {
        LOGGER.log(Level.INFO,"User clicks on forth Proceed to checkout button");
        myCartPage.getProceedToCheckoutForthButton().shouldBe(enabled).click();
    }

    public void choosePayByBankWire() {
        LOGGER.log(Level.INFO,"User clicks on Pay by bank wire button");
        myCartPage.getPayByBankWireButton().shouldBe(enabled).click();
    }

    public void confirmMyOrder() {
        LOGGER.log(Level.INFO,"User clicks on Confirm my order button");
        myCartPage.getIConfirmMyOrderButton().shouldBe(enabled).click();
    }

    public void openMyAccount() {
        LOGGER.log(Level.INFO,"User opens account");
        myAccountPage.getMyNameLinkText().shouldBe(visible).click();
    }

    public void openMyOrderHistory() {
        LOGGER.log(Level.INFO,"User clicks on My order history button");
        myAccountPage.getMyOrderHistoryButton().shouldBe(visible).click();
    }

    public void openMyLastOrder() {
        LOGGER.log(Level.INFO,"User opens last order");
        orderHistoryPage.getMyLastOrderLinkText().shouldBe(visible).click();
    }

    public void openAccountAndOpenOrderHistoryAndCheckNameAndPriceInLastOrder(final String itemName, final String price) {
        LOGGER.log(Level.INFO,"User opens account, opens order history and check name and price in last order");
        openMyAccount();
        openMyOrderHistory();
        openMyLastOrder();
        orderHistoryPage.getItemNameInOrderText().shouldBe(visible).shouldHave(text(itemName));
        orderHistoryPage.getTotalOrderPriceText().shouldBe(visible).shouldHave(text(price));
    }

    public void firstStepOfPurchase(){
        LOGGER.log(Level.INFO,"User clicks on product, add it to cart and clicks Proceed to checkout twice");
        clickOnProduct();
        addToCart();
        proceedToCheckoutFirst();
        proceedToCheckoutSecond();
    }

    public void loginDuringPurchase(final String email, final String password){
        LOGGER.log(Level.INFO,"User enters email, password and submit login");
        loginAction.enterRegisteredEmail(email);
        loginAction.enterPassword(password);
        loginAction.clickOnSubmitLogin();
    }

    public void secondStepOfPurchase() {
        LOGGER.log(Level.INFO,"User clicks proceed to checkout twice, pays by bank wire and confirm order");
        proceedToCheckoutThird();
        checkIAgree();
        proceedToCheckoutForth();
        choosePayByBankWire();
        confirmMyOrder();
    }

    public void loginAndOpenMainPage(final String email, final String password){
        LOGGER.log(Level.INFO,"User clicks on sign in, enters email, password and submit login");
        loginAction.clickOnSignIn();
        loginAction.enterRegisteredEmail(email);
        loginAction.enterPassword(password);
        loginAction.clickOnSubmitLogin();
        clickOnLogo();
    }

}
