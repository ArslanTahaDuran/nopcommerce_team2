package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage {

@FindBy (xpath = "//ul[@class='list']//a[@href='/books']")
    private WebElement booksPage;

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    public void verifyBooksPage(){
        verifyDisplayed(booksPage,"Books");
        LOGGER.info("Books page is visible");
    }

    public void clickBooksPage(){
        clickElement(booksPage);
        LOGGER.info("Books page is opened");
    }

}
