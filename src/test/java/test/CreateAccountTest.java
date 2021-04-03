package test;

import actions.ConfigurationAction;
import actions.CreateAccountAction;
import org.testng.annotations.*;
import utils.DataProviderCreateAccount;

import static utils.DataProviderCreateAccount.*;

public class CreateAccountTest {
    private final ConfigurationAction ca;
    private final CreateAccountAction caa;
    private final CreateAccountTest cat;

    public CreateAccountTest() {
        ca = new ConfigurationAction();
        caa = new CreateAccountAction();
        cat = new CreateAccountTest();
    }

    @Test(description = "User creates account with filling of only required fields", dataProvider = TEST_DATA_POSITIVE_REQUIRED_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithRequiredFields(final String email, final String firstName, final String lastName, final String password,
                                                 final String address, final String city, final String state,
                                                 final String postcode, final String country, final String mobilePhone) {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail(email);
        caa.submitEmail();

        caa.enterFirstName(firstName);
        caa.enterLastName(lastName);
        caa.enterAddress(address);
        caa.enterCity(city);
        caa.chooseState(state);
        caa.enterPostcode(postcode);
        caa.chooseCountry(country);
        caa.enterMobilePhone(mobilePhone);
        caa.enterPassword(password);

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName(firstName, lastName);
        caa.clickOnSignOut();
    }

    @Test(description = "User creates account with filling of all required fields and changing default fields", dataProvider = TEST_DATA_POSITIVE_CHANGED_DEFAULT_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithChangingDefaultFields(final String email, final String firstName, final String lastName, final String password,
                                                        final String address, final String city, final String state,
                                                        final String postcode, final String country, final String mobilePhone,
                                                        final String firstName2, final String lastName2, final String addressAlias) {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail(email);
        caa.submitEmail();

        caa.enterFirstName(firstName);
        caa.enterLastName(lastName);
        caa.enterAddress(address);
        caa.enterCity(city);
        caa.chooseState(state);
        caa.enterPostcode(postcode);
        caa.chooseCountry(country);
        caa.enterMobilePhone(mobilePhone);
        caa.enterFirstNameYourAddress(firstName2);
        caa.enterLastNameYourAddress(lastName2);
        caa.enterAddressAlias(addressAlias);
        caa.enterPassword(password);

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName(firstName, lastName);
        caa.clickOnSignOut();
    }

    //auxiliary method
    public void fillInRequiredFields(){
        caa.enterFirstName("Jack");
        caa.enterLastName("Doe");
        caa.enterAddress("Olvera Street");
        caa.enterCity("Los Angeles");
        caa.chooseState("California");
        caa.enterPostcode("54321");
        caa.chooseCountry("United States");
        caa.enterMobilePhone("0123456789");
        caa.enterPassword("12345");
    }

    @Test (description = "User creates account with filling of all required and optional fields")
    private void createAccountWithOptionalFieldsForMan() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail60.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseDayOfBirth("1");
        caa.chooseMonthOfBirth("January");
        caa.chooseYearOfBirth("2021");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("A");
        caa.enterAdditionalAddress("B");
        caa.enterAddInfo("C");
        caa.enterHomePhoneField("9876543210");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

    @Test (description = "User creates account with filling of all required and optional fields")
    private void createAccountWithOptionalFieldsForWoman() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail61.com");
        caa.submitEmail();

        caa.enterFirstName("Ann");
        caa.enterLastName("Taylor");
        caa.enterPassword("1qaz2wsx3edc");
        caa.enterAddress("South King Street");
        caa.enterCity("Seattle");
        caa.chooseState("Washington");
        caa.enterPostcode("77777");
        caa.chooseCountry("United States");
        caa.enterMobilePhone("012-345-6789");
        caa.chooseFemaleGender();
        caa.chooseDayOfBirth("31");
        caa.chooseMonthOfBirth("December");
        caa.chooseYearOfBirth("1900");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("Company-'@#$%&().,0123456789012345678901234567890123456789012345");
        caa.enterAdditionalAddress("Address2#&(),./-;'01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
        caa.enterAddInfo("AddInfo_!#$%&.,/('012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567801234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456780123456789012345678901234567890123456789012345678901234567890123");
        caa.enterHomePhoneField("123456789-123456789-123456789-12");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Ann", "Taylor");
    }

    @Test(description = "User tries to create account with invalid email, user tries to create account with invalid credentials", dataProvider = TEST_DATA_NEGATIVE_REQUIRED_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithInvalidDataInRequiredFields(final String email, final String firstName, final String lastName, final String password,
                                                              final String address, final String city, final String state,
                                                              final String postcode, final String country, final String mobilePhone) {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail(email);
        caa.submitEmail();

        caa.enterFirstName(firstName);
        caa.enterLastName(lastName);
        caa.enterAddress(address);
        caa.enterCity(city);
        caa.chooseState(state);
        caa.enterPostcode(postcode);
        caa.chooseCountry(country);
        caa.enterMobilePhone(mobilePhone);
        caa.enterPassword(password);

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName(firstName, lastName);
        caa.clickOnSignOut();
    }

    @Test(description = "User tries to create account with invalid credentials", dataProvider = TEST_DATA_NEGATIVE_CHANGED_DEFAULT_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithInvalidDataInDefaultFields(final String email, final String firstName, final String lastName, final String password,
                                                             final String address, final String city, final String state,
                                                             final String postcode, final String country, final String mobilePhone,
                                                             final String firstName2, final String lastName2, final String addressAlias) {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail(email);
        caa.submitEmail();

        caa.enterFirstName(firstName);
        caa.enterLastName(lastName);
        caa.enterAddress(address);
        caa.enterCity(city);
        caa.chooseState(state);
        caa.enterPostcode(postcode);
        caa.chooseCountry(country);
        caa.enterMobilePhone(mobilePhone);
        caa.enterFirstNameYourAddress(firstName2);
        caa.enterLastNameYourAddress(lastName2);
        caa.enterAddressAlias(addressAlias);
        caa.enterPassword(password);

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName(firstName, lastName);
        caa.clickOnSignOut();
    }

    @Test (description = "User tries to create account with invalid credentials")
    private void createAccountWithMissedDayOfBirth() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail62.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseMonthOfBirth("January");
        caa.chooseYearOfBirth("2021");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("A");
        caa.enterAdditionalAddress("B");
        caa.enterAddInfo("C");
        caa.enterHomePhoneField("9876543210");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

    @Test (description = "User tries to create account with invalid credentials")
    private void createAccountWithMissedMonthOfBirth() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail63.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseDayOfBirth("12");
        caa.chooseYearOfBirth("2021");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("A");
        caa.enterAdditionalAddress("B");
        caa.enterAddInfo("C");
        caa.enterHomePhoneField("9876543210");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

    @Test (description = "User tries to create account with invalid credentials")
    private void createAccountWithMissedYearOfBirth() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail64.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseDayOfBirth("22");
        caa.chooseMonthOfBirth("July");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("A");
        caa.enterAdditionalAddress("B");
        caa.enterAddInfo("C");
        caa.enterHomePhoneField("9876543210");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

    @Test (description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidCompanyName() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail65.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseDayOfBirth("22");
        caa.chooseMonthOfBirth("June");
        caa.chooseYearOfBirth("2000");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("Company-'@#$%&().,01234567890123456789012345678901234567890123456");
        caa.enterAdditionalAddress("B");
        caa.enterAddInfo("C");
        caa.enterHomePhoneField("9876543210");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

    @Test (description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidAdditionalAddress() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail66.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseDayOfBirth("28");
        caa.chooseMonthOfBirth("May");
        caa.chooseYearOfBirth("1990");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("A");
        caa.enterAdditionalAddress("Address2#&(),./-;'012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        caa.enterAddInfo("C");
        caa.enterHomePhoneField("9876543210");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

    @Test (description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidAdditionalInfo() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail67.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseDayOfBirth("19");
        caa.chooseMonthOfBirth("April");
        caa.chooseYearOfBirth("1999");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("A");
        caa.enterAdditionalAddress("B");
        caa.enterAddInfo("AddInfo_!#$%&.,/('0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567801234567890123456789012345678901234567890123456789012345678901234");
        caa.enterHomePhoneField("9876543210");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

    @Test (description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidHomePhone() {
        ca.openSite();
        caa.clickOnSignIn();
        caa.enterEmail("a@testemail68.com");
        caa.submitEmail();

        cat.fillInRequiredFields();
        caa.chooseMaleGender();
        caa.chooseDayOfBirth("10");
        caa.chooseMonthOfBirth("September");
        caa.chooseYearOfBirth("2002");
        caa.checkNewsletterCheckBox();
        caa.checkOffersCheckBox();
        caa.enterCompany("A");
        caa.enterAdditionalAddress("B");
        caa.enterAddInfo("C");
        caa.enterHomePhoneField("123456789-123456789-123456789-123");

        caa.submitNewAccount();
        caa.checkAccountIsCreated();
        caa.checkFirstAndLastName("Jack", "Doe");
    }

}


