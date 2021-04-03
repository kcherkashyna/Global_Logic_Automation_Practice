package actions;

import com.codeborne.selenide.Condition;
import pages.*;

import static com.codeborne.selenide.Condition.*;

public class ChooseAndBuyAction {
    private final StoreMainPage smp;
    private final ProductPage pcdp;
    private final MyCartPage mcp;
    private final MyAccountPage map;
    private final OrderHistoryPage ohp;

    public ChooseAndBuyAction() {
        smp = new StoreMainPage();
        pcdp = new ProductPage();
        mcp = new MyCartPage();
        map = new MyAccountPage();
        ohp = new OrderHistoryPage();
    }

    public void clickOnLogo() {
        smp.getLogoPicture().shouldBe(Condition.visible).click();
    }

    public void clickOnProduct(){
        smp.getPrintedChiffonDressPicture().should(exist).click();
    }

    public void addToCart() {
        pcdp.getAddToCartButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutFirst() {
        mcp.getProceedToCheckoutOneButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutSecond() {
        mcp.getProceedToCheckoutSecondButton().shouldBe(enabled).click();
    }

    public void proceedToCheckoutThird() {
        mcp.getProceedToCheckoutThirdButton().shouldBe(enabled).click();
    }

    public void checkIAgree() {
        mcp.getIAgreeCheckbox().should(exist).shouldNotBe(checked).click();
        mcp.getIAgreeCheckbox().shouldBe(checked);
    }

    public void proceedToCheckoutForth() {
        mcp.getProceedToCheckoutForthButton().shouldBe(enabled).click();
    }

    public void choosePayByBankWire() {
        mcp.getPayByBankWireButton().shouldBe(enabled).click();
    }

    public void confirmMyOrder() {
        mcp.getIConfirmMyOrderButton().shouldBe(enabled).click();
    }

    public void openMyAccount() {
        map.getMyNameLinkText().shouldBe(visible).click();
    }

    public void openMyOrderHistory() {
        map.getMyOrderHistoryButton().shouldBe(visible).click();
    }

    public void openMyLastOrder() {
        ohp.getMyLastOrderLinkText().shouldBe(visible).click();
    }

    public void checkItemNameInOrder(final String itemName) {
        ohp.getItemNameInOrderText().shouldBe(visible).shouldHave(text(itemName));
    }

    public void checkTotalOrderPrice(final String price) {
        ohp.getTotalOrderPriceText().shouldBe(visible).shouldHave(text(price));
    }
}
