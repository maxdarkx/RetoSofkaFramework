package co.com.juanmaya.sofka.frameworkreto.controllers.addtocart;

import co.com.juanmaya.sofka.frameworkreto.page.addtocart.OrderCompletePage;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.ProceedToCheckoutPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class OrderCompletePageController {
    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }
    private WebAction webAction;

    public OrderCompletePageController() {
    }

    public OrderCompletePageController(WebAction webAction) {
        this.webAction = webAction;

    }

    public String obtenerTextoOrdenCompleta()
    {
        String successfullMessage= "";
        try
        {
            OrderCompletePage orderCompletePage= new OrderCompletePage(webAction.getDriver());
            successfullMessage = webAction.getText(orderCompletePage.getOrderComplete(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

        }
        catch (WebActionsException e)
        {
            Report.reportFailure("Ocurrio un error al intentar abrir la pagina de mensaje de venta exitosa");
        }
        return successfullMessage;
    }

}
