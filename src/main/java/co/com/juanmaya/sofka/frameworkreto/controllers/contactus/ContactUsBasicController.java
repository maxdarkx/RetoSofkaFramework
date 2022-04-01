package co.com.juanmaya.sofka.frameworkreto.controllers.contactus;

import co.com.juanmaya.sofka.frameworkreto.page.contactus.ContactUsPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.openqa.selenium.WebDriver;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.STANDARD_EVIDENCE_SCREENSHOT;
import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.STANDARD_TIMEOUT_FIVE;

public class ContactUsBasicController {
    private WebAction webAction;
    private String email;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public ContactUsBasicController(WebAction webAction, String email, String message) {
        this.email = email;
        this.message = message;
        this.webAction = webAction;
    }

    public void crearUnMensajeParaSoporte(){
        try {
            ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());
            webAction.selectByPartialText(contactUsPage.getHeading(), "Customer", STANDARD_TIMEOUT_FIVE, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(contactUsPage.getEmail(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(contactUsPage.getEmail(), email, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(contactUsPage.getMessage(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(contactUsPage.getMessage(), message, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(contactUsPage.getSendButton(), STANDARD_EVIDENCE_SCREENSHOT);
        }
        catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error mientras se escribia el mensaje para soporte tecnico");
        }
    }
}
