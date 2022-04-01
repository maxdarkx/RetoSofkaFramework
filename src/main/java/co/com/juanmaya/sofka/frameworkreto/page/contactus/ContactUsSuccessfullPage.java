package co.com.juanmaya.sofka.frameworkreto.page.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsSuccessfullPage {
    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/p")
    WebElement successfullContact;

    public WebElement getSuccessfullContact() {
        return successfullContact;
    }

    public ContactUsSuccessfullPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
