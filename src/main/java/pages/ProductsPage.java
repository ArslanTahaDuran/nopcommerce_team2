package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.image.LookupOp;

public class ProductsPage extends BasePage {

    @FindBy (xpath = "//h2[@class='title']//a[@href='/desktops']")
    private WebElement desktopsButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/notebooks']")
    private WebElement notebooksButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/software']")
    private WebElement softwareButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/camera-photo']")
    private WebElement cameraAndPhotoButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/cell-phones']")
    private WebElement cellPhonesButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/others']")
    private WebElement othersButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/shoes']")
    private WebElement shoesButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/clothing']")
    private WebElement clothingButton;

    @FindBy (xpath = "//h2[@class='title']//a[@href='/accessories']")
    private WebElement accessoriesButton;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickDesktopsButton(){
        clickElement(desktopsButton);
        LOGGER.info("Desktops clicked");
    }
    public void clickNoteBooksButton(){
        clickElement(notebooksButton);
        LOGGER.info("Notebooks clicked");
    }
    public void clickSoftwareButton(){
        clickElement(softwareButton);
        LOGGER.info("Software clicked");
    }
    public void clickCameraAndPhotoButton(){
        clickElement(cameraAndPhotoButton);
        LOGGER.info("Camera and photo clicked");
    }
    public void clickCellPhonesButton(){
        clickElement(cellPhonesButton);
        LOGGER.info("Cell phones clicked");
    }
    public void clickOthersButton(){
        clickElement(othersButton);
        LOGGER.info("Others clicked");
    }
    public void clickShoesButton(){
        clickElement(shoesButton);
        LOGGER.info("Shoes clicked");
    }
    public void clickClothingButton(){
        clickElement(clothingButton);
        LOGGER.info("Clothing clicked");
    }
    public void clickAccessoriesButton(){
        clickElement(accessoriesButton);
        LOGGER.info("Accessories clicked");
    }
}