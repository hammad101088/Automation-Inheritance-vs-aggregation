package java.pageObjectModels.aggregation.listingPageObjectModels;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

import java.pageObjectModels.aggregation.genericPageObjectModels.Footer;
import java.pageObjectModels.aggregation.genericPageObjectModels.Header;


public class Home {
    //****** variables ******//
    private SHAFT.GUI.WebDriver driver;

    private final String homePage_url = System.getProperty("base_url");

    //****** constructor ******//
    public Home(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //****** locators ******//

    //****** keywords ******//

    /////////////////////////////////////////////////////////////////////////
    //////////////////////////////// Aggregation class ///////////////////////////////////
    //Home use aggregation to make relation with Header and Footer which is acceptable, because HOme HAS A Header and Footer
    //////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////

    /**
     * navigate to home page using url.
     * @return self-reference to be used in fluent design.
     */
    public Home navigateToHomePage() {
        driver.browser().navigateToURL(homePage_url);
        return this;
    }

    /**
     * use Header elements using aggregation instead of inheritance
     * @return Header object to be used in fluent design
     */
    public Header getHeaderActions() {
        return (new Header(driver));
    }

    /**
     * use Footer elements using aggregation instead of inheritance
     * @return Footer object to be used in fluent design
     */
    public Footer getFooterActions() {
        return (new Footer(driver));
    }

}
