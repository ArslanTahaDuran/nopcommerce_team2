package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedGiftCardPage extends BasePage {

    @FindBy (xpath = "//div[@class='add-to-cart']")
    private WebElement selectedAddToCartButton;

    @FindBy(xpath = "//div[@class='giftcard']//input[@class='recipient-name']")
    private WebElement RecipientsNameInput;

    @FindBy(xpath = "//div[@class='giftcard']//input[@class='sender-name']")
    private WebElement YourNameInput;

    @FindBy(xpath = "//div[@class='bar-notification error']")
    private WebElement errorMassage;

    public SelectedGiftCardPage(WebDriver driver) {
        super(driver);
    }
    public void verifyErrorMessage(){
        verifyDisplayed(errorMassage,"Enter valid recipient name and Enter valid sender name");
        LOGGER.info("Verify valid recipient name and sender name");
    }
    public void fillGiftCardsInformations(){

    }

}
