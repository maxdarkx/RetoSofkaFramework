package co.com.juanmaya.sofka.frameworkreto.controllers.addtocart;

import co.com.juanmaya.sofka.frameworkreto.page.addtocart.AddToCartFromAuxiliaryViewPage;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.AddToCartPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.google.gson.annotations.Until;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class AddToCartFromAuxiliaryViewPageController {
    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }
    private WebAction webAction;


    public AddToCartFromAuxiliaryViewPageController() {}

    public AddToCartFromAuxiliaryViewPageController(WebAction webAction) {
        this.webAction = webAction;
    }


    public void anadirAlCarritoDesdeVistasAuxiliares()
    {
        try
        {
            AddToCartFromAuxiliaryViewPage addToCartFromAuxiliaryViewPage = new AddToCartFromAuxiliaryViewPage(webAction.getDriver());

            webAction.click(addToCartFromAuxiliaryViewPage.getWomenCategory(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            webAction.moveTo(addToCartFromAuxiliaryViewPage.getWomenCategoryPictureItem1(), STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getWomenCategoryExpandedViewItem1(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getWomenCategoryAddToCartItem1(), STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getContinueShopping(),STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.moveTo(addToCartFromAuxiliaryViewPage.getHomeFromeSale(), STANDARD_TIMEOUT_TWENTY, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getHomeFromeSale(), STANDARD_TIMEOUT_TWENTY, STANDARD_EVIDENCE_SCREENSHOT);

            /*TODO------------------------------JUGADA COCHINA, SUCIA... PREGUNTAR EN CLASE------------------------
            si no se refresca el elemento a presionar, no es capaz de encontrarlo. Solucion cochina!
            org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
             */
            addToCartFromAuxiliaryViewPage = new AddToCartFromAuxiliaryViewPage(webAction.getDriver());
            //-------------------------------------------------------------------------------------------------

            webAction.click(addToCartFromAuxiliaryViewPage.getWomenCategory(),STANDARD_EVIDENCE_SCREENSHOT);

            webAction.moveTo(addToCartFromAuxiliaryViewPage.getWomenCategoryPictureItem2(), STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getWomenCategoryExpandedViewItem2(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getWomenCategoryAddToCartItem2(), STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getContinueShopping(),STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getHomeFromeSale(), STANDARD_TIMEOUT_TWENTY, STANDARD_EVIDENCE_SCREENSHOT);

            addToCartFromAuxiliaryViewPage = new AddToCartFromAuxiliaryViewPage(webAction.getDriver());
            webAction.click(addToCartFromAuxiliaryViewPage.getDressesCategory(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            webAction.moveTo(addToCartFromAuxiliaryViewPage.getDressesCategoryPictureItem4(), STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getDressesCategoryExpandedViewItem4(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getDressesCategoryAddToCartItem4(), STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getContinueShopping(),STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getHomeFromeSale(), STANDARD_TIMEOUT_TWENTY, STANDARD_EVIDENCE_SCREENSHOT);

            addToCartFromAuxiliaryViewPage = new AddToCartFromAuxiliaryViewPage(webAction.getDriver());
            webAction.click(addToCartFromAuxiliaryViewPage.getDressesCategory(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);

            webAction.moveTo(addToCartFromAuxiliaryViewPage.getDressesCategoryPictureItem5(), STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getDressesCategoryExpandedViewItem5(),STANDARD_TIMEOUT_FIVE,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getDressesCategoryAddToCartItem5(), STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(addToCartFromAuxiliaryViewPage.getProceedToCheckout(),STANDARD_TIMEOUT_TWENTY,STANDARD_EVIDENCE_SCREENSHOT);


        }
        catch (WebActionsException e)
        {
            Report.reportFailure("Ocurrio un error al intentar abrir la pagina de anadir desde auxiliares al carrito");
        }
    }

}
