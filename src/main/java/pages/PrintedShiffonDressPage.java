package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PrintedShiffonDressPage {

  public SelenideElement getAddToCartButton(){
    return $x("//*[text()='Add to cart']");
  }

}
