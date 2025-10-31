import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
public class US_507_Computer_Order_Process extends BaseGUITest {

    private HomePage homePage;

    @BeforeClass
    public void pages() {
        homePage = new HomePage(driver);
    }

    @Test(priority = 1, description = "Verify user can open the homepage successfully")
    public void openHomePage() {
        homePage.verifyHomePage();
        LOGGER.info("Homepage opened successfully");
    }

    @Test(priority = 2, description = "Verify presence of TAB menu on homepage")
    public void verifyTabMenuVisible() {
        homePage.checkPage();
        LOGGER.info("TAB menu is visible and accessible");
    }
}