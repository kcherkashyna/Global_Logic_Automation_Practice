package test;

import actions.ConfigurationAction;
import actions.SearchForProductAction;
import org.testng.annotations.Test;

public class SearchForProductTest {
    ConfigurationAction ca;
    SearchForProductAction sfpa;

    public SearchForProductTest() {
        ca = new ConfigurationAction();
        sfpa = new SearchForProductAction();
    }

    @Test (description = "User should be able to submit search request by clicking Enter")
    private void searchForProductByEnter() {
        ca.openSite();
        sfpa.searchForProductByEnter("blouse");
        sfpa.checkRightProductIsFound("Blouse");
    }

    @Test (description = "User should be able to search for a product using Magnifier button")
    private void searchForProductByMagnifier() {
        ca.openSite();
        sfpa.searchForProductByMagnifer("t-shirt");
        sfpa.checkRightProductIsFound("Faded Short Sleeve T-shirts");
    }

    @Test (description = "Registered user search for a product and should see suitable products in drop-down list")
    private void searchForProductByDropDownList() {
        ca.openSite();
        sfpa.searchForProductByDropDownList("DRESS");
        sfpa.checkRightProductIsFoundInList("Printed Summer Dress");
    }

    @Test (description = "User tries to search for a product without searchText")
    private void searchForProductWithoutSearchText() {
        ca.openSite();
        sfpa.searchForProductByEnter("");
        sfpa.checkErrorTextIsPresent("Please enter a search keyword");
    }

    @Test (description = "User tries to search for a product which is absent on the site")
    private void searchForAbsentProduct() {
        ca.openSite();
        sfpa.searchForProductByMagnifer("trousers");
        sfpa.checkErrorTextIsPresent("No results were found for your search \"trousers\"");
    }

    @Test (description = "User tries to search using meaningless text")
    private void searchForMeaninglessText() {
        ca.openSite();
        sfpa.searchForProductByEnter("");
        sfpa.checkErrorTextIsPresent("Please enter a search keyword");
    }

}
