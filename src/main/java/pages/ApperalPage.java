package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApperalPage extends BasePage{

    @FindBy(xpath ="//ul[@class='sublist']//a[@href='/shoes']")
    private WebElement shoesButton;

    @FindBy (xpath ="//ul[@class='sublist']//a[@href='/clothing']")
    private WebElement clothingButton;

    @FindBy (xpath = "//ul[@class='sublist']//a[@href='/accessories']")
    private WebElement accessoriesButton;

    public ApperalPage(WebDriver driver) {
        super(driver);
    }

    public void verifyApperalMenu(){
        verifyDisplayed(shoesButton,"Shoes");
        LOGGER.info("Shoes is displayed");
        verifyDisplayed(clothingButton,"Clothing");
        LOGGER.info("Clothing is displayed");
        verifyDisplayed(accessoriesButton,"Accessories");
        LOGGER.info("Accessories is displayed");
    }

    public void clickShoesButton(){
        clickElement(shoesButton);
        LOGGER.info("Shoes clicked");
    }
    public void clickClothingButton(){
        clickElement(clothingButton);
        LOGGER.info("Clothing clicked");
    }
    public void clickAccessoriesButton(){
        clickElement(accessoriesButton);
        LOGGER.info("Accessories clicked");
    }
}
