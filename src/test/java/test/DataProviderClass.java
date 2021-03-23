package test;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    public static final String TESTDATA = "DataProvider";

    @DataProvider(name = "DataProvider")
    public static Object[][] getUserData() {
        return new Object[][]{

                {"emailcontainsonlyletters@gmail.com", "passwordwithonlyletters"},
                {"000777333111222777333@gmail.com", "1234567890"},
                {"user_&#!777@gmail.com", "1_&#!67890"},
                {"EMAILCONTAINSCAPITALLETTERS@gmail.com", "ABCDE"},
                {"long_email_123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890124@gmail.com",
                        "12345678901234567890123456789012"},

                {"", ""},
                {"", "12345"},
                {"email1___1@gmail.com", ""},
                {"@gmail.com", "12345"},
                {"email2___2@gmail.com", "1234"},

        };
    }
}
