package test;

import utils.Configuration;
import actions.SearchForProductAction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchForProductTest {
    private Configuration configuration;
    private SearchForProductAction searchForProductAction;

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
        searchForProductAction.searchForProductByMagnifer("t-shirt");
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
        searchForProductAction.checkErrorTextIsPresent("Please enter a search keyword");
    }

    @Test (description = "User tries to search for a product which is absent on the site")
    private void searchForAbsentProduct() {
        searchForProductAction.searchForProductByMagnifer("trousers");
        searchForProductAction.checkErrorTextIsPresent("No results were found for your search \"trousers\"");
    }

    @Test (description = "User tries to search using meaningless text")
    private void searchForMeaninglessText() {
        searchForProductAction.searchForProductByEnter("");
        searchForProductAction.checkErrorTextIsPresent("Please enter a search keyword");
    }

}
