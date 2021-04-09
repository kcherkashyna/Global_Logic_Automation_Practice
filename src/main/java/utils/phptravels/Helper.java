package utils.phptravels;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static io.restassured.RestAssured.given;


public class Helper {

    private static final String BASE_URL = "https://phptravels.net";
    private static final String LOGIN = "/login";
    private static final String ACCOUNT = "/account";
    public static String cookieValue;
    private SiteResponse siteResponse = new SiteResponse();;
    private String cookieName = "ci_session";
    private String username = "abcdef@testmail.com";
    private String password = "abcdef";

    public void getCoookieValue() {
        io.restassured.response.Response response =
                given().auth().basic(username, password).
                        when().post(BASE_URL+LOGIN);
        siteResponse.responseSpec.then().statusCode(200);

        cookieValue = response.getCookie(cookieName);

        org.openqa.selenium.Cookie cookie = new org.openqa.selenium.Cookie(cookieName, cookieValue);
        Selenide.open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        Selenide.open(BASE_URL+ACCOUNT);
    }
}
