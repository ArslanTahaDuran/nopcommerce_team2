package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends BasePage {

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/jewelry']")
    private WebElement jewelryPage;

    public JewelryPage(WebDriver driver) {
        super(driver);
    }

    public void verifyJewelryPage(){
        verifyDisplayed(jewelryPage,"Jewelry");
        LOGGER.info("Jewelry is visible");
    }

    public void clickJewelryPage(){
        clickElement(jewelryPage);
        LOGGER.info("Jewelry is opened");
    }


}
