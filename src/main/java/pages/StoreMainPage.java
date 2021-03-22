package pages;

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

}
