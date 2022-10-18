package java.pageObjectModels.inheritance.listingPageObjectModels;

import com.shaft.driver.SHAFT;

import java.pageObjectModels.inheritance.genericPageObjectModels.Header;

/////////////////////////////////////////////////////////////////////////
////////////////////////////////// NOTE ///////////////////////////////////
//Home extends Header which is not correct, because Home IS not A Header
//////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////

public class Home extends Header {
    //****** variables ******//
    private SHAFT.GUI.WebDriver driver;

    private final String homePage_url = System.getProperty("base_url");

    //****** constructor ******//
    public Home(SHAFT.GUI.WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //****** locators ******//

    //****** keywords ******//
    /**
     * navigate to home page using url.
     * @return self-reference to be used in fluent design.
     */
    public Home navigateToHomePage() {
        driver.browser().navigateToURL(homePage_url);
        return this;
    }

}
