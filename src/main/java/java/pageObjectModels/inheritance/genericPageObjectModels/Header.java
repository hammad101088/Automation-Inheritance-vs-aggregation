package java.pageObjectModels.inheritance.genericPageObjectModels;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

/////////////////////////////////////////////////////////////////////////
////////////////////////////////// NOTE ///////////////////////////////////
//in order for Home to access Footer, we had to make Header extends Footer (cuz Home already extends Header)
//this behavior is not correct, because header IS not A footer
//////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////

public class Header extends Footer {

    //****** variables ******//
    private SHAFT.GUI.WebDriver driver;

    //****** constructor ******//
    public Header(SHAFT.GUI.WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //****** locators ******//
    private static By getSearchBar_input_locator() {
        return By.id("searchBar_input");
    }

    //****** keywords ******//
    /**
     * search and get search suggestions "stay on the same page"
     * @param search_keyword
     * @return self-reference to be used in fluent design.
     */
    public Header searchFromHeader(String search_keyword) {
        driver.element()
                .type(getSearchBar_input_locator(),search_keyword);
        return this;
    }


}
