package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadPage extends BasePage {

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/digital-downloads']")
    private WebElement digitalDownloadPage;

    public DigitalDownloadPage(WebDriver driver) {
        super(driver);
    }

    public void verifyDigitalDownloadPage(){
        verifyDisplayed(digitalDownloadPage,"Digital Download");
        LOGGER.info("Digital and download page is visible");
    }

    public void clickDigitalDownloadPage(){
        clickElement(digitalDownloadPage);
        LOGGER.info("Digital and download page is opened");
    }
}
