package co.com.juanmaya.sofka.frameworkreto.controllers.addtocart;

import co.com.juanmaya.sofka.frameworkreto.helpers.Helper;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.AddToCartPage;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.ProceedToCheckoutPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.openqa.selenium.WebElement;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class ProceedToCheckoutPageController {
    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }
    private WebAction webAction;

    public ProceedToCheckoutPageController() {
    }

    public ProceedToCheckoutPageController(WebAction webAction) {
        this.webAction = webAction;

    }

    public void procederConLaCompra()
    {
        try
        {
            ProceedToCheckoutPage proceedToCheckoutPage = new ProceedToCheckoutPage(webAction.getDriver());

            webAction.click(proceedToCheckoutPage.getReadyToCheckout(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(proceedToCheckoutPage.getProceedToCheckoutAddress(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            WebElement test = proceedToCheckoutPage.getAgreedTermsAndConditions();
            webAction.moveTo(test,STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(test,STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(proceedToCheckoutPage.getProceedToCheckoutShipping(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            webAction.click(proceedToCheckoutPage.getPayByCheck(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(proceedToCheckoutPage.getConfirmMyOrder(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
        }
        catch (WebActionsException e)
        {
            Report.reportFailure("Ocurrio un error al intentar abrir la pagina de confirmar los datos de compra");
        }
    }

}
