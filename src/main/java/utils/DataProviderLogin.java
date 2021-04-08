package utils;

import org.testng.annotations.DataProvider;

//Data provider should not be in test package
public class DataProviderLogin {

    public static final String TEST_DATA_POSITIVE = "DataProviderPositive";
    public static final String TEST_DATA_NEGATIVE = "DataProviderNegative";

    @DataProvider(name = "DataProviderPositive")
    public static Object[][] setUserDataPositive() {
        return new Object[][]{
                { new User ("a@testemail.com", "qawsedrftgyhu")},
                { new User ("000111222333@gmail.com", "1234567890")},
                { new User ("abcde!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com", "password_1234567890123456!@#$%&+")}
        };
    }

    @DataProvider(name = "DataProviderNegative")
    public static Object[][] setUserDataNegative() {
        return new Object[][]{
                { new User ("", "")},
                { new User ("", "abcde")},
                { new User ("a@testemail.com", "")},
                { new User ("test@email52.com", "ebcde")},
                { new User ("test_email16@", "abcde")},
                { new User ("@test_email17.com", "abcde")},
                { new User ("test_email18@a", "abcde")},
                { new User ("test@email@19.com", "abcde")},
                { new User (".test@email20.com", "abcde")},
                { new User ("test@email21com", "abcde")},
                { new User ("abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com", "abcde")},
                { new User ("test@email31.com", "1234")},
                { new User ("test@email32.com", "password_12345678901234567!@#$%&+")}
        };
    }
}
