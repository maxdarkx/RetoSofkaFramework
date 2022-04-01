package co.com.juanmaya.sofka.frameworkreto.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    @CacheLookup
    @FindBy(css = ".login")
    WebElement signIn;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    WebElement contactUs;

    public WebElement getSignIn() {
        return signIn;
    }

    public WebElement getContactUs() {
        return contactUs;
    }

    public LandingPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
