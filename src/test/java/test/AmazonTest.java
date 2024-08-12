package test;

import com.beust.ah.A;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigReader;
import utils.Driver;
import utils.*;


public class AmazonTest extends BasePage {

    @Test()
    public void goToAmazonPageAndAddProduct() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ve daha fazlası için internet alışveriş sitesi"));
        //Assert.assertTrue(Driver.getDriver().getCurrentUrl(),true);
        Methods.wait(2);
        Methods.clickElement(getHomePage().cookiesDismiss);

        //2.Ekranin üstündeki Search alanına 'samsung' yazıp arama işlemi gerçekleştirilecek.
        getHomePage().searchBox.sendKeys("samsung" + Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("samsung"));


        //3.Gelen sayfada samsung icin sonuc bulunduğu onaylatılacak.
        Assert.assertTrue(getProductPage().samsungResult.getText().contains("samsung"));
        Methods.wait(2);


        //4.Arama sonuçlarından 2. sayfaya tıklanıp ve açılan sayfada 2. sayfanin şu an gösterimde olduğu onaylatılacak.
        Methods.scrollToWebElement(getProductPage().searchResult2Page);
        Methods.wait(3);
        Methods.clickElement(getProductPage().searchResult2Page);
        Assert.assertTrue(getProductPage().page2Validation.isDisplayed());

        //5.Üstten 5. Satır 1. Sütun içerisindeki ürüne tıklanacak. (ürün site yapısındaki anlık değişiklere göre
        // farklılık gösterebilir)
        WebElement urun= getProductPage().samsungProducts.get(28);
        Methods.scrollToWebElement(urun);
        urun.click();

        //6. Ürün sayfasında olduğumuz doğrulanacak.
        Methods.wait(2);
        Assert.assertTrue(getProductPage().addToCard.isDisplayed());
        Methods.wait(2);

        //7. Ürün sepete eklenir
        Methods.clickElement(getProductPage().addToCard);
        Methods.clickElement(getProductPage().goToCard);


        //8. Sepet sayfasında olduğumuz doğrulanır
        Methods.verifyElementDisplayed(getCardPage().shoppingCardTitle);


        //9. Logo’ya tıklanarak ana sayfaya geri dönüş sağlanır
        Methods.clickElement(getHomePage().amazonLogo);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ve daha fazlası için internet alışveriş sitesi"));

    }
}
