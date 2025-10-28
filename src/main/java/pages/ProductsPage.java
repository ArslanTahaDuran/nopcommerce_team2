package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
    public void verifyAllMenu(){
        verifyDisplayed(desktopsButton, "Desktops");
        LOGGER.info("Desktops is displayed");
        verifyDisplayed(notebooksButton,"Notebooks");
        LOGGER.info("All menu is displayed");
        verifyDisplayed(softwareButton,"Software");
        LOGGER.info("Software is displayed");
        verifyDisplayed(cameraAndPhotoButton,"Camera and photo");
        LOGGER.info("Camera and photo is displayed");
        verifyDisplayed(cellPhonesButton,"Cell phones");
        LOGGER.info("Cell phones is displayed");
        verifyDisplayed(othersButton,"Others");
        LOGGER.info("Others is displayed");
        verifyDisplayed(shoesButton,"Shoes");
        LOGGER.info("Shoes is displayed");
        verifyDisplayed(clothingButton,"Clothing");
        LOGGER.info("Clothing is displayed");
        verifyDisplayed(accessoriesButton,"Accessories");
        LOGGER.info("Accessories is displayed");
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