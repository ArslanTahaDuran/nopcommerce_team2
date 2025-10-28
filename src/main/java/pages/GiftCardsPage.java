package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;

public class GiftCardsPage extends BasePage {

    @FindBy(xpath = "//ul[@class='list']//a[@href='/gift-cards']")
    private WebElement giftCardsPage;

    public GiftCardsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyGiftCards(){
        verifyDisplayed(giftCardsPage,"Gift cards");
        LOGGER.info("Gift cards is visible");
    }

    public void clickGiftCards(){
        clickElement(giftCardsPage);
        LOGGER.info("Gift cards is opened");
    }
}
