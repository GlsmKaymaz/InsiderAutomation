package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardPage {

    @FindBy(css = "[id=\"add-to-cart-button\"]")
    public WebElement addToCard;
}
