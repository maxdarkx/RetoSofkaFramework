package co.com.juanmaya.sofka.frameworkreto.controllers.openwebpage;

import co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary;
import co.com.juanmaya.sofka.frameworkreto.helpers.Helper;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;


public class StartBrowserWebController {
    private WebAction webAction;
    private String feature;
    private Browser browser;

    public StartBrowserWebController(WebAction webAction, String feature, Browser browser) {
        this.webAction = webAction;
        this.feature = feature;
        this.browser = browser;
    }

    public StartBrowserWebController() {
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void abrirTiendaOnline()
    {
     try
     {
         webAction.startWebApp(browser, Helper.getProperty(Dictionary.APP_URL_PROPERTY), feature);
     }
     catch (WebActionsException e)
     {
         Report.reportFailure("La pagina no pudo cargar adecuadamente", e);
     }
    }
}
