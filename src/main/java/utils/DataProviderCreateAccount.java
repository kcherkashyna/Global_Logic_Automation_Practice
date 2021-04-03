package utils;

import org.testng.annotations.DataProvider;

//Data provider should not be in test package
public class DataProviderCreateAccount {

    public static final String TEST_DATA_POSITIVE_REQUIRED_FIELDS = "PositiveRequiredFields";
    public static final String TEST_DATA_POSITIVE_CHANGED_DEFAULT_FIELDS = "PositiveChangedDefaultFields";
    public static final String TEST_DATA_NEGATIVE_REQUIRED_FIELDS = "NegativeRequiredFields";
    public static final String TEST_DATA_NEGATIVE_CHANGED_DEFAULT_FIELDS = "NegativeChangedDefaultFields";

    @DataProvider(name = "PositiveRequiredFields")
    public static Object[][] setUserDataWithRequiredFields() {
        return new Object[][]{
                {"a@testemail115.com", "John", "Wick", "qawsedrftgyhu", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"000111222333452@gmail.com", "A", "B", "1234567890", "D", "E", "Wyoming", "11111", "United States", "3"},
                {"kkkkk!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com", "First-Name-AAAAAAAAAAAAAAAAAAAAA", "Last-Name-BBBBBBBBBBBBBBBBBBBBBB", "password_1234567890123456!@#$%&+", "Address#&(,./-;'\012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", "City&-0123456789012345678901234567890123456789012345678901234567", "Texas", "09876", "United States", "0123456789-0123456789-0123456789"},
        };
    }

    @DataProvider(name = "PositiveChangedDefaultFields")
    public static Object[][] setUserDataWithChangedDefaultFields() {
        return new Object[][]{
                {"a@testemail117.com", "John", "Wick", "qawsedrftgyhu", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "Jack", "Doe", "Jack's address"},
                {"000111222333454@gmail.com", "A", "B", "1234567890", "D", "E", "Wyoming", "11111", "United States", "3", "C", "D", "E"},
                {"mmmmm!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com", "First-Name-AAAAAAAAAAAAAAAAAAAAA", "Last-Name-BBBBBBBBBBBBBBBBBBBBBB", "password_1234567890123456!@#$%&+", "Address#&(,./-;'\012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", "City&-0123456789012345678901234567890123456789012345678901234567", "Texas", "09876", "United States", "0123456789-0123456789-0123456789", "First-Name-CCCCCCCCCCCCCCCCCCCCC", "Last-Name-DDDDDDDDDDDDDDDDDDDDDD", "Address_Alias_!@#$%&.,()_1234567"},
        };
    }

    @DataProvider(name = "NegativeRequiredFields")
    public static Object[][] setUserDataWithInvalidRequiredFields() {
        return new Object[][]{
                {"", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email5.com", "", "", "", "", "", "", "", "United States", ""},
                {"test@email6.com", "", "Wick", "12345", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email7.com", "John", "", "12345", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email8.com", "John", "Wick", "", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email9.com", "John", "Wick", "abcde", "", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email10.com", "John", "Wick", "abcde", "Fifth Avenue", "", "New York", "12345", "United States", "+380931234567"},
                {"test@email11.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "", "12345", "United States", "+380931234567"},
                {"test@email12.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "", "United States", "+380931234567"},
                {"test@email13.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "", "", "", "+380931234567"},
                {"test@email14.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", ""},
                {"a@testemail.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test_email16@", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"@test_email17.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test_email18@a", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email@19.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {".test@email20.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email21com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email23.com", " ", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email24.com", "John1", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email25.com", "John!", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email26.com", "First-Name-AAAAAAAAAAAAAAAAAAAAAA", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email27.com", "John", " ", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email28.com", "John", "Wick-2", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email29.com", "John", "Wick$", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email30.com", "John", "Last-Name-BBBBBBBBBBBBBBBBBBBBBBB", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email31.com", "John", "Wick", "1234", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email32.com", "John", "Wick", "password_12345678901234567!@#$%&+", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email33.com", "John", "Wick", "abcde", "Address#&(,./-;()0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901", "Manhattan", "New York", "12345", "United States", "+380931234567"},
                {"test@email34.com", "John", "Wick", "abcde", "Fifth Avenue", "City&-01234567890123456789012345678901234567890123456789012345678", "New York", "12345", "United States", "+380931234567"},
                {"test@email35.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "1234", "United States", "+380931234567"},
                {"test@email36.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "123456", "United States", "+380931234567"},
                {"test@email37.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "FGHIJ", "United States", "+380931234567"},
                {"test@email38.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "123456789"},
                {"test@email39.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "0123456789-0123456789-01234567890"}
        };
    }

    @DataProvider(name = "NegativeChangedDefaultFields")
    public static Object[][] setUserDataWithInvalidDefaultFields() {
        return new Object[][]{
                {"test@email40.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "", "John", "Wick"},
                {"test@email41.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", " ", "John", "Wick"},
                {"test@email42.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John1", "Wick", "My address"},
                {"test@email43.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John!", "Wick", "My address"},
                {"test@email44.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "First-Name-AAAAAAAAAAAAAAAAAAAAAA", "Wick", "My address"},
                {"test@email45.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "", "My address"},
                {"test@email46.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", " ", "My address"},
                {"test@email47.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Wick-2", "My address"},
                {"test@email48.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Wick$", "My address"},
                {"test@email49.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Last-Name-BBBBBBBBBBBBBBBBBBBBBBB", "My address"},
                {"test@email50.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "John", "Wick", ""},
                {"test@email51.com", "John", "Wick", "abcde", "Fifth Avenue", "Manhattan", "New York", "12345", "United States", "+380931234567", "", "", "Address_Alias_!@#$%&.,()_12345678"}
        };
    }


}
