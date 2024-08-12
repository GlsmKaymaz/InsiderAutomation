package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this)
        ;
    }


    private HomePage homePage;
    private CardPage cardPage;
    private ProductPage productPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
    public CardPage getCardPage() {
        if (cardPage == null) {
            cardPage = new CardPage();
        }
        return cardPage;
    }

    public ProductPage getProductPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }

}
