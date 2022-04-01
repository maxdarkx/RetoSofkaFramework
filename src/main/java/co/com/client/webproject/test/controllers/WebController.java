package co.com.client.webproject.test.controllers;


import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebController {

    public void abrirSitioWebSofka() {
        Browser browserConfig= new Browser();
        browserConfig.setBrowser(Browser.Browsers.CHROME);

        browserConfig.setIncognito(true);
        //browserConfig.setDriverVersion("99.0.4844.84");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        browserConfig.setChromeOptions(options);

        try {
            WebAction webAction = new WebAction("TEST_WEB_APP");
            webAction.startWebApp(browserConfig,"https://www.sofka.com.co/es/", "HOME_SOFKA");
            webAction.pause(5, true);
            webAction.closeBrowser();
        }catch (WebActionsException e)
        {
            Report.reportFailure("Ocurrio un error al abrir el sitio web de sofka" + e);
        }
    }

    public static void main(String[] args)
    {
        WebController webController = new WebController();
        webController.abrirSitioWebSofka();
    }
}
