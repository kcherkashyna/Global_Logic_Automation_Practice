package test.phptravels;

import actions.phptravels.Authorization;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.restassured.response.Response;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class AuthenticationTest {

    public static final String BASE_URL = "https://phptravels.net/login";
    public static String cookieValue;

    public final Authorization a;

    public AuthenticationTest() {
        a = new Authorization();
    }

    @BeforeTest
    public void getCoookieValue() {
        Response response =
                given().queryParam("username", "abcdef@testmail.com").
                    queryParam("password", "abcdef").
                when().post(BASE_URL);
                a.responseSpec.then().cookie("ci_session", hasValue("111f3c89275bac5ba70c1525f5691dbe7c81e8d1"));

        cookieValue = response.getCookie("ci_session");
    }

    @BeforeMethod
    public void addCoookieValue() {
        Cookie cookie = new Cookie("ci_session", cookieValue);
        Selenide.open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
    }

    @Test
    public void checkUserName() {
        given().when().then().body(hasXPath("//*[contains(@class, 'dropdown-login')]//*[@id='dropdownCurrency']", containsString("John")));
    }

}