package co.com.juanmaya.sofka.frameworkreto.page.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    @CacheLookup
    @FindBy(id = "id_contact")
    WebElement heading;

    @CacheLookup
    @FindBy(id = "email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "id_order")
    WebElement reference;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'uniform-fileUpload\']/span[1]")
    WebElement attachFile;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'contact-link\']/a")
    WebElement contactUs;

    @CacheLookup
    @FindBy(id = "message")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//*[@id='submitMessage']/span/i")
    WebElement sendButton;

    @CacheLookup
    @FindBy(id = "fileUpload")
    WebElement invisibleUploadInput;

    public WebElement getHeading() {
        return heading;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getReference() {
        return reference;
    }

    public WebElement getAttachFile() {
        return attachFile;
    }

    public WebElement getContactUs() {
        return contactUs;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public WebElement getInvisibleUploadInput() {
        return invisibleUploadInput;
    }

    public ContactUsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
