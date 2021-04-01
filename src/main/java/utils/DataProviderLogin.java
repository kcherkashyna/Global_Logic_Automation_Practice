package utils;

import org.testng.annotations.DataProvider;

//Data provider should not be in test package
public class DataProviderLogin {

    public static final String TESTDATA1 = "DataProvider1";
    public static final String TESTDATA2 = "DataProvider2";

    @DataProvider(name = "DataProvider1")
    public static Object[][] setUserData1() {
        return new Object[][]{
                {"a@testemail.com", "qawsedrftgyhu"},
                {"000111222333@gmail.com", "1234567890"},
                {"abcde!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com", "password_1234567890123456!@#$%&+"}
        };
    }

    @DataProvider(name = "DataProvider2")
    public static Object[][] setUserData2() {
        return new Object[][]{
                {"", ""},
                {"", "abcde"},
                {"a@testemail.com", ""},
                {"test@email52.com", "ebcde"},
                {"test_email16@", "abcde"},
                {"@test_email17.com", "abcde"},
                {"test_email18@a", "abcde"},
                {"test@email@19.com", "abcde"},
                {".test@email20.com", "abcde"},
                {"test@email21com", "abcde"},
                {"abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com", "abcde"},
                {"test@email31.com", "1234"},
                {"test@email32.com", "password_12345678901234567!@#$%&+"}
        };
    }
}
