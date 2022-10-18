package java.pageObjectModels.aggregation.genericPageObjectModels;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Footer {

    //****** variables ******//
    private SHAFT.GUI.WebDriver driver;

    //****** constructor ******//
    public Footer(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //****** locators ******//
    private static By getFaq_button() {
        return By.id("faq_btn");
    }

    //****** keywords ******//
    /**
     * open faq page
     * @return self-reference to be used in fluent design.
     */
    public Footer openFaqPageFromFooter() {
        driver.element()
                .click(getFaq_button());
        return this;
    }


}
