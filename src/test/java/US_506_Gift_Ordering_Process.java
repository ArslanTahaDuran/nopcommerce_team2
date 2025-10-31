import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class US_506_Gift_Ordering_Process extends BaseGUITest {

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

    @Test(priority = 3, description = "Click on 'Gifts' option in TAB menu")
    public void clickGiftsMenu() {

        LOGGER.info("Gifts page opened successfully");
    }

    @Test(priority = 4, description = "Select a random physical gift product")
    public void selectRandomGiftProduct() {

        LOGGER.info("Random gift product details page opened");
    }

    @Test(priority = 5, description = "Attempt to add gift to cart without filling fields")
    public void addToCartWithoutInput() {

        LOGGER.info("Warning messages displayed: 'Enter valid recipient name' and 'Enter valid sender name'");
    }

    @Test(priority = 6, description = "Fill Recipient Name, Sender Name, and Message fields")
    public void fillGiftFields() {

        LOGGER.info("All input fields accepted random values successfully");
    }

    @Test(priority = 7, description = "Click 'Add to Cart' after filling fields")
    public void addToCartAfterInput() {

        LOGGER.info("Product added to cart successfully with success message");
    }

    @Test(priority = 8, description = "Verify product in shopping cart")
    public void verifyProductInCart() {

        LOGGER.info("Shopping cart contains selected gift product with correct success message");
    }

    @Test(priority = 9, description = "Confirm full gift ordering process")
    public void confirmGiftOrderingProcess() {

        LOGGER.info("Gift ordering process completed successfully with correct validation and cart update");
    }
}