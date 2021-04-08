package utils;

import static com.codeborne.selenide.Selenide.open;

public class Configuration {

    private final String BASEURL = "http://automationpractice.com/index.php";

    public void openSite() {
        open(BASEURL);
    }

}
