package co.com.client.webproject.test.stepdefinition;

import co.com.client.webproject.test.controllers.CreateAnAccountWebController;
import co.com.client.webproject.test.controllers.LoginPageController;
import co.com.client.webproject.test.controllers.MyAccountWebController;
import co.com.client.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.client.webproject.test.data.objects.TestInfo;
import co.com.client.webproject.test.model.Customer;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.client.webproject.test.helpers.Dictionary.SPACE_STRING;


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

    }
    @Cuando("el cliente registra sus datos para una cuenta en linea de forma exitosa")
    public void elClienteRegistraSusDatosParaUnaCuentaEnLineaDeFormaExitosa() {
        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();
        customer = createAnAccountWebController.getCustomer();

    }
    @Entonces("como resultado el usuario quedara logueado dentro de su respectiva sesion per se.")
    public void comoResultadoElUsuarioQuedaraLogueadoDentroDeSuRespectivaSesionPerSe() {
        String usuarioRegistrado;
        MyAccountWebController accountWebController = new MyAccountWebController();
        accountWebController.setWebAction(webAction);
        usuarioRegistrado = accountWebController.obtenerNombreDeNuevoUsuario();
        Assert.Hard
                .thatString(usuarioRegistrado)
                .isEqualTo(customer.getFirstName()+ SPACE_STRING+ customer.getLastName());
    }
}
