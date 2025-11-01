package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.image.LookupOp;

public class SelectedGiftCardPage extends BasePage {

    @FindBy (xpath = "//div[@class='add-to-cart']")
    private WebElement selectedAddToCartButton;

    @FindBy(xpath = "//div[@class='giftcard']//input[@class='recipient-name']")
    private WebElement RecipientsNameInput;

    @FindBy(xpath = "//div[@class='giftcard']//input[@class='sender-name']")
    private WebElement YourNameInput;

    @FindBy(xpath = "//div[@class='bar-notification error']")
    private WebElement errorMassage;

    @FindBy(xpath = "//div[@class='bar-notification-container']//p[@class='content']")
    private WebElement validMessage;

    @FindBy(xpath = "//div[@class='header-links']//a[@href='/cart']")
    private WebElement shoppingCart;

    public SelectedGiftCardPage(WebDriver driver) {
        super(driver);
    }
    public void verifyErrorMessage(){
        verifyDisplayed(errorMassage,"Enter valid recipient name and Enter valid sender name");
        LOGGER.info("Verify valid recipient name and sender name");
    }
    public void fillGiftCardsInformations(){
        sendKeysToElement(RecipientsNameInput,"Ali");
        sendKeysToElement(YourNameInput,"Mehmet");

    }

    public void clickSelectedGiftCardButton(){
        clickElement(selectedAddToCartButton);
        LOGGER.info("Add to cart button clicked");
    }

    public void validMessage(){
        verifyDisplayed(validMessage,"The product has been added to your shopping cart");
        LOGGER.info("Gift added successfully");
    }

    public void clickShoppingCart(){
        clickElement(shoppingCart);
        LOGGER.info("Shopping cart clicked");
    }





}
