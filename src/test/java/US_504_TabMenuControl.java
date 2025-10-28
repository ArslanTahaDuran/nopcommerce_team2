import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;


public class US_504_TabMenuControl extends BaseGUITest {

    private HomePage homePage;
    private ComputersPage computersPage;
    private ElectronicsPage electronicsPage;
    private ApperalPage apperalPage;
    private BooksPage booksPage;
    private DigitalDownloadPage digitalDownloadPage;
    private GiftCardsPage giftCardsPage;
    private JewelryPage jewelryPage;


    @BeforeClass
    public void pages(){
        homePage=new HomePage(driver);
    }

    @Test (priority = 1, description = "Accessing the platform's homepage")
    public void access(){
        homePage.verifyHomePage();
        LOGGER.info("Home page opened");
    }

    @Test(priority = 2,description = "Verifying that its elements are listed.")
    public void verifyTabMenu(){

        LOGGER.info("All menu are listed.");
    }





}
