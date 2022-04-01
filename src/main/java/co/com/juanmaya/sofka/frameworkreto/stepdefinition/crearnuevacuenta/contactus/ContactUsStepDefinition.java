package co.com.juanmaya.sofka.frameworkreto.stepdefinition.crearnuevacuenta.contactus;

import co.com.juanmaya.sofka.frameworkreto.controllers.contactus.ContactUsAllFieldsController;
import co.com.juanmaya.sofka.frameworkreto.controllers.contactus.ContactUsBasicController;
import co.com.juanmaya.sofka.frameworkreto.controllers.contactus.ContactUsSuccessfullController;
import co.com.juanmaya.sofka.frameworkreto.controllers.contactus.LandingPageContactUsController;
import co.com.juanmaya.sofka.frameworkreto.data.objects.TestInfo;
import co.com.juanmaya.sofka.frameworkreto.model.Customer;
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

public class ContactUsStepDefinition extends Setup {
    private WebAction webAction;
    private Customer customer;

    @Before
    public void setup(Scenario scenario)
    {
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


    @Dado("que el cliente se encuentra en la pagina de inicio")
    public void queElClienteSeEncuentraEnLaPaginaDeInicio() {
        customer = new Customer(SPANISH_CODE_LANGUAGE, US_COUNTRY_CODE, EMAIL_DOMAIN);
        LandingPageContactUsController landingPage =
                new LandingPageContactUsController(
                        browser(),
                        testInfo.getFeatureName(),
                        webAction
                );

        landingPage.irHaciaContactUsPage();
    }
    @Cuando("el cliente navega hacia la pagina de contacto y escribe su email, selecciona un destinatario y escribe un mensaje")
    public void elClienteNavegaHaciaLaPaginaDeContactoYEscribeSuEmailSeleccionaUnDestinatarioYEscribeUnMensaje() {

        ContactUsBasicController contactUsBasicController =
                new ContactUsBasicController(
                        webAction,
                        customer.getEmail(),
                        customer.getMessage()
                );
        contactUsBasicController.crearUnMensajeParaSoporte();
    }

    @Entonces("el cliente recibe un mensaje de confirmacion de que su mensaje se ha enviado con exito.")
    public void elClienteRecibeUnMensajeDeConfirmacionDeQueSuMensajeSeHaEnviadoConExito() {
        String message;
        ContactUsSuccessfullController contactUsSuccessfullController =
                new ContactUsSuccessfullController(webAction);
        message = contactUsSuccessfullController.checkMessage();
        Assert.Hard
                .thatString(CONTACT_SUCCESSFULL_MESSAGE)
                .isEqualTo(message);
    }


    @Cuando("el cliente navega hacia la pagina de contacto y escribe su email, selecciona un destinatario,escribe un mensaje y carga un archivo")
    public void elClienteNavegaHaciaLaPaginaDeContactoYEscribeSuEmailSeleccionaUnDestinatarioEscribeUnMensajeYCargaUnArchivo() {
        ContactUsAllFieldsController contactUsAllFieldsController =
                new ContactUsAllFieldsController(
                        webAction,
                        customer.getEmail(),
                        customer.getMessage(),
                        customer.getReference()
                );
        contactUsAllFieldsController.crearUnMensajeParaSoporteConTodosLosCampos();
    }
    @Entonces("el cliente recibe un mensaje de confirmacion indicando que se ha enviado el mensaje exitosamente")
    public void elClienteRecibeUnMensajeDeConfirmacionIndicandoQueSeHaEnviadoElMensajeExitosamente() {
        String message;
        ContactUsSuccessfullController contactUsSuccessfullController =
                new ContactUsSuccessfullController(webAction);
        message = contactUsSuccessfullController.checkMessage();
        Assert.Hard
                .thatString(CONTACT_SUCCESSFULL_MESSAGE)
                .isEqualTo(message);
    }


}
