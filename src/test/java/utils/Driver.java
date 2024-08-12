package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class Driver {
        /*
       POM'de Driver icin TestBase class'ina extends etmek yerine
       Driver class'indan static method'lar kullanarak
       driver olusturup, ilgili ayarlarin yapilmasi
       ve en sonda driver'in kapatilmasi tercih edilmistir.

       POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini engellemek icin
       singleton pattern kullanimi benimsenmistir.

       Singleton Pattern: tekli kullanim, bir class'in farkli classlardan obje olusturularak
       kullanimi engellemek icin kullanilir.

       Bunu saglamak icin yapmamiz gereken sey oldukca basit obje olusturmak icin
       kullanilan constructor'i private yaptiginizda baska class'indan obje olusturulmasi
       mumkun OLAMAZ
        */

    private Driver() {

    }
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}