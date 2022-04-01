package co.com.juanmaya.sofka.frameworkreto.controllers.contactus;

import co.com.juanmaya.sofka.frameworkreto.page.contactus.ContactUsPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class ContactUsAllFieldsController {
    private WebAction webAction;
    private String email;
    private String message;
    private String reference;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public ContactUsAllFieldsController(WebAction webAction, String email, String message, String reference) {
        this.email = email;
        this.message = message;
        this.webAction = webAction;
        this.reference = reference;
    }

    public void crearUnMensajeParaSoporteConTodosLosCampos(){
        try {
            ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());
            webAction.selectByPartialText(contactUsPage.getHeading(), "Customer", STANDARD_TIMEOUT_FIVE, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(contactUsPage.getEmail(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(contactUsPage.getEmail(), email, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(contactUsPage.getMessage(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(contactUsPage.getMessage(), message, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(contactUsPage.getReference(),reference,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.uploadFile(contactUsPage.getInvisibleUploadInput(),STANDARD_UPLOAD_FILE_LOCATION,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(contactUsPage.getSendButton(), STANDARD_EVIDENCE_SCREENSHOT);
        }
        catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error mientras se escribia el mensaje con todos los campos, para soporte tecnico");
        }
    }
}
