package co.com.juanmaya.sofka.frameworkreto.page.addtocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletePage {

    //*[@id="center_column"]/p[1]
    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/p[1]")
    WebElement orderComplete;

    public WebElement getOrderComplete() {
        return orderComplete;
    }

    public OrderCompletePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
