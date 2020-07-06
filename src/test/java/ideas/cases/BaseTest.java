package ideas.cases;

import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

public abstract class BaseTest {

    private final Logger log = Logger.getLogger("");
    protected SoftAssertions softAssertions;
    protected SoftAssert softAssert;
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite(alwaysRun = true)
    protected void beforeAll() {
        System.getProperty("org.uncommons.reportng.escape-output", "false");
        RunTimeDataStorage.Sta
    }
}
