package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage{

    @FindBy(xpath ="//ul[@class='sublist']//a[@href='/camera-photo']")
    private WebElement cameraAndPhotoButton;

    @FindBy (xpath ="//ul[@class='sublist']//a[@href='/cell-phones']")
    private WebElement cellPhonesButton;

    @FindBy (xpath ="//ul[@class='sublist']//a[@href='/others']")
    private WebElement othersButton;

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyElectronicsMenu(){
        verifyDisplayed(cameraAndPhotoButton,"Camera and photo");
        LOGGER.info("Camera and photo is displayed");
        verifyDisplayed(cellPhonesButton,"Cell phones");
        LOGGER.info("Cell phones is displayed");
        verifyDisplayed(othersButton,"Others");
        LOGGER.info("Others is displayed");
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
}
