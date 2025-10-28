package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.image.LookupOp;

public class ComputersPage extends BasePage{


    @FindBy(xpath = "//ul[@class='sublist']//a[@href='/desktops']")
    private WebElement desktopsButton;

    @FindBy (xpath ="//ul[@class='sublist']//a[@href='/notebooks']")
    private WebElement notebooksButton;

    @FindBy (xpath ="//ul[@class='sublist']//a[@href='/software']")
    private WebElement softwareButton;

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    public void verifyComputersMenu(){
        verifyDisplayed(desktopsButton, "Desktops");
        LOGGER.info("Desktops is displayed");
        verifyDisplayed(notebooksButton,"Notebooks");
        LOGGER.info("All menu is displayed");
        verifyDisplayed(softwareButton,"Software");
        LOGGER.info("Software is displayed");
    }


    public void clickDesktopButton(){
        clickElement(desktopsButton);
        LOGGER.info("Desktop clicked");
    }

    public void clickNoteBooksButton(){
        clickElement(notebooksButton);
        LOGGER.info("Notebooks clicked");
    }
    public void clickSoftwareButton(){
        clickElement(softwareButton);
        LOGGER.info("Software clicked");
    }

}
