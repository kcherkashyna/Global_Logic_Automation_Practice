package actions;

import com.codeborne.selenide.Condition;
import pages.*;

import static com.codeborne.selenide.Condition.*;

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
        storeMainPage.getLogoPicture().shouldBe(Condition.visible).click();
    }

    public void clickOnProduct(){
        storeMainPage.getPrintedChiffonDressPicture().should(exist).click();
    }

    public void addToCart() {
        productPage.getAddToCartButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutFirst() {
        myCartPage.getProceedToCheckoutOneButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutSecond() {
        myCartPage.getProceedToCheckoutSecondButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutThird() {
        myCartPage.getProceedToCheckoutThirdButton().shouldBe(enabled).click();
    }

    public void checkIAgree() {
        myCartPage.getIAgreeCheckbox().should(exist).shouldNotBe(checked).click();
        myCartPage.getIAgreeCheckbox().shouldBe(checked);
    }

    public void proceedToCheckoutForth() {
        myCartPage.getProceedToCheckoutForthButton().shouldBe(enabled).click();
    }

    public void choosePayByBankWire() {
        myCartPage.getPayByBankWireButton().shouldBe(enabled).click();
    }

    public void confirmMyOrder() {
        myCartPage.getIConfirmMyOrderButton().shouldBe(enabled).click();
    }

    public void openMyAccount() {
        myAccountPage.getMyNameLinkText().shouldBe(visible).click();
    }

    public void openMyOrderHistory() {
        myAccountPage.getMyOrderHistoryButton().shouldBe(visible).click();
    }

    public void openMyLastOrder() {
        orderHistoryPage.getMyLastOrderLinkText().shouldBe(visible).click();
    }

    public void checkItemInOrder(final String itemName, final String price) {
        openMyAccount();
        openMyOrderHistory();
        openMyLastOrder();
        orderHistoryPage.getItemNameInOrderText().shouldBe(visible).shouldHave(text(itemName));
        orderHistoryPage.getTotalOrderPriceText().shouldBe(visible).shouldHave(text(price));
    }

    public void firstStepOfPurchase(){
        clickOnProduct();
        addToCart();
        proceedToCheckoutFirst();
        proceedToCheckoutSecond();
    }

    public void loginDuringPurchase(){
        loginAction.enterRegisteredEmail("a@testemail.com");
        loginAction.enterPassword("qawsedrftgyhu");
        loginAction.clickOnSubmitLogin();
    }

    public void secondStepOfPurchase() {
        proceedToCheckoutThird();
        checkIAgree();
        proceedToCheckoutForth();
        choosePayByBankWire();
        confirmMyOrder();
    }

    public void loginBeforePurchase(){
        loginAction.clickOnSignIn();
        loginAction.enterRegisteredEmail("a@testemail.com");
        loginAction.enterPassword("qawsedrftgyhu");
        loginAction.clickOnSubmitLogin();
        clickOnLogo();
    }

}
