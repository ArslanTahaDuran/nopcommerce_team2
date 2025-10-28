package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input[@class='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@class='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//div[@class='buttons']//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='buttons']//button[@type='button']")
    private WebElement registerButton;

    public void fillLoginMask(final String email, final String password) {
        sendKeysToElement(emailInput, email);
        LOGGER.info("Email entered");
        sendKeysToElement(passwordInput, password);
        LOGGER.info("Password entered");
    }

    public void clickLoginBtn(){
        clickElement(loginButton);
        LOGGER.info("Login button clicked");
    }



}
