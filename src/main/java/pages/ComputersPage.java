package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage{

    public ComputersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h2[@class='title']//a[@href='/desktops']")
    private WebElement desktopsButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/notebooks']")
    private WebElement notebooksButton;

    @FindBy (xpath ="//h2[@class='title']//a[@href='/software']")
    private WebElement softwareButton;

   public void verifyComputersPage(){

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
