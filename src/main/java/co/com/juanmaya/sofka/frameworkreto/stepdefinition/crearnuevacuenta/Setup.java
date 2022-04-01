package co.com.juanmaya.sofka.frameworkreto.stepdefinition.crearnuevacuenta;

import co.com.juanmaya.sofka.frameworkreto.data.objects.TestInfo;
import co.com.sofka.test.automationtools.selenium.Browser;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
    protected TestInfo testInfo;

    public Browser browser()
    {
        Browser browserConfiguration = new Browser();
        browserConfiguration.setBrowser(Browser.Browsers.CHROME);
        browserConfiguration.setIncognito(true);
        browserConfiguration.setAutoDriverDownload(true);

        /*PARA AUTOSETEAR EL DRIVER DEL WEB BROWSER
        browserConfiguration.setDriverVersion("");
        browserConfiguration.setAutoDriverDownload(true);
        */
        browserConfiguration.setChromeOptions(chromeOptions());
        return browserConfiguration;
    }

    public ChromeOptions chromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }
}
