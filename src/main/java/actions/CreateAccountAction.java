package actions;

import com.codeborne.selenide.Condition;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MyAccountPage;
import pages.StoreMainPage;
import utils.User;

import java.util.logging.Level;

import static com.codeborne.selenide.Condition.*;
import static utils.ActionsLogger.LOGGER;

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
        LOGGER.log(Level.INFO,"User clicks on sign in");
        storeMainPage.getSignInButton().shouldBe(visible).click();
    }

    public void enterEmail(final String email) {
        LOGGER.log(Level.INFO,"User enters email");
        authenticationPage.getEmailField().shouldBe(Condition.visible).setValue(email);
    }

    public void submitEmail() {
        LOGGER.log(Level.INFO,"User submit email");
        authenticationPage.getSubmitEmailButton().shouldBe(Condition.enabled).click();
    }

    public void enterFirstName(final String firstName) {
        LOGGER.log(Level.INFO,"User enters first name");
        createAccountPage.getFirstNameField().shouldBe(Condition.visible).setValue(firstName);
    }

    public void enterLastName(final String lastName) {
        LOGGER.log(Level.INFO,"User enters last name");
        createAccountPage.getLastNameField().shouldBe(Condition.visible).setValue(lastName);
    }

    public void enterPassword(final String password) {
        LOGGER.log(Level.INFO,"User enters password");
        createAccountPage.getPasswordField().shouldBe(Condition.visible).setValue(password);
    }

    public void enterAddress(final String address) {
        LOGGER.log(Level.INFO,"User enters address");
        createAccountPage.getAddressField().shouldBe(Condition.visible).setValue(address);
    }

    public void enterCity(final String city) {
        LOGGER.log(Level.INFO,"User enters city");
        createAccountPage.getCityField().shouldBe(Condition.visible).setValue(city);
    }

    public void chooseState(final String state) {
        LOGGER.log(Level.INFO,"User choose state from drop-down list");
        createAccountPage.getStateDropDownList().should(visible).selectOption(state);
    }

    public void enterPostcode(final String postcode) {
        LOGGER.log(Level.INFO,"User enters postcode");
        createAccountPage.getPostcodeField().shouldBe(Condition.visible).setValue(postcode);
    }

    public void chooseCountry(final String country) {
        LOGGER.log(Level.INFO,"User chooses country from drop-down list");
        createAccountPage.getCountryDropDownList().should(visible).selectOption(country);
    }

    public void enterMobilePhone(final String mobilePhone) {
        LOGGER.log(Level.INFO,"User enters mobile phone");
        createAccountPage.getMobilePhoneField().shouldBe(Condition.visible).setValue(mobilePhone);
    }

    public void enterFirstNameYourAddress(final String firstNameYourAddress) {
        LOGGER.log(Level.INFO,"User changes default first name");
        createAccountPage.getFirstNameYourAddressField().shouldBe(Condition.visible).setValue(firstNameYourAddress);
    }

    public void enterLastNameYourAddress(final String lastNameYourAddress) {
        LOGGER.log(Level.INFO,"User changes default last name");
        createAccountPage.getLastNameYourAddressField().shouldBe(Condition.visible).setValue(lastNameYourAddress);
    }

    public void enterAddressAlias(final String addressAlias) {
        LOGGER.log(Level.INFO,"User changes default address alias");
        createAccountPage.getAddressAliasField().shouldBe(Condition.visible).setValue(addressAlias);
    }

    public void submitNewAccount() {
        LOGGER.log(Level.INFO,"User submits account");
        createAccountPage.getSubmitNewAccountButton().shouldBe(Condition.enabled).click();
    }

    public void checkAccountIsCreated() {
        LOGGER.log(Level.INFO,"User checks account is created");
        myAccountPage.getMyAccountText().should(appear).shouldHave(text("MY ACCOUNT"));
    }

    public void checkFirstAndLastName(String firstName, String lastName) {
        LOGGER.log(Level.INFO,"User checks first and last name of account");
        myAccountPage.getMyFirstAndLastNameText().shouldHave(text(firstName + " " + lastName));
    }

    public void clickOnSignOut() {
        LOGGER.log(Level.INFO,"User clicks on sign out");
        if (storeMainPage.getSignOutButton().isDisplayed()){
            storeMainPage.getSignOutButton().click();
        }
    }

    public void chooseGender(String gender) {
        LOGGER.log(Level.INFO,"User chooses male of female gender");
        if (gender.equals("M")) {
            createAccountPage.getManGenderRadioButton().should(visible).shouldNotBe(selected).click();
            createAccountPage.getManGenderRadioButton().shouldBe(selected);
        } else if (gender.equals("F")) {
            createAccountPage.getWomanRadioButton().should(visible).shouldNotBe(selected).click();
            createAccountPage.getWomanRadioButton().shouldBe(selected);
        }
    }

    public void chooseDayOfBirth(final String dayOfBirth) {
        LOGGER.log(Level.INFO,"User chooses day of birth");
        createAccountPage.getDayOfBirthDropDownList().should(visible).selectOptionByValue(dayOfBirth);
    }

    public void chooseMonthOfBirth(final String monthOfBirth) {
        LOGGER.log(Level.INFO,"User chooses month of birth");
        createAccountPage.getMonthOfBirthDropDownList().should(visible).selectOptionContainingText(monthOfBirth);
    }

    public void chooseYearOfBirth(final String yearOfBirth) {
        LOGGER.log(Level.INFO,"User chooses year of birth");
        createAccountPage.getYearOfBirthDropDownList().should(visible).selectOptionByValue(yearOfBirth);
    }

    public void checkNewsletterCheckBox() {
        LOGGER.log(Level.INFO,"User checks news letter checkbox");
        createAccountPage.getNewsletterCheckBox().should(visible).shouldNotBe(checked).click();
        createAccountPage.getNewsletterCheckBox().shouldBe(checked);
    }

    public void checkOffersCheckBox() {
        LOGGER.log(Level.INFO,"User checks offers checkbox");
        createAccountPage.getOffersCheckBox().should(visible).shouldNotBe(checked).click();
        createAccountPage.getOffersCheckBox().shouldBe(checked);
    }

    public void enterCompany(final String company) {
        LOGGER.log(Level.INFO,"User enters company");
        createAccountPage.getCompanyField().shouldBe(Condition.visible).setValue(company);
    }

    public void enterAdditionalAddress(final String address) {
        LOGGER.log(Level.INFO,"User enters additional address");
        createAccountPage.getAdditionalAddressField().shouldBe(Condition.visible).setValue(address);
    }

    public void enterAddInfo(final String addInfo) {
        LOGGER.log(Level.INFO,"User enters additional information");
        createAccountPage.getAddInfoField().shouldBe(Condition.visible).setValue(addInfo);
    }

    public void enterHomePhoneField(final String homePhone) {
        LOGGER.log(Level.INFO,"User enters home phone");
        createAccountPage.getHomePhoneField().shouldBe(Condition.visible).setValue(homePhone);
    }

    public void firstRegistrationStep(final User user) {
        LOGGER.log(Level.INFO,"User enters and submit email");
        enterEmail(user.getEmail());
        submitEmail();
    }

    public void fillInRequiredFields(final User user){
        LOGGER.log(Level.INFO,"User fills in all required fields");
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

    public void fillInOptionalFields(final User user, final String gender){
        LOGGER.log(Level.INFO,"User fills in all optional fields");
        chooseGender(gender);
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

    public void checkCreatedAccount(final User user){
        LOGGER.log(Level.INFO,"User checks first and last name of the created account");
        checkAccountIsCreated();
        checkFirstAndLastName(user.getFirstName(), user.getLastName());
    }

    public void rewriteDefaultFieldsAndEnterPassword(final User user) {
        LOGGER.log(Level.INFO,"User rewrite default names and enters password");
        enterFirstNameYourAddress(user.getDefaultFirstName());
        enterLastNameYourAddress(user.getDefaultLastName());
        enterAddressAlias(user.getDefaultAddressAlias());
        enterPassword(user.getPassword());
    }

}
