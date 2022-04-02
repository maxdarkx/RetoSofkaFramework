package co.com.juanmaya.sofka.frameworkreto.page.addtocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    @CacheLookup
    @FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[1]/a")
    WebElement womenCategory;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[3]/a")
    WebElement tshirtCategory;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/span/span/i")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span/i")
    WebElement proceedToCheckout;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/ul/li[3]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCartWomenCategoryItem3;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/ul/li[3]/div/div[1]/div/a[1]/img")
    WebElement pictureWomenCategoryItem3;

    @CacheLookup
    @FindBy(xpath = "//*[@id='center_column']/ul/li[6]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCartWomenCategoryItem6;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/ul/li[6]/div/div[1]/div/a[1]/img")
    WebElement pictureWomenCategoryItem6;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/ul/li/div/div[2]/div[2]/a[1]/span")
    WebElement addToCartTshirtCategoryItem1;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/ul/li/div/div[1]/div/a[1]/img")
    WebElement pictureTshirtCategoryItem1;

    public WebElement getWomenCategory() {
        return womenCategory;
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

    public WebElement getAddToCartWomenCategoryItem3() {
        return addToCartWomenCategoryItem3;
    }

    public WebElement getAddToCartWomenCategoryItem6() {
        return addToCartWomenCategoryItem6;
    }

    public WebElement getAddToCartTshirtCategoryItem1() {
        return addToCartTshirtCategoryItem1;
    }

    public WebElement getPictureWomenCategoryItem3() {
        return pictureWomenCategoryItem3;
    }

    public WebElement getPictureWomenCategoryItem6() {
        return pictureWomenCategoryItem6;
    }

    public WebElement getPictureTshirtCategoryItem1() {
        return pictureTshirtCategoryItem1;
    }

    public AddToCartPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
