package testAggregation;

import com.shaft.driver.SHAFT;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.pageObjectModels.aggregation.listingPageObjectModels.Home;

/**
 * dummy test class for the sake of the demo, tests don't have real data
 */
public class TestAggregation {

    SHAFT.GUI.WebDriver driver;
    Home homePage;

    @BeforeMethod
    public void beforeMethod(){
        driver = new SHAFT.GUI.WebDriver();
        homePage = new Home(driver);
    }

    @Test(description = "test header - search - using aggregations")
    @Description("""
            steps 
            - open home page
            - search on product and wait for suggestions
            """)
    @Severity(SeverityLevel.CRITICAL)

    public void testHeaderElements_search() {

        homePage
                .navigateToHomePage()
                .getHeaderActions()
                .searchFromHeader("search keyword");
    }

    @Test(description = "test footer - faq - using aggregations")
    @Description("""
            steps 
            - open home page
            - open faq page
            """)
    @Severity(SeverityLevel.CRITICAL)

    public void testFooterElements_faq() {

        homePage
                .navigateToHomePage()
                .getFooterActions()
                .openFaqPageFromFooter();
    }
}
