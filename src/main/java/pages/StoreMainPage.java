package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StoreMainPage {
    
    //As this is initial action this should not be in page 
    // this is configuration. Think on that where you may put open site and other browser configuration actions. 


    public SelenideElement getSignInButton(){
        return $(".login");
    }

    public SelenideElement getSignOutButton(){
        return $(".logout");
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
