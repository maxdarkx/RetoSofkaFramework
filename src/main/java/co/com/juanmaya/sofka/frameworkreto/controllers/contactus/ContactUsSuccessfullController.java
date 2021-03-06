package co.com.juanmaya.sofka.frameworkreto.controllers.contactus;

import co.com.juanmaya.sofka.frameworkreto.page.contactus.ContactUsSuccessfullPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.STANDARD_EVIDENCE_SCREENSHOT;
import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.STANDARD_TIMEOUT_TWO;

public class ContactUsSuccessfullController {
    private WebAction webAction;

    public WebAction getWebAction() {
        return webAction;
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public ContactUsSuccessfullController(WebAction webAction) {
        this.webAction = webAction;

    }

    public String checkMessage()
    {
        String message= "";
        try {
            ContactUsSuccessfullPage contactUsSuccessfullPage = new ContactUsSuccessfullPage(webAction.getDriver());
            message = webAction.getText(contactUsSuccessfullPage.getSuccessfullContact(), STANDARD_TIMEOUT_TWO, STANDARD_EVIDENCE_SCREENSHOT);
        }
        catch (WebActionsException e)
        {
            Report.reportFailure("No se envio el mensaje de soporte correctamente");
        }

        return message;
    }
}
