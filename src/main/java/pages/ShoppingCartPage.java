package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//div[@class='product-quantity']")
    private WebElement productsQuantity;

    @FindBy(xpath = "//div[@class='terms-of-service']//input[@type='checkbox']")
    private WebElement agreeButton;

    @FindBy(xpath = "//div[@class='checkout-buttons']//button[@type='submit']")
    private WebElement submitButton;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void verifyQuantityGiftCard(){
        verifyDisplayed(productsQuantity,"1");
        LOGGER.info("A gift card added");
    }

    public void clickAgreeButton(){
        clickElement(agreeButton);
        LOGGER.info("Agree button clicked");
    }

    public void clickSubmitButton(){
        clickElement(submitButton);
        LOGGER.info("Submit button clicked");
    }

}

