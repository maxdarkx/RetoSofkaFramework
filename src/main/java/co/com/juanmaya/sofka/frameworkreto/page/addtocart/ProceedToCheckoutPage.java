package co.com.juanmaya.sofka.frameworkreto.page.addtocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckoutPage {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span/i")
    WebElement readyToCheckout;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/form/p/button/span/i")
    WebElement proceedToCheckoutAddress;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\'form\']/p/button/span/i")
    WebElement proceedToCheckoutShipping;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'form\']/div/p[2]/label")
    WebElement agreedTermsAndConditions;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'HOOK_PAYMENT\']/div[2]/div/p/a")
    WebElement payByCheck;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'cart_navigation\']/button")
    WebElement confirmMyOrder;

    public WebElement getReadyToCheckout() {
        return readyToCheckout;
    }

    public WebElement getProceedToCheckoutAddress() {
        return proceedToCheckoutAddress;
    }

    public WebElement getProceedToCheckoutShipping() {
        return proceedToCheckoutShipping;
    }

    public WebElement getAgreedTermsAndConditions() {
        return agreedTermsAndConditions;
    }

    public WebElement getPayByCheck() {
        return payByCheck;
    }

    public WebElement getConfirmMyOrder() {
        return confirmMyOrder;
    }

    public ProceedToCheckoutPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
