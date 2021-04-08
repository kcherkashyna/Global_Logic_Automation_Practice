package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Helper {

    public String generateEmail() {
        String emailName = RandomStringUtils.randomAlphanumeric(10);
        return emailName + "@gmail.com";
    }

}
