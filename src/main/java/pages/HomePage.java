package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[@href='/computers']")
    private WebElement computers;

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
}
