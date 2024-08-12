package utils;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static hooks.Hooks.driver;

public class Methods {

    public static void clickElement(WebElement element) {
        element.click();
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    public static void goToUrl(String url) {
        driver.get(url);
    }


    public static void scrollToWebElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void hover(WebElement element){
        new Actions(driver).moveToElement(element).build().perform();
    }


}
