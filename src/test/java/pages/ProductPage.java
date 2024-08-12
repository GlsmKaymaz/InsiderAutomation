package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToCard;

    @FindBy(css = ".a-button-text[href='/cart?ref_=sw_gtc']")
    public WebElement goToCard;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement samsungResult;

    @FindBy(css = "a[aria-label='2 sayfasına git']")
    public WebElement searchResult2Page;

    @FindBy(css = "span[aria-label='Geçerli sayfa, sayfa 2']")
    public WebElement page2Validation;

    @FindBy(css = "(div[class='s-widget-container.s-spacing-small.s-widget-container-height-small.celwidget.slot=MAIN.template=SEARCH_RESULTS.widgetId=search-results_108'] span[class='a-size-base-plus.a-color-base.a-text-normal']")
    public WebElement samsungProduct;

    @FindBy(css= "a > .a-size-base-plus.a-color-base.a-text-normal")
    public List<WebElement> samsungProducts;

    @FindBy(css = ".a-size-large.product-title-word-break")
    public WebElement productTitle;

    @FindBy(css = "a-size-base-plus.a-color-base.sc-product-title.sc-grid-item-product-title")
    public WebElement cartTitle;







}
