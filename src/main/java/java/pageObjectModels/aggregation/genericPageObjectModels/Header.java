package java.pageObjectModels.aggregation.genericPageObjectModels;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Header {

    //****** variables ******//
    private SHAFT.GUI.WebDriver driver;

    //****** constructor ******//
    public Header(SHAFT.GUI.WebDriver driver) {
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
