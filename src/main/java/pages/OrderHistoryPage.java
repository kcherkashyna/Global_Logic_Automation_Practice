package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class OrderHistoryPage {

  public SelenideElement getMyLastOrderLinkText(){
    return $$(".color-myaccount").first();
  }

  public SelenideElement getItemNameInOrderText(){
    return $x("//*[@class='item']//*[@class='bold']/label");
  }

  public SelenideElement getTotalOrderPriceText(){
    return $$x("//*[@class='price']/label").first();
  }

}
