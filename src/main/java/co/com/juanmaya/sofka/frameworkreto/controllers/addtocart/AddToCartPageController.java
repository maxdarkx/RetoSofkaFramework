package co.com.juanmaya.sofka.frameworkreto.controllers.addtocart;

import co.com.juanmaya.sofka.frameworkreto.helpers.Helper;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.AddToCartPage;
import co.com.juanmaya.sofka.frameworkreto.page.crearnuevacuenta.LandingPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class AddToCartPageController {
    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }
    private WebAction webAction;

    public AddToCartPageController() {
    }

    public AddToCartPageController(WebAction webAction) {
        this.webAction = webAction;
    }

    public void anadirAlCarrito()
    {
        try
        {
            AddToCartPage addToCartPage = new AddToCartPage(webAction.getDriver());

            webAction.click(addToCartPage.getWomenCategory(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            webAction.moveTo(addToCartPage.getPictureWomenCategoryItem3(), STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartPage.getAddToCartWomenCategoryItem3(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartPage.getContinueShopping(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            webAction.moveTo(addToCartPage.getPictureWomenCategoryItem6(), STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartPage.getAddToCartWomenCategoryItem6(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartPage.getContinueShopping(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            webAction.click(addToCartPage.getTshirtCategory(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.moveTo(addToCartPage.getPictureTshirtCategoryItem1(), STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartPage.getAddToCartTshirtCategoryItem1(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartPage.getProceedToCheckout(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

        }
        catch (WebActionsException e)
        {
            Report.reportFailure("Ocurrio un error al intentar abrir la pagina de anadir al carrito");
        }
    }

}
