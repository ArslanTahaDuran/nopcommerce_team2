package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {super(driver);}

    @FindBy(id = "FirstName");
    private WebElement firstName;

    @FindBy (id ="LastName");
    private WebElement lastName;

    @FindBy(id ="Email");
    private WebElement email;

    @FindBy(id = "Company");
    private WebElement company;

    @FindBy(id = "Password");
    private WebElement password;

    @FindBy (id = "ConfirmPassword")
    private WebElement confirmPassword;

    @FindBy (id = "register-button")
    private WebElement registerButton;

    public void fillRegisterMask(final String email, final String password, final String confirmPassword) {
        sendKeysToElement(email, email);
        LOGGER.info("Email entered");
        sendKeysToElement(password, password);
        LOGGER.info("Password entered");
        sendKeysToElement(confirmPassword, confirmPassword);
        LOGGER.info("Confirm Password entered");

    }

    public void clickLoginBtn(){
        clickElement(registerButton);
        LOGGER.info("Register button clicked");








