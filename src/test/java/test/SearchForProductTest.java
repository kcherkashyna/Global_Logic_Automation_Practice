package test;

import utils.Configuration;
import actions.SearchForProductAction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchForProductTest {
    private Configuration configuration;
    private SearchForProductAction searchForProductAction;
    private static final String MISSED_KEYWORD = "Please enter a search keyword";
    private static final String ABSENT_PRODUCT_NAME = "trousers";

    @BeforeTest
    public void openSite() {
        configuration = new Configuration();
        searchForProductAction = new SearchForProductAction();
        configuration.openSite();
    }

    @Test (description = "User should be able to submit search request by clicking Enter")
    private void searchForProductByEnter() {
        searchForProductAction.searchForProductByEnter("blouse");
        searchForProductAction.checkRightProductIsFound("Blouse");
    }

    @Test (description = "User should be able to search for a product using Magnifier button")
    private void searchForProductByMagnifier() {
        searchForProductAction.searchForProductByMagnifier("t-shirt");
        searchForProductAction.checkRightProductIsFound("Faded Short Sleeve T-shirts");
    }

    @Test (description = "Registered user search for a product and should see suitable products in drop-down list")
    private void searchForProductByDropDownList() {
        searchForProductAction.searchForProductByDropDownList("DRESS");
        searchForProductAction.checkRightProductIsFoundInList("Printed Summer Dress");
    }

    @Test (description = "User tries to search for a product without searchText")
    private void searchForProductWithoutSearchText() {
        searchForProductAction.searchForProductByEnter("");
        searchForProductAction.checkErrorTextIsPresent(MISSED_KEYWORD);
    }

    @Test (description = "User tries to search for a product which is absent on the site")
    private void searchForAbsentProduct() {
        searchForProductAction.searchForProductByMagnifier(ABSENT_PRODUCT_NAME);
        searchForProductAction.checkNotFoundErrorTextIsPresent("No results were found for your search ", ABSENT_PRODUCT_NAME);
    }

    @Test (description = "User tries to search using meaningless text")
    private void searchForMeaninglessText() {
        searchForProductAction.searchForProductByEnter("");
        searchForProductAction.checkErrorTextIsPresent(MISSED_KEYWORD);
    }

}
