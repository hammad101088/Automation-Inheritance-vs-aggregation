package testInheritance;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.pageObjectModels.inheritance.listingPageObjectModels.Home;

/**
 * dummy test class for the sake of the demo, tests don't have real data
 */
public class TestInheritance {

    SHAFT.GUI.WebDriver driver;
    Home homePage;

    @BeforeMethod
    public void beforeMethod(){
        driver = new SHAFT.GUI.WebDriver();
        homePage = new Home(driver);
    }

    @Test(description = "test header - search - using inheritance")
    @Description("""
            steps 
            - open home page
            - search on product and wait for suggestions
            """)
    @Severity(SeverityLevel.CRITICAL)

    public void testHeaderElements_search() {

        homePage
                .navigateToHomePage()
                .searchFromHeader("search keyword");
    }

    @Test(description = "test footer - faq - using inheritance")
    @Description("""
            steps 
            - open home page
            - open faq page
            """)
    @Severity(SeverityLevel.CRITICAL)

    public void testFooterElements_faq() {

        homePage
                .navigateToHomePage()
                .openFaqPageFromFooter();
    }
}
