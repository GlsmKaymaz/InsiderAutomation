package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(css = "#sp-cc-rejectall-link")
    public WebElement cookiesDismiss;

    @FindBy(css = "#nav-logo-sprites")
    public WebElement amazonLogo;





}
