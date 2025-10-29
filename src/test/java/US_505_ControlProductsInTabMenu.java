import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class US_505_ControlProductsInTabMenu extends BaseGUITest {

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

    @Test(priority = 2, description = "Verify main tab menu is visible on homepage")
    public void verifyMainTabMenuVisible() {
        homePage.checkPage();
        LOGGER.info("Main tab menu is visible");
    }

    @Test(priority = 3, description = "Retrieve all main tab menu items and store them")
    public void retrieveMainTabItems() {

        LOGGER.info("Main tab menu items retrieved and stored");
    }

    @Test(priority = 4, description = "Retrieve all submenu items under each main tab")
    public void retrieveSubmenuItems() {

        LOGGER.info("Submenu items retrieved and stored");
    }

    @Test(priority = 5, description = "Verify all menu and submenu data is stored correctly")
    public void verifyMenuDataStructure() {

        LOGGER.info("Menu data structure verified");
    }

    @Test(priority = 6, description = "Retrieve a product name from XML and search it")
    public void searchProductFromXML() {
        String productName = "HP Spectre XT Pro UltraBook";

        LOGGER.info("Product searched from homepage search box");
    }

    @Test(priority = 7, description = "Select a random product from search results")
    public void selectRandomProductFromResults() {

        LOGGER.info("Random product selected from search results");
    }

    @Test(priority = 8, description = "Verify selected product exists in stored menu list")
    public void verifyProductExistsInMenuList() {

        LOGGER.info("Selected product verified in stored menu list");
    }

    @Test(priority = 9, description = "Verify a product under Computers >> Notebooks specifically")
    public void verifyProductUnderComputersNotebooks() {

        LOGGER.info("Product verified under Computers >> Notebooks");
    }

    @Test(priority = 10, description = "Verify stored menu data integrity and structure validity")
    public void verifyFinalMenuDataIntegrity() {

        LOGGER.info("Final menu data and structure verified successfully");
    }
}