package co.com.juanmaya.sofka.frameworkreto.controllers.crearnuevacuenta;

import co.com.juanmaya.sofka.frameworkreto.page.crearnuevacuenta.LandingPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.STANDARD_EVIDENCE_SCREENSHOT;
import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.STANDARD_TIMEOUT_TWO;

public class LoginPageController {
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void irHaciaLoginPage(){
        try{
            LandingPage landingPage = new LandingPage(webAction.getDriver());

            webAction.click(landingPage.getSignIn(), STANDARD_TIMEOUT_TWO,STANDARD_EVIDENCE_SCREENSHOT);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar abrir la tienda online", e);
        }
    }
}
