package co.com.juanmaya.sofka.frameworkreto.controllers.contactus;

import co.com.juanmaya.sofka.frameworkreto.helpers.Helper;
import co.com.juanmaya.sofka.frameworkreto.page.crearnuevacuenta.LandingPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class LandingPageContactUsController {
    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }
    private Browser browser;
    private String feature;
    private WebAction webAction;

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public LandingPageContactUsController() {
    }

    public LandingPageContactUsController(Browser browser, String feature, WebAction webAction) {
        this.browser = browser;
        this.feature = feature;
        this.webAction = webAction;
    }

    public void irHaciaContactUsPage()
    {
        try
        {
            webAction.startWebApp(browser, Helper.getProperty(APP_URL_PROPERTY), feature);
            LandingPage landingPage = new LandingPage(webAction.getDriver());
            webAction.click(landingPage.getContactUs(), STANDARD_TIMEOUT_TWO, STANDARD_EVIDENCE_SCREENSHOT);
        }
        catch (WebActionsException e)
        {
            Report.reportFailure("Ocurrio un error al intentar abrir la pagina de contacto");
        }
    }

}
