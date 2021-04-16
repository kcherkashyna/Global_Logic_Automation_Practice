package test;

import actions.CreateAccountAction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Configuration;
import utils.DataProviderCreateAccount;
import utils.Helper;
import utils.User;

import static utils.DataProviderCreateAccount.*;

public class CreateAccountTest {
    private Configuration configuration;
    private CreateAccountAction createAccountAction;
    private Helper helper;
    private User userMale;
    private User userFemale;
    private User mark;
    private User james;
    private User daniel;
    private User christopher;
    private User edward;
    private User robert;
    private User harry;
    private static final String MALE = "M";

    @BeforeMethod
    private void openAuthenticationPage() {
        configuration = new Configuration();
        createAccountAction = new CreateAccountAction();
        helper = new Helper();
        configuration.openSite();
        createAccountAction.clickOnSignIn();

        userMale = new User();
        userMale.setEmail(helper.generateEmail());
        userMale.setFirstName("John");
        userMale.setLastName("Doe");
        userMale.setAddress("Olvera Street");
        userMale.setCity("Los Angeles");
        userMale.setState("California");
        userMale.setPostcode("54321");
        userMale.setCountry("United States");
        userMale.setMobilePhone("0123456789");
        userMale.setPassword("12345");
        userMale.setDayOfBirth("1");
        userMale.setMonthOfBirth("January");
        userMale.setYearOfBirth("2021");
        userMale.setCompany("A");
        userMale.setAdditionalAddress("B");
        userMale.setAdditionalInfo("C");
        userMale.setHomePhone("9876543210");

        userFemale = new User();
        userFemale.setEmail(helper.generateEmail());
        userFemale.setFirstName("Ann");
        userFemale.setLastName("Taylor");
        userFemale.setAddress("South King Street");
        userFemale.setCity("Seattle");
        userFemale.setState("Washington");
        userFemale.setPostcode("77777");
        userFemale.setCountry("United States");
        userFemale.setMobilePhone("012-345-6789");
        userFemale.setPassword("1qaz2wsx3edc");
        userFemale.setDayOfBirth("31");
        userFemale.setMonthOfBirth("December");
        userFemale.setYearOfBirth("1900");
        userFemale.setCompany("Company-'@#$%&().,0123456789012345678901234567890123456789012345");
        userFemale.setAdditionalAddress("Address2#&(),./-;'01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789");
        userFemale.setAdditionalInfo("AddInfo_!#$%&.,/('012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567801234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456780123456789012345678901234567890123456789012345678901234567890123");
        userFemale.setHomePhone("123456789-123456789-123456789-12");
    }

