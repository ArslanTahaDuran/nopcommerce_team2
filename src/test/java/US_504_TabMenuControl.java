import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

public class US_504_TabMenuControl extends BaseGUITest {

    private HomePage homePage;
    private ProductsPage productsPage;

    @BeforeClass
    public void pages(){
        productsPage=new ProductsPage(driver);
        homePage=new HomePage(driver);
    }

    @Test (priority = 1, description = "Accessing the platform's homepage")
    public void access(){
        homePage.verify;
    }





}
