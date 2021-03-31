package actions;

import com.codeborne.selenide.Condition;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MyAccountPage;
import pages.StoreMainPage;

import static com.codeborne.selenide.Condition.*;

public class CreateAccountAction {
    private final StoreMainPage smp;
    private final AuthenticationPage ap;
    private final CreateAccountPage cap;
    private final MyAccountPage map;

    public CreateAccountAction(){
        smp = new StoreMainPage();
        ap = new AuthenticationPage();
        cap = new CreateAccountPage();
        map = new MyAccountPage();
    }

    public void clickOnSignIn() {
        smp.getSignInButton().shouldBe(exist).click();
    }

    public void enterEmail(final String email) {
        ap.getEmailField().shouldBe(Condition.visible).setValue(email);
    }

    public void submitEmail() {
        ap.getSubmitEmailButton().shouldBe(Condition.enabled).click();
    }

    public void enterFirstName(final String firstName) {
        cap.getFirstNameField().shouldBe(Condition.visible).setValue(firstName);
    }
    public void enterLastName(final String lastName) {
        cap.getLastNameField().shouldBe(Condition.visible).setValue(lastName);
    }
    public void enterPassword(final String password) {
        cap.getPasswordField().shouldBe(Condition.visible).setValue(password);
    }
    public void enterAddress(final String address) {
        cap.getAddressField().shouldBe(Condition.visible).setValue(address);
    }
    public void enterCity(final String city) {
        cap.getCityField().shouldBe(Condition.visible).setValue(city);
    }

    public void chooseState(final String state) {
        cap.getStateDropDownList().should(exist).selectOption(state);
    }

    public void enterPostcode(final String postcode) {
        cap.getPostcodeField().shouldBe(Condition.visible).setValue(postcode);
    }
    public void chooseCountry(final String country) {
        cap.getCountryDropDownList().should(exist).selectOption(country);
    }
    public void enterMobilePhone(final String mobilePhone) {
        cap.getMobilePhoneField().shouldBe(Condition.visible).setValue(mobilePhone);
    }

    public void enterFirstName2(final String firstName2) {
        cap.getFirstNameField2().shouldBe(Condition.visible).setValue(firstName2);
    }

    public void enterLastName2(final String lastName2) {
        cap.getLastNameField2().shouldBe(Condition.visible).setValue(lastName2);
    }

    public void enterAddressAlias(final String addressAlias) {
        cap.getAddressAliasField().shouldBe(Condition.visible).setValue(addressAlias);
    }

    public void submitNewAccount() {
        cap.getSubmitNewAccountButton().shouldBe(Condition.enabled).click();
    }


    public void checkAccountIsCreated() {
        map.getMyAccountText().waitUntil(appear, 8000).shouldHave(text("MY ACCOUNT"));
    }

    public void checkFirstAndLastName(String firstName, String lastName) {
        map.getMyFirstAndLastNameText().shouldHave(text(firstName + " " + lastName));
    }

    public void clickOnSignOut() {
        smp.getSignOutButton().shouldBe(exist).click();
    }

    //actions for optional fields

    public void chooseMaleGender() {
        cap.getGender1RadioButton().should(exist).shouldNotBe(selected).click();
        cap.getGender1RadioButton().shouldBe(selected);
    }

    public void chooseFemaleGender() {
        cap.getGender2RadioButton().should(exist).shouldNotBe(selected).click();
        cap.getGender2RadioButton().shouldBe(selected);
    }

    public void chooseDayOfBirth(final String dayOfBirth) {
        cap.getDayOfBirthDropDownList().should(exist).selectOptionByValue(dayOfBirth);
    }

    public void chooseMonthOfBirth(String monthOfBirth) {
        cap.getMonthOfBirthDropDownList().selectOptionContainingText(monthOfBirth);
    }

    public void chooseYearOfBirth(final String yearOfBirth) {
        cap.getYearOfBirthDropDownList().should(exist).selectOptionByValue(yearOfBirth);
    }

    public void checkNewsletterCheckBox() {
        cap.getNewsletterCheckBox().should(exist).shouldNotBe(checked).click();
        cap.getNewsletterCheckBox().shouldBe(checked);
    }

    public void checkOffersCheckBox() {
        cap.getOffersCheckBox().should(exist).shouldNotBe(checked).click();
        cap.getOffersCheckBox().shouldBe(checked);
    }

    public void enterCompany(final String company) {
        cap.getCompanyField().shouldBe(Condition.visible).setValue(company);
    }

    public void enterAddress2(final String address2) {
        cap.getAddress2Field().shouldBe(Condition.visible).setValue(address2);
    }

    public void enterAddInfo(final String addInfo) {
        cap.getAddInfoField().shouldBe(Condition.visible).setValue(addInfo);
    }

    public void enterHomePhoneField(final String homePhone) {
        cap.getHomePhoneField().shouldBe(Condition.visible).setValue(homePhone);
    }

}
