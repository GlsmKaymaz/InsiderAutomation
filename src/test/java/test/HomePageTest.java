package test;

import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;


public class HomePageTest {

    // 1. http://www.amazon.com.tr sitesine gidilecek ve
    // anasayfanın açıldığı assertion ile onaylatılacak.
    @Test
    public void goToAmazonPage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }


    // 2.Ekranin üstündeki Search alanına 'samsung' yazıp arama işlemi gerçekleştirilecek.
}
