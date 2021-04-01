package actions;

import com.codeborne.selenide.Condition;
import pages.AuthenticationPage;
import pages.MyAccountPage;
import pages.StoreMainPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;

public class LoginAction {
    private final StoreMainPage smp;
    private final AuthenticationPage ap;
    private final MyAccountPage map;

    public LoginAction(){
        smp = new StoreMainPage();
        ap = new AuthenticationPage();
        map = new MyAccountPage();
    }

    public void clickOnSignIn() {
        smp.getSignInButton().shouldBe(exist).click();
    }

    public void enterRegisteredEmail(final String registeredEmail) {
        ap.getRegisteredEmailField().shouldBe(Condition.visible).setValue(registeredEmail);
    }

    public void enterPassword(final String password) {
        ap.getPasswordField().shouldBe(Condition.visible).setValue(password);
    }

    public void clickOnSubmitLogin() {
        ap.getSubmitLoginButton().shouldBe(Condition.enabled).click();
    }

    public void checkAccountIsCreated() {
        map.getMyAccountText().waitUntil(appear, 8000).shouldHave(text("MY ACCOUNT"));
    }

    public void clickOnSignOut() {
        smp.getSignOutButton().shouldBe(exist).click();
    }

}
