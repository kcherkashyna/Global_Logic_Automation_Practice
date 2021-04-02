package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StoreMainPage {
    
    //As this is initial action this should not be in page 
    // this is configuration. Think on that where you may put open site and other browser configuration actions. 

    public SelenideElement getSignInButton(){
        return $(".login");
    }

    public SelenideElement getSignOutButton(){
        return $(".logout");
    }

    public SelenideElement getLogoPicture(){
        return $x("//*[@src='http://automationpractice.com/img/logo.jpg']");
    }

    public SelenideElement getPrintedChiffonDress() {
        return $(byText("Printed Chiffon Dress"));
    }

    public void viewMyShoppingCart() {
        $(By.xpath("//*[@title='View my shopping cart']")).click();
    }

    public void searchForBlouse() {
        $("#search_query_top").pressEnter();
    }

}
