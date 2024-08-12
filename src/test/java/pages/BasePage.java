package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public abstract class BasePage{
//burada Page Object Model yapısı kullanılmıştır. Class abstract olarak yapılmıştır.
//encapculation--getter,setter
//diğer pageler basePage miras almıştır.
//driver da-singleton design pattern kullanilmistir.

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
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
