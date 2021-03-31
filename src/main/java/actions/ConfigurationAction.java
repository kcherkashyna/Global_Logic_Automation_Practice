package actions;

import static com.codeborne.selenide.Selenide.open;

public class ConfigurationAction {

    private final String BASEURL = "http://automationpractice.com/index.php";

    public void openSite() {
        open(BASEURL);
    }

}