    @Test(description = "User creates account with filling of only required fields",
            dataProvider = TEST_DATA_POSITIVE_REQUIRED_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithRequiredFields(User user) {
        createAccountAction.firstRegistrationStep(user);
        createAccountAction.fillInRequiredFields(user);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(user);
        createAccountAction.clickOnSignOut();

    }

    @Test(description = "User creates account with filling of all required fields and changing default fields",
            dataProvider = TEST_DATA_POSITIVE_CHANGED_DEFAULT_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithChangingDefaultFields(User user) {
        createAccountAction.firstRegistrationStep(user);
        createAccountAction.fillInRequiredFields(user);
        createAccountAction.rewriteDefaultFieldsAndEnterPassword(user);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(user);
        createAccountAction.clickOnSignOut();
    }

    @Test(description = "User creates account with filling of all required and optional fields")
    private void createAccountWithOptionalFieldsForMan() {
        createAccountAction.firstRegistrationStep(userMale);
        createAccountAction.fillInRequiredFields(userMale);
        createAccountAction.fillInOptionalFields(userMale, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(userMale);
    }

    @Test(description = "User creates account with filling of all required and optional fields")
    private void createAccountWithOptionalFieldsForWoman() {
        createAccountAction.firstRegistrationStep(userFemale);
        createAccountAction.fillInRequiredFields(userFemale);
        createAccountAction.fillInOptionalFields(userFemale, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(userFemale);
    }

    @Test(description = "User tries to create account with invalid email, invalid credentials",
            dataProvider = TEST_DATA_NEGATIVE_REQUIRED_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithInvalidDataInRequiredFields(User user) {
        createAccountAction.firstRegistrationStep(user);
        createAccountAction.fillInRequiredFields(user);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(user);
        createAccountAction.clickOnSignOut();
    }

    @Test(description = "User tries to create account with invalid credentials",
            dataProvider = TEST_DATA_NEGATIVE_CHANGED_DEFAULT_FIELDS, dataProviderClass = DataProviderCreateAccount.class)
    private void createAccountWithInvalidDataInDefaultFields(User user) {
        createAccountAction.firstRegistrationStep(user);
        createAccountAction.fillInRequiredFields(user);
        createAccountAction.rewriteDefaultFieldsAndEnterPassword(user);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(user);
        createAccountAction.clickOnSignOut();
    }

    @Test(description = "User tries to create account with invalid credentials")
    private void createAccountWithMissedDayOfBirth() {
        mark = userMale;
        mark.setFirstName("Mark");
        mark.setDayOfBirth("");
        createAccountAction.firstRegistrationStep(mark);
        createAccountAction.fillInRequiredFields(mark);
        createAccountAction.fillInOptionalFields(mark, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(mark);
    }


    @Test(description = "User tries to create account with invalid credentials")
    private void createAccountWithMissedMonthOfBirth() {
        james = userMale;
        james.setFirstName("James");
        james.setMonthOfBirth("");
        createAccountAction.firstRegistrationStep(james);
        createAccountAction.fillInRequiredFields(james);
        createAccountAction.fillInOptionalFields(james, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(james);
    }

    @Test(description = "User tries to create account with invalid credentials")
    private void createAccountWithMissedYearOfBirth() {
        daniel = userMale;
        daniel.setFirstName("Daniel");
        daniel.setYearOfBirth("");
        createAccountAction.firstRegistrationStep(daniel);
        createAccountAction.fillInRequiredFields(daniel);
        createAccountAction.fillInOptionalFields(daniel, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(daniel);
    }

    @Test(description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidCompanyName() {
        christopher = userMale;
        christopher.setFirstName("Christopher");
        christopher.setCompany("Company-'@#$%&().,01234567890123456789012345678901234567890123456");
        createAccountAction.firstRegistrationStep(christopher);
        createAccountAction.fillInRequiredFields(christopher);
        createAccountAction.fillInOptionalFields(christopher, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(christopher);
    }

    @Test(description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidAdditionalAddress() {
        edward = userMale;
        edward.setFirstName("Edward");
        edward.setAdditionalAddress("Address2#&(),./-;'012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        createAccountAction.firstRegistrationStep(edward);
        createAccountAction.fillInRequiredFields(edward);
        createAccountAction.fillInOptionalFields(edward, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(edward);
    }

    @Test(description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidAdditionalInfo() {
        robert = userMale;
        robert.setFirstName("Robert");
        robert.setAdditionalInfo("AddInfo_!#$%&.,/('0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567801234567890123456789012345678901234567890123456789012345678901234");
        createAccountAction.firstRegistrationStep(robert);
        createAccountAction.fillInRequiredFields(robert);
        createAccountAction.fillInOptionalFields(robert, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(robert);
    }

    @Test(description = "User tries to create account with invalid credentials")
    private void createAccountWithInvalidHomePhone() {
        harry = userMale;
        harry.setFirstName("Harry");
        harry.setHomePhone("123456789-123456789-123456789-123");
        createAccountAction.firstRegistrationStep(harry);
        createAccountAction.fillInRequiredFields(harry);
        createAccountAction.fillInOptionalFields(harry, MALE);
        createAccountAction.submitNewAccount();
        createAccountAction.checkCreatedAccount(harry);
    }


}


