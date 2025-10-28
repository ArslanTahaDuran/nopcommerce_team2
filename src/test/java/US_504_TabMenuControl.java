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
        computersPage.verifyComputersMenu();
        electronicsPage.verifyElectronicsMenu();
        apperalPage.verifyApperalMenu();
        booksPage.verifyBooksPage();
        digitalDownloadPage.verifyDigitalDownloadPage();
        jewelryPage.verifyJewelryPage();
        giftCardsPage.verifyGiftCards();
        LOGGER.info("All menu are listed.");
    }

    @Test(priority = 3,description = "Verifying that computers menu is clickable")
    public void clickComputersMenu(){
        computersPage.clickDesktopButton();
        computersPage.clickNoteBooksButton();
        computersPage.clickSoftwareButton();
        LOGGER.info("All submenus in computers menu are clickable");
    }

    @Test(priority = 4,description ="Verifying that electronics menu is clickable" )
    public void clickElectronicsMenu(){
        electronicsPage.clickCameraAndPhotoButton();
        electronicsPage.clickCellPhonesButton();
        electronicsPage.clickOthersButton();
        LOGGER.info("All submenus in electronics menu are clickable");
    }

    @Test(priority = 5,description = "Verifying that apperal menu is clickable")
    public void clickApperalMenu(){
        apperalPage.clickClothingButton();
        apperalPage.clickAccessoriesButton();
        apperalPage.clickShoesButton();
        LOGGER.info("All submenus in apperal menu are clickable");
    }

    @Test(priority = 6,description = "Verifying that digital downloads menu is clickable")
    private void clickDigitalDownloadsMenu(){
        digitalDownloadPage.clickDigitalDownloadPage();
        LOGGER.info("Digital downloads menu is clickable");
    }

    @Test(priority = 7,description = "Verifying that books menu is clickable")
    private void clickBooksMenu(){
        booksPage.clickBooksPage();
        LOGGER.info("Books menu is clickable");
    }

    @Test(priority = 8,description = "Verifying that gift cards menu is clickable")
    private void clickGiftCardsMenu(){
        giftCardsPage.clickGiftCards();
        LOGGER.info("Gift cards menu is clickable");
    }

    @Test(priority = 9,description = "Verifying that jewelry menu is clickable")
    private void clickJewelryMenu(){
        jewelryPage.clickJewelryPage();
        LOGGER.info("Jewelry menu is clickable");
    }

}
