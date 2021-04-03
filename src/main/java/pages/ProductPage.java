package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProductPage {

    public SelenideElement getAddToCartButton() {
        return $x("//*[text()='Add to cart']");
    }

    public SelenideElement getProductNameText() {
        return $x("//*[@itemprop='name']");
    }

    public SelenideElement getProductModelText() {
        return $x("//*[@itemprop='sku']");
    }

    public SelenideElement getCrossButton() {
        return $(".cross");
    }

    public SelenideElement getHiddenAddProductToCartButton() {
        $x("//*[contains(@href,'id_product=3')]/img[@title='Printed Dress']").scrollTo().hover();
        return $x("//*[@data-id-product='3']/span");
    }

    public SelenideElement getProductPriceText() {
        return $("#layer_cart_product_price");
    }

    public SelenideElement getHiddenMoreButton() {
        $x("//*[contains(@href,'id_product=6')]/img[@title='Printed Summer Dress']").scrollTo().hover();
        return $x("//*[contains(@href,'id_product=6')][@title='View']/span");
    }

    public SelenideElement getColorButton() {
        $x("//*[@title='Faded Short Sleeve T-shirts']/img").scrollTo().hover();
        return $("#color_2");
    }

    public SelenideElement getBlousePicture() {
        return $(byText("Blouse"));
    }

    public SelenideElement getPlusButton() {
        return $x("//*[contains(@class, 'button-plus')]");
    }

    public SelenideElement getMinusButton() {
        return $x("//*[contains(@class, 'button-minus')]");
    }

    public SelenideElement getSizeDropDownList() {
        return $("#group_1");
    }

    public SelenideElement getWhiteColorButton() {
        return $("#color_8");
    }

    public ElementsCollection getProductNamesText() {
        return $$x("//*[@class='cart_description']//*[@class='product-name']/a");
    }

    public SelenideElement getFoundProductNameText() {
        return $x("//*[@itemprop='name']/a");
    }

}
