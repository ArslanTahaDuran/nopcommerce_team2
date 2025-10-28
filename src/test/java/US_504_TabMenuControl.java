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
        computersPage=new ComputersPage(driver);
        electronicsPage=new ElectronicsPage(driver);
        apperalPage=new ApperalPage(driver);
        booksPage=new BooksPage(driver);
        digitalDownloadPage=new DigitalDownloadPage(driver);
        giftCardsPage=new GiftCardsPage(driver);
        jewelryPage=new JewelryPage(driver);
    }

    @Test (priority = 1, description = "Accessing the platform's homepage")
    public void access(){
        homePage.verifyHomePage();
        LOGGER.info("Home page opened");
    }

    @Test(priority = 2,description = "")
    public void clickMenus(){
        homePage.clickComputersButton();
        LOGGER.info("Computers button is clickable");
        computersPage.verifyComputersMenu();
        LOGGER.info("Computers menus are displayed");

        homePage.clickElectronicsButton();
        LOGGER.info("Electronics button is clickable");
        electronicsPage.verifyElectronicsMenu();
        LOGGER.info("Electronics menus are displayed");

        homePage.clickApparelButton();
        LOGGER.info("Apparel button is clickable");
        apperalPage.verifyApperalMenu();
        LOGGER.info("Apparel menus are displayed");

        homePage.clickDigitalDownloadsButton();
        LOGGER.info("Digital download button is clickable");
        digitalDownloadPage.verifyDigitalDownloadPage();
        LOGGER.info("Digital download menus are displayed");

        homePage.clickBooksButton();
        LOGGER.info("Books button is clickable");
        booksPage.verifyBooksPage();
        LOGGER.info("Books menus are displayed");

        homePage.clickJewelryButton();
        LOGGER.info("Jewelry button is clickable");
        jewelryPage.verifyJewelryPage();
        LOGGER.info("Jewelry menus are displayed");

        homePage.clickGiftCardsButton();
        LOGGER.info("Gift cards button is clickable");
        giftCardsPage.verifyGiftCards();
        LOGGER.info("Gift cards menus are displayed");

    }

    @Test(priority = 3,description = "Verifying that computers menu is clickable")
    public void clickComputersMenu(){
        homePage.clickComputersButton();
        computersPage.clickDesktopButton();
        LOGGER.info("Desktop is displayed");
        computersPage.clickNoteBooksButton();
        LOGGER.info("Notebooks is displayed");
        computersPage.clickSoftwareButton();
        LOGGER.info("Software is displayed");
        LOGGER.info("All submenus in computers menu are clickable");
    }

    @Test(priority = 4,description ="Verifying that electronics menu is clickable" )
    public void clickElectronicsMenu(){
        homePage.clickElectronicsButton();
        electronicsPage.clickCameraAndPhotoButton();
        electronicsPage.clickCellPhonesButton();
        electronicsPage.clickOthersButton();
        LOGGER.info("All submenus in electronics menu are clickable");
    }

    @Test(priority = 5,description = "Verifying that apperal menu is clickable")
    public void clickApperalMenu(){
        homePage.clickApparelButton();
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
