package co.com.juanmaya.sofka.frameworkreto.stepdefinition.crearnuevacuenta;

import co.com.juanmaya.sofka.frameworkreto.controllers.crearnuevacuenta.CreateAnAccountWebController;
import co.com.juanmaya.sofka.frameworkreto.controllers.crearnuevacuenta.LoginPageController;
import co.com.juanmaya.sofka.frameworkreto.controllers.crearnuevacuenta.MyAccountWebController;
import co.com.juanmaya.sofka.frameworkreto.controllers.openwebpage.StartBrowserWebController;
import co.com.juanmaya.sofka.frameworkreto.data.objects.TestInfo;
import co.com.juanmaya.sofka.frameworkreto.model.Customer;
import co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary;
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


public class CrearNuevaCuentaTestStepsDefinition extends Setup {
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

    private StartBrowserWebController initTest()
    {
        StartBrowserWebController startBrowserWebController =
                new StartBrowserWebController(webAction, testInfo.getFeatureName(), browser());
        startBrowserWebController.abrirTiendaOnline();
        return startBrowserWebController;
    }

    @Dado("que el cliente esta en la pagina de inicio")
    public void queElClienteEstaEnLaPaginaDeInicio() {
        initTest();
        customer = new Customer(SPANISH_CODE_LANGUAGE, US_COUNTRY_CODE, EMAIL_DOMAIN);

    }
    @Cuando("el cliente registra sus datos para una cuenta en linea de forma exitosa")
    public void elClienteRegistraSusDatosParaUnaCuentaEnLineaDeFormaExitosa() {
        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta(customer);
    }
    @Entonces("como resultado el usuario quedara logueado dentro de su respectiva sesion per se.")
    public void comoResultadoElUsuarioQuedaraLogueadoDentroDeSuRespectivaSesionPerSe() {
        String usuarioRegistrado;
        MyAccountWebController accountWebController = new MyAccountWebController();
        accountWebController.setWebAction(webAction);
        usuarioRegistrado = accountWebController.obtenerNombreDeNuevoUsuario();
        Assert.Hard
                .thatString(usuarioRegistrado)
                .isEqualTo(customer.getFirstName()+ Dictionary.SPACE_STRING+ customer.getLastName());
    }
}
