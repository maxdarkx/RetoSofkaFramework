package co.com.juanmaya.sofka.frameworkreto.page.addtocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class AddToCartFromAuxiliaryViewPage {

    private WebDriver driver;
    //categorias
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement womenCategory;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dressesCategory;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tshirtCategory;

    //categorias desde venta
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement homeFromeSale;

    /*@CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement dressesCategoryFromSale;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement tshirtCategoryFromSale;
*/



    //botones del carrito
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i")
    WebElement proceedToCheckout;


    //Botones de las imagenes de los productos

    //WomenCategory
        @CacheLookup
        @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
        WebElement womenCategoryPictureItem1;

        @CacheLookup
        @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
        WebElement womenCategoryPictureItem2;

        @CacheLookup
        @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img")
        WebElement womenCategoryPictureItem4;

    //DressCategory
        @CacheLookup
        @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img")
        WebElement dressesCategoryPictureItem4;

        @CacheLookup
        @FindBy(xpath = "//*[@id=\'center_column\']/ul/li[5]/div/div[1]/div/a[1]/img")
        WebElement dressesCategoryPictureItem5;


    //botones para mostrar las vistas auxiliares (detalles) de los productos
    //WomenCategory
        @CacheLookup
        @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]/span")
        WebElement womenCategoryExpandedViewItem1;

        @CacheLookup
        @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]/span")
        WebElement womenCategoryExpandedViewItem2;

    //DressesCategory

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[2]/span")
    WebElement dressesCategoryExpandedViewItem4;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[2]/span")
    WebElement dressesCategoryExpandedViewItem5;



    //botones para anadir al carrito en las vistas auxiliares de los productos
    //WomenCategory
        @CacheLookup
        @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
        WebElement womenCategoryAddToCartItem1;

        @CacheLookup
        @FindBy(xpath = "//*[@id=\'add_to_cart\']/button")
        WebElement womenCategoryAddToCartItem2;

    //DressesCategory
        @CacheLookup
        @FindBy(xpath = "//*[@id=\'add_to_cart\']/button")
        WebElement dressesCategoryAddToCartItem4;

        @CacheLookup
        @FindBy(xpath = "//*[@id=\'add_to_cart\']/button")
        WebElement dressesCategoryAddToCartItem5;


    public WebElement getWomenCategory() {
        return womenCategory;
    }

    public WebElement getDressesCategory() {
        return dressesCategory;
    }

    public WebElement getTshirtCategory() {
        return tshirtCategory;
    }

    public WebElement getContinueShopping() {
        return continueShopping;
    }

    public WebElement getProceedToCheckout() {
        return proceedToCheckout;
    }

    public WebElement getWomenCategoryPictureItem1() {
        return womenCategoryPictureItem1;
    }

    public WebElement getWomenCategoryPictureItem2() {
        return womenCategoryPictureItem2;
    }

    public WebElement getWomenCategoryPictureItem4() {
        return womenCategoryPictureItem4;
    }

    public WebElement getDressesCategoryPictureItem4() {
        return dressesCategoryPictureItem4;
    }

    public WebElement getDressesCategoryPictureItem5() {
        return dressesCategoryPictureItem5;
    }

    public WebElement getWomenCategoryExpandedViewItem1() {
        return womenCategoryExpandedViewItem1;
    }

    public WebElement getWomenCategoryExpandedViewItem2() {
        return womenCategoryExpandedViewItem2;
    }

    public WebElement getDressesCategoryExpandedViewItem4() {
        return dressesCategoryExpandedViewItem4;
    }

    public WebElement getDressesCategoryExpandedViewItem5() {
        return dressesCategoryExpandedViewItem5;
    }

    public WebElement getWomenCategoryAddToCartItem1() {
        return womenCategoryAddToCartItem1;
    }

    public WebElement getWomenCategoryAddToCartItem2() {
        return womenCategoryAddToCartItem2;
    }

    public WebElement getDressesCategoryAddToCartItem4() {
        return dressesCategoryAddToCartItem4;
    }

    public WebElement getDressesCategoryAddToCartItem5() {
        return dressesCategoryAddToCartItem5;
    }

    public WebElement getHomeFromeSale() {
        return homeFromeSale;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public AddToCartFromAuxiliaryViewPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
