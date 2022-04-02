package co.com.juanmaya.sofka.frameworkreto.stepdefinition.addtocart;

import co.com.juanmaya.sofka.frameworkreto.controllers.addtocart.AddToCartFromAuxiliaryViewPageController;
import co.com.juanmaya.sofka.frameworkreto.controllers.addtocart.AddToCartPageController;
import co.com.juanmaya.sofka.frameworkreto.controllers.addtocart.OrderCompletePageController;
import co.com.juanmaya.sofka.frameworkreto.controllers.addtocart.ProceedToCheckoutPageController;
import co.com.juanmaya.sofka.frameworkreto.controllers.crearnuevacuenta.CreateAnAccountWebController;
import co.com.juanmaya.sofka.frameworkreto.controllers.crearnuevacuenta.LoginPageController;
import co.com.juanmaya.sofka.frameworkreto.controllers.openwebpage.StartBrowserWebController;
import co.com.juanmaya.sofka.frameworkreto.data.objects.TestInfo;
import co.com.juanmaya.sofka.frameworkreto.model.Customer;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.AddToCartPage;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.OrderCompletePage;
import co.com.juanmaya.sofka.frameworkreto.page.addtocart.ProceedToCheckoutPage;
import co.com.juanmaya.sofka.frameworkreto.stepdefinition.crearnuevacuenta.Setup;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;
import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.EMAIL_DOMAIN;

public class AddToCartStepDefinition extends Setup {
    private WebAction webAction;
    private Customer customer;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

    @After
    public void cerrarDriver() throws InterruptedException
    {
        //solo para emergencias
        //Thread.sleep(2000);
        if(webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();
        Report.reportInfo("*********HA FINALIZADO LA PRUEBA*********"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }

    //Para el primer Escenario: Añadir al carrito desde la pagina principal
    @Dado("que el cliente se encuentra en la pagina de inicio y ha hecho login en su cuenta")
    public void queElClienteSeEncuentraEnLaPaginaDeInicioYHaHechoLoginEnSuCuenta() {
        StartBrowserWebController startBrowserWebController = new StartBrowserWebController(
                webAction,
                testInfo.getFeatureName(),
                browser()
        );
        startBrowserWebController.abrirTiendaOnline();
        customer = new Customer(SPANISH_CODE_LANGUAGE, US_COUNTRY_CODE, EMAIL_DOMAIN);

        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta(customer);
    }

    @Cuando("el cliente selecciona algunos articulos y estos se agregan al carrito de compras")
    public void elClienteSeleccionaAlgunosArticulosYEstosSeAgreganAlCarritoDeCompras() {
        AddToCartPageController addToCartPageController = new AddToCartPageController(webAction);
        addToCartPageController.anadirAlCarrito();
    }
    @Cuando("el cliente hace checkout")
    public void elClienteHaceCheckout() {
        ProceedToCheckoutPageController proceedToCheckoutPageController= new ProceedToCheckoutPageController(webAction);
        proceedToCheckoutPageController.procederConLaCompra();
    }
    @Entonces("el cliente adquiere los articulos")
    public void elClienteAdquiereLosArticulos() {
        String mensajeOrdenCompleta;
        OrderCompletePageController orderCompletePageController = new OrderCompletePageController(webAction);
        mensajeOrdenCompleta = orderCompletePageController.obtenerTextoOrdenCompleta();
        Assert.Hard.thatString(mensajeOrdenCompleta).isEqualTo(ORDER_COMPLETE);
    }


    //para el escenario: Añadir al carrito desde las vistas auxiliares
    @Cuando("el cliente selecciona algunos articulos desde sus vistas detalladas y estos se agregan al carrito de compras")
    public void el_cliente_selecciona_algunos_articulos_desde_sus_vistas_detalladas_y_estos_se_agregan_al_carrito_de_compras() {
        AddToCartFromAuxiliaryViewPageController addToCartFromAuxiliaryViewPageController =
                new AddToCartFromAuxiliaryViewPageController(webAction);
        addToCartFromAuxiliaryViewPageController.anadirAlCarritoDesdeVistasAuxiliares();
    }

}
