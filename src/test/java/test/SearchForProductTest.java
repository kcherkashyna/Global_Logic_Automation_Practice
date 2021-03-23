package test;

import org.testng.annotations.Test;
import pages.SearchResultPage;
import pages.StoreMainPage;

public class SearchForProductTest {

    @Test
    public void searchForProduct() {

        StoreMainPage storeMainPage = new StoreMainPage();
        SearchResultPage searchResultPage = new SearchResultPage();

        storeMainPage.openSite();
        storeMainPage.searchForBlouse();
        searchResultPage.checkRightProductIsFound();
    }
}
