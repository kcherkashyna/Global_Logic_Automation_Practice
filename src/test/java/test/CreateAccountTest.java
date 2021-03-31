package test;

import actions.ConfigurationAction;
import actions.CreateAccountAction;
import org.testng.annotations.*;
import utils.DataProviderCreateAccount;

import static utils.DataProviderCreateAccount.*;

public class CreateAccountTest {

    ConfigurationAction configurationAction = new ConfigurationAction();
    CreateAccountAction createAccountAction = new CreateAccountAction();

    @Test(dataProvider = TESTDATA1, dataProviderClass = DataProviderCreateAccount.class)
    public void createAccount1(String email, String firstName, String lastName, String password,
                               String address, String city, String state,
                               String postcode, String country, String mobilePhone) {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail(email);
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName(firstName);
        createAccountAction.enterLastName(lastName);
        createAccountAction.enterAddress(address);
        createAccountAction.enterCity(city);
        createAccountAction.chooseState(state);
        createAccountAction.enterPostcode(postcode);
        createAccountAction.chooseCountry(country);
        createAccountAction.enterMobilePhone(mobilePhone);
        createAccountAction.enterPassword(password);

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName(firstName, lastName);
        createAccountAction.clickOnSignOut();
    }

    @Test(dataProvider = TESTDATA2, dataProviderClass = DataProviderCreateAccount.class)
    public void createAccount2(String email, String firstName, String lastName, String password,
                               String address, String city, String state,
                               String postcode, String country, String mobilePhone,
                               String firstName2, String lastName2, String addressAlias) {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail(email);
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName(firstName);
        createAccountAction.enterLastName(lastName);

        createAccountAction.enterAddress(address);
        createAccountAction.enterCity(city);
        createAccountAction.chooseState(state);
        createAccountAction.enterPostcode(postcode);
        createAccountAction.chooseCountry(country);
        createAccountAction.enterMobilePhone(mobilePhone);
        createAccountAction.enterFirstName2(firstName2);
        createAccountAction.enterLastName2(lastName2);
        createAccountAction.enterAddressAlias(addressAlias);
        createAccountAction.enterPassword(password);

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName(firstName, lastName);
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount3() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail79.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");
        createAccountAction.chooseMaleGender();
        createAccountAction.chooseDayOfBirth("1");
        createAccountAction.chooseMonthOfBirth("January");
        createAccountAction.chooseYearOfBirth("2021");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("A");
        createAccountAction.enterAddress2("B");
        createAccountAction.enterAddInfo("C");
        createAccountAction.enterHomePhoneField("9876543210");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount4() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail80.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Ann");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");
        createAccountAction.chooseFemaleGender();
        createAccountAction.chooseDayOfBirth("31");
        createAccountAction.chooseMonthOfBirth("December");
        createAccountAction.chooseYearOfBirth("1900");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("Company-'@#$%&().,0123456789012345678901234567890123456789012345");
        createAccountAction.enterAddress2("Address2#&(),./-;'01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
        createAccountAction.enterAddInfo("AddInfo_!#$%&.,/('012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567801234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456780123456789012345678901234567890123456789012345678901234567890123");
        createAccountAction.enterHomePhoneField("123456789-123456789-123456789-12");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Ann", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test(dataProvider = TESTDATA3, dataProviderClass = DataProviderCreateAccount.class)
    public void createAccount5(String email, String firstName, String lastName, String password,
                               String address, String city, String state,
                               String postcode, String country, String mobilePhone) {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail(email);
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName(firstName);
        createAccountAction.enterLastName(lastName);
        createAccountAction.enterAddress(address);
        createAccountAction.enterCity(city);
        createAccountAction.chooseState(state);
        createAccountAction.enterPostcode(postcode);
        createAccountAction.chooseCountry(country);
        createAccountAction.enterMobilePhone(mobilePhone);
        createAccountAction.enterPassword(password);

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName(firstName, lastName);
        createAccountAction.clickOnSignOut();
    }

    @Test(dataProvider = TESTDATA4, dataProviderClass = DataProviderCreateAccount.class)
    public void createAccount6(String email, String firstName, String lastName, String password,
                               String address, String city, String state,
                               String postcode, String country, String mobilePhone,
                               String firstName2, String lastName2, String addressAlias) {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail(email);
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName(firstName);
        createAccountAction.enterLastName(lastName);

        createAccountAction.enterAddress(address);
        createAccountAction.enterCity(city);
        createAccountAction.chooseState(state);
        createAccountAction.enterPostcode(postcode);
        createAccountAction.chooseCountry(country);
        createAccountAction.enterMobilePhone(mobilePhone);
        createAccountAction.enterFirstName2(firstName2);
        createAccountAction.enterLastName2(lastName2);
        createAccountAction.enterAddressAlias(addressAlias);
        createAccountAction.enterPassword(password);

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName(firstName, lastName);
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount7() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail81.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");

        createAccountAction.chooseMaleGender();
        createAccountAction.chooseMonthOfBirth("January");
        createAccountAction.chooseYearOfBirth("2021");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("A");
        createAccountAction.enterAddress2("B");
        createAccountAction.enterAddInfo("C");
        createAccountAction.enterHomePhoneField("9876543210");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount8() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail81.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");

        createAccountAction.chooseMaleGender();
        createAccountAction.chooseDayOfBirth("12");
        createAccountAction.chooseYearOfBirth("2021");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("A");
        createAccountAction.enterAddress2("B");
        createAccountAction.enterAddInfo("C");
        createAccountAction.enterHomePhoneField("9876543210");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount9() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail81.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");

        createAccountAction.chooseMaleGender();
        createAccountAction.chooseDayOfBirth("22");
        createAccountAction.chooseMonthOfBirth("July");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("A");
        createAccountAction.enterAddress2("B");
        createAccountAction.enterAddInfo("C");
        createAccountAction.enterHomePhoneField("9876543210");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount10() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail81.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");

        createAccountAction.chooseMaleGender();
        createAccountAction.chooseDayOfBirth("22");
        createAccountAction.chooseMonthOfBirth("June");
        createAccountAction.chooseYearOfBirth("2000");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("Company-'@#$%&().,01234567890123456789012345678901234567890123456");
        createAccountAction.enterAddress2("B");
        createAccountAction.enterAddInfo("C");
        createAccountAction.enterHomePhoneField("9876543210");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount11() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail81.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");

        createAccountAction.chooseMaleGender();
        createAccountAction.chooseDayOfBirth("28");
        createAccountAction.chooseMonthOfBirth("May");
        createAccountAction.chooseYearOfBirth("1990");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("A");
        createAccountAction.enterAddress2("Address2#&(),./-;'012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        createAccountAction.enterAddInfo("C");
        createAccountAction.enterHomePhoneField("9876543210");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount12() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail81.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");

        createAccountAction.chooseMaleGender();
        createAccountAction.chooseDayOfBirth("19");
        createAccountAction.chooseMonthOfBirth("April");
        createAccountAction.chooseYearOfBirth("1999");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("A");
        createAccountAction.enterAddress2("B");
        createAccountAction.enterAddInfo("AddInfo_!#$%&.,/('0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567801234567890123456789012345678901234567890123456789012345678901234");
        createAccountAction.enterHomePhoneField("9876543210");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }

    @Test
    public void createAccount13() {

        configurationAction.openSite();

        createAccountAction.clickOnSignIn();
        createAccountAction.enterEmail("a@testemail81.com");
        createAccountAction.submitEmail();

        createAccountAction.enterFirstName("Jack");
        createAccountAction.enterLastName("Doe");
        createAccountAction.enterPassword("12345");
        createAccountAction.enterAddress("Olvera Street");
        createAccountAction.enterCity("Los Angeles");
        createAccountAction.chooseState("California");
        createAccountAction.enterPostcode("54321");
        createAccountAction.chooseCountry("United States");
        createAccountAction.enterMobilePhone("0123456789");

        createAccountAction.chooseMaleGender();
        createAccountAction.chooseDayOfBirth("10");
        createAccountAction.chooseMonthOfBirth("September");
        createAccountAction.chooseYearOfBirth("2002");
        createAccountAction.checkNewsletterCheckBox();
        createAccountAction.checkOffersCheckBox();
        createAccountAction.enterCompany("A");
        createAccountAction.enterAddress2("B");
        createAccountAction.enterAddInfo("C");
        createAccountAction.enterHomePhoneField("123456789-123456789-123456789-123");

        createAccountAction.submitNewAccount();
        createAccountAction.checkAccountIsCreated();
        createAccountAction.checkFirstAndLastName("Jack", "Doe");
        createAccountAction.clickOnSignOut();
    }


}


