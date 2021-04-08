package actions;

import com.codeborne.selenide.Condition;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MyAccountPage;
import pages.StoreMainPage;
import utils.User;

import static com.codeborne.selenide.Condition.*;

public class CreateAccountAction {
    private final StoreMainPage storeMainPage;
    private final AuthenticationPage authenticationPage;
    private final CreateAccountPage createAccountPage;
    private final MyAccountPage myAccountPage;

    public CreateAccountAction() {
        storeMainPage = new StoreMainPage();
        authenticationPage = new AuthenticationPage();
        createAccountPage = new CreateAccountPage();
        myAccountPage = new MyAccountPage();
    }

    public void clickOnSignIn() {
        storeMainPage.getSignInButton().shouldBe(exist).click();
    }

    public void enterEmail(final String email) {
        authenticationPage.getEmailField().shouldBe(Condition.visible).setValue(email);
    }

    public void submitEmail() {
        authenticationPage.getSubmitEmailButton().shouldBe(Condition.enabled).click();
    }

    public void enterFirstName(final String firstName) {
        createAccountPage.getFirstNameField().shouldBe(Condition.visible).setValue(firstName);
    }

    public void enterLastName(final String lastName) {
        createAccountPage.getLastNameField().shouldBe(Condition.visible).setValue(lastName);
    }

    public void enterPassword(final String password) {
        createAccountPage.getPasswordField().shouldBe(Condition.visible).setValue(password);
    }

    public void enterAddress(final String address) {
        createAccountPage.getAddressField().shouldBe(Condition.visible).setValue(address);
    }

    public void enterCity(final String city) {
        createAccountPage.getCityField().shouldBe(Condition.visible).setValue(city);
    }

    public void chooseState(final String state) {
        createAccountPage.getStateDropDownList().should(exist).selectOption(state);
    }

    public void enterPostcode(final String postcode) {
        createAccountPage.getPostcodeField().shouldBe(Condition.visible).setValue(postcode);
    }

    public void chooseCountry(final String country) {
        createAccountPage.getCountryDropDownList().should(exist).selectOption(country);
    }

    public void enterMobilePhone(final String mobilePhone) {
        createAccountPage.getMobilePhoneField().shouldBe(Condition.visible).setValue(mobilePhone);
    }

    public void enterFirstNameYourAddress(final String firstName2) {
        createAccountPage.getFirstNameYourAddressField().shouldBe(Condition.visible).setValue(firstName2);
    }

    public void enterLastNameYourAddress(final String lastName2) {
        createAccountPage.getLastNameYourAddressField().shouldBe(Condition.visible).setValue(lastName2);
    }

    public void enterAddressAlias(final String addressAlias) {
        createAccountPage.getAddressAliasField().shouldBe(Condition.visible).setValue(addressAlias);
    }

    public void submitNewAccount() {
        createAccountPage.getSubmitNewAccountButton().shouldBe(Condition.enabled).click();
    }

    public void checkAccountIsCreated() {
        myAccountPage.getMyAccountText().should(appear).shouldHave(text("MY ACCOUNT"));
    }

    public void checkFirstAndLastName(String firstName, String lastName) {
        myAccountPage.getMyFirstAndLastNameText().shouldHave(text(firstName + " " + lastName));
    }

    public void clickOnSignOut() {
        if (storeMainPage.getSignOutButton().isDisplayed()){
            storeMainPage.getSignOutButton().click();
        }
    }

    public void chooseMaleGender() {
        createAccountPage.getManGenderRadioButton().should(exist).shouldNotBe(selected).click();
        createAccountPage.getManGenderRadioButton().shouldBe(selected);
    }

    public void chooseFemaleGender() {
        createAccountPage.getWomanRadioButton().should(exist).shouldNotBe(selected).click();
        createAccountPage.getWomanRadioButton().shouldBe(selected);
    }

    public void chooseDayOfBirth(final String dayOfBirth) {
        createAccountPage.getDayOfBirthDropDownList().should(exist).selectOptionByValue(dayOfBirth);
    }

    public void chooseMonthOfBirth(final String monthOfBirth) {
        createAccountPage.getMonthOfBirthDropDownList().should(exist).selectOptionContainingText(monthOfBirth);
    }

    public void chooseYearOfBirth(final String yearOfBirth) {
        createAccountPage.getYearOfBirthDropDownList().should(exist).selectOptionByValue(yearOfBirth);
    }

    public void checkNewsletterCheckBox() {
        createAccountPage.getNewsletterCheckBox().should(exist).shouldNotBe(checked).click();
        createAccountPage.getNewsletterCheckBox().shouldBe(checked);
    }

    public void checkOffersCheckBox() {
        createAccountPage.getOffersCheckBox().should(exist).shouldNotBe(checked).click();
        createAccountPage.getOffersCheckBox().shouldBe(checked);
    }

    public void enterCompany(final String company) {
        createAccountPage.getCompanyField().shouldBe(Condition.visible).setValue(company);
    }

    public void enterAdditionalAddress(final String address) {
        createAccountPage.getAdditionalAddressField().shouldBe(Condition.visible).setValue(address);
    }

    public void enterAddInfo(final String addInfo) {
        createAccountPage.getAddInfoField().shouldBe(Condition.visible).setValue(addInfo);
    }

    public void enterHomePhoneField(final String homePhone) {
        createAccountPage.getHomePhoneField().shouldBe(Condition.visible).setValue(homePhone);
    }

    public void firstRegistrationStep(final User user) {
        enterEmail(user.getEmail());
        submitEmail();
    }

    public void fillInRequiredFields(final User user){
        enterFirstName(user.getFirstName());
        enterLastName(user.getLastName());
        enterAddress(user.getAddress());
        enterCity(user.getCity());
        chooseState(user.getState());
        enterPostcode(user.getPostcode());
        chooseCountry(user.getCountry());
        enterMobilePhone(user.getMobilePhone());
        enterPassword(user.getPassword());
    }

    public void fillInOptionalFields(final User user){
        chooseDayOfBirth(user.getDayOfBirth());
        chooseMonthOfBirth(user.getMonthOfBirth());
        chooseYearOfBirth(user.getYearOfBirth());
        checkNewsletterCheckBox();
        checkOffersCheckBox();
        enterCompany(user.getCompany());
        enterAdditionalAddress(user.getAdditionalAddress());
        enterAddInfo(user.getAdditionalInfo());
        enterHomePhoneField(user.getHomePhone());
    }

    public void fillInOptionalFieldsMale(final User maleUser) {
        chooseMaleGender();
        fillInOptionalFields(maleUser);
    }

    public void fillInOptionalFieldsFemale(final User femaleUser) {
        chooseFemaleGender();
        fillInOptionalFields(femaleUser);
    }

    public void checkCreatedAccount(final User user){
        checkAccountIsCreated();
        checkFirstAndLastName(user.getFirstName(), user.getLastName());
    }

    public void rewriteDefaultFields(final User user) {
        enterFirstNameYourAddress(user.getDefaultFirstName());
        enterLastNameYourAddress(user.getDefaultLastName());
        enterAddressAlias(user.getDefaultAddressAlias());
        enterPassword(user.getPassword());
    }

}
