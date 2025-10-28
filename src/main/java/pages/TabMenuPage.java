package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TabMenuPage extends BasePage{
    public TabMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    private WebElement computers;

    @FindBy(xpath = "")
    private WebElement electronicsButton;

    @FindBy(xpath = "")
    private WebElement apparelButton;

    @FindBy(xpath = "")
    private WebElement digitalDownloadsButton;

    @FindBy(xpath = "")
    private WebElement booksButton;

    @FindBy(xpath = "")
    private WebElement jewelryButton;

    @FindBy(xpath = "")
    private WebElement giftCardsButton;





}
