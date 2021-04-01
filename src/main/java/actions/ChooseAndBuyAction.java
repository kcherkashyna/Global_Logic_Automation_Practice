package actions;

import com.codeborne.selenide.Condition;
import pages.*;

import static com.codeborne.selenide.Condition.*;

public class ChooseAndBuyAction {
    private final StoreMainPage smp;
    private final AuthenticationPage ap;
    private final PrintedShiffonDressPage psdp;
    private final MyCartPage mcp;
    private final MyAccountPage map;
    private final OrderHistoryPage ohp;

    public ChooseAndBuyAction() {
        smp = new StoreMainPage();
        ap = new AuthenticationPage();
        psdp = new PrintedShiffonDressPage();
        mcp = new MyCartPage();
        map = new MyAccountPage();
        ohp = new OrderHistoryPage();
    }

    public void clickOnLogo() {
        smp.getLogoPicture().shouldBe(Condition.visible).click();
    }

    public void clickOnProduct(){
        smp.getPrintedChiffonDress().should(exist).click();
    }

    public void addToCart() {
        psdp.getAddToCartButton().shouldBe(enabled).click();
    }

    public void proceedToCheckout1() {
        mcp.getProceedToCheckout1Button().shouldBe(enabled).click();
    }

    public void proceedToCheckout2() {
        mcp.getProceedToCheckout2Button().shouldBe(enabled).click();
    }

    public void proceedToCheckout3() {
        mcp.getProceedToCheckout3Button().shouldBe(enabled).click();
    }

    public void checkIAgree() {
        mcp.getIAgreeCheckbox().should(exist).shouldNotBe(checked).click();
        mcp.getIAgreeCheckbox().shouldBe(checked);
    }

    public void proceedToCheckout4() {
        mcp.getProceedToCheckout4Button().shouldBe(enabled).click();
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
