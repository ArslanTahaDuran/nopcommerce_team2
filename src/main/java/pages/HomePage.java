package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='menu-toggle']")
    private WebElement allMenu;

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/computers']")
    private WebElement computersButton;

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/electronics']")
    private WebElement electronicsButton;

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/apparel']")
    private WebElement apparelButton;

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/digital-downloads']")
    private WebElement digitalDownloadsButton;

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/books']")
    private WebElement booksButton;

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/jewelry']")
    private WebElement jewelryButton;

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/gift-cards']")
    private WebElement giftCardsButton;

    @FindBy(xpath = "//a[@class='ico-login']")
    private WebElement loginButton;

    @FindBy (xpath = "//a[@class='ico-register']")
    private WebElement registerButton;

    @FindBy (xpath = "//a[@class='ico-cart']")
    private WebElement shoppingCartButton;

    @FindBy (xpath = "//input[@type='text']")
    private WebElement searchText;

    @FindBy (xpath = "//button[@type='submit']")
    private WebElement searchButton;

    public void checkPage() {
        verifyDisplayed(allMenu, "Products page acilmadi");

    }
    public void clickComputersButton(){
        clickElement(computersButton);
        LOGGER.info("Computers button clicked");
    }
    public void clickElectronicsButton(){
        clickElement(electronicsButton);
        LOGGER.info("Electronics button clicked");
    }
    public void clickApparelButton(){
        clickElement(apparelButton);
        LOGGER.info("Apparel button clicked");
    }
    public void clickDigitalDownloadsButton(){
        clickElement(digitalDownloadsButton);
        LOGGER.info("Digital downloads button clicked");
    }
    public void clickBooksButton(){
        clickElement(booksButton);
        LOGGER.info("Books button clicked");
    }
    public void clickJewelryButton(){
        clickElement(jewelryButton);
        LOGGER.info("Jewelry button clicked");
    }
    public void clickGiftCardsButton(){
        clickElement(giftCardsButton);
        LOGGER.info("Gift cards button clicked");
    }
    public void clickLoginButton(){
        clickElement(loginButton);
        LOGGER.info("Login button clicked");
    }
    public void clickRegisterButton(){
        clickElement(registerButton);
        LOGGER.info("Register button clicked");
    }
    public void clickShoppingCartButton(){
        clickElement(shoppingCartButton);
        LOGGER.info("Shopping cart clicked");
    }
    public void clickSearchText(){
        clickElement(searchText);
        LOGGER.info("Search text clicked");
    }
    public void clickSearchButton(){
        clickElement(searchButton);
        LOGGER.info("Search button clicked");
    }



}
