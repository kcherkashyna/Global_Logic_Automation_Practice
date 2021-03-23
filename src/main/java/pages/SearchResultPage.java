package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    public void checkRightProductIsFound() {
        $(By.xpath("//*[@title='Blouse']")).shouldBe();
    }
}
