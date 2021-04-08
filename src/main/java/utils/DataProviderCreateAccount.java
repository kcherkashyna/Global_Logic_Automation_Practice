package utils;

import org.testng.annotations.DataProvider;

//Data provider should not be in test package
public class DataProviderCreateAccount {

    private static Helper helper = new Helper();

    public static final String TEST_DATA_POSITIVE_REQUIRED_FIELDS = "PositiveRequiredFields";
    public static final String TEST_DATA_POSITIVE_CHANGED_DEFAULT_FIELDS = "PositiveChangedDefaultFields";
    public static final String TEST_DATA_NEGATIVE_REQUIRED_FIELDS = "NegativeRequiredFields";
    public static final String TEST_DATA_NEGATIVE_CHANGED_DEFAULT_FIELDS = "NegativeChangedDefaultFields";

    @DataProvider(name = "PositiveRequiredFields")
    public static Object[][] setUserDataWithRequiredFields() {
        return new Object[][]{
                { new User ("a@testemail118.com", "John", "Wick", "qawsedrftgyhu", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User ("000111222333455@gmail.com", "A", "B", "1234567890", "D", "E", "Wyoming", "11111", "United States", "3")},
                { new User ("abcd1!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com", "First-Name-AAAAAAAAAAAAAAAAAAAAA", "Last-Name-BBBBBBBBBBBBBBBBBBBBBB", "password_1234567890123456!@#$%&+", "Address#&(,./-;'\012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", "City&-0123456789012345678901234567890123456789012345678901234567", "Texas", "09876", "United States", "0123456789-0123456789-0123456789")},
        };
    }

    @DataProvider(name = "PositiveChangedDefaultFields")
    public static Object[][] setUserDataWithChangedDefaultFields() {
        return new Object[][]{
                { new User ("a@testemail119.com", "John", "Wick", "qawsedrftgyhu", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "Jack", "Doe", "Jack's address")},
                { new User ("000111222333456@gmail.com", "A", "B", "1234567890", "D", "E", "Wyoming", "11111", "United States", "3", "C", "D", "E")},
                { new User ("abcd2!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com", "First-Name-AAAAAAAAAAAAAAAAAAAAA", "Last-Name-BBBBBBBBBBBBBBBBBBBBBB", "password_1234567890123456!@#$%&+", "Address#&(,./-;'\012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", "City&-0123456789012345678901234567890123456789012345678901234567", "Texas", "09876", "United States", "0123456789-0123456789-0123456789", "First-Name-CCCCCCCCCCCCCCCCCCCCC", "Last-Name-DDDDDDDDDDDDDDDDDDDDDD", "Address_Alias_!@#$%&.,()_1234567")},
        };
    }

    @DataProvider(name = "NegativeRequiredFields")
    public static Object[][] setUserDataWithInvalidRequiredFields() {
        return new Object[][]{
                { new User ("", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "", "", "", "", "", "", "", "United States", "")},
                { new User (helper.generateEmail(), "", "Wick", "12345", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "", "12345", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "", "", "", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "")},
                { new User ("a@testemail.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User ("test_email16@", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User ("@test_email17.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User ("test_email18@a", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User ("test@email@19.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (".test@email20.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User ("test@email21com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User ("abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), " ", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John1", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John!", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "First-Name-AAAAAAAAAAAAAAAAAAAAAA", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", " ", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick-2", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick$", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Last-Name-BBBBBBBBBBBBBBBBBBBBBBB", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "1234", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "password_12345678901234567!@#$%&+", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Address#&(,./-;()0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901", "Manhattan", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "City&-01234567890123456789012345678901234567890123456789012345678", "New York", "12345", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "1234", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "123456", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "FGHIJ", "United States", "+380931234567")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "123456789")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "0123456789-0123456789-01234567890")}
        };
    }

    @DataProvider(name = "NegativeChangedDefaultFields")
    public static Object[][] setUserDataWithInvalidDefaultFields() {
        return new Object[][]{
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "", "John", "Wick")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", " ", "John", "Wick")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John1", "Wick", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John!", "Wick", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "First-Name-AAAAAAAAAAAAAAAAAAAAAA", "Wick", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", " ", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Wick-2", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Wick$", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Last-Name-BBBBBBBBBBBBBBBBBBBBBBB", "My address")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Wick", "")},
                { new User (helper.generateEmail(), "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "", "", "Address_Alias_!@#$%&.,()_12345678")}
        };
    }


}
