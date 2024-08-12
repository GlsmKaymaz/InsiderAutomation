package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardPage extends BasePage{

    @FindBy(css = ".a-row.sc-cart-header.sc-compact-bottom")
    public WebElement shoppingCardTitle;
}
