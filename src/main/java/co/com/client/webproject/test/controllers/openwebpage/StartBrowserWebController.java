package co.com.client.webproject.test.controllers.openwebpage;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import static co.com.client.webproject.test.helpers.Helper.getProperty;

import static co.com.client.webproject.test.helpers.Dictionary.APP_URL_PROPERTY;


public class StartBrowserWebController {
    private WebAction webAction;
    private String feature;

    public StartBrowserWebController(WebAction webAction, String feature, Browser browser) {
        this.webAction = webAction;
        this.feature = feature;
        this.browser = browser;
    }

    public StartBrowserWebController() {
    }

    private Browser browser;

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
         webAction.startWebApp(browser, getProperty(APP_URL_PROPERTY), feature);
     }
     catch (WebActionsException e)
     {
         Report.reportFailure("La pagina no pudo cargar adecuadamente", e);
     }
    }
}
