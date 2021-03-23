package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StoreMainPage {

    public void openSite() {
        open("http://automationpractice.com/index.php");
    }

    public void clickOnSignIn() {
        $(".login").click();
    }

    public void clickOnSignOut() {
        $(".logout").click();
    }

    public void clickOnPrintedChiffonDress() {
        $(byText("Printed Chiffon Dress")).click();
    }

    public void viewMyShoppingCart() {
        $(By.xpath("//*[@title='View my shopping cart']")).click();
    }

    public void searchForBlouse() {
        $("#search_query_top").pressEnter();
    }

}
