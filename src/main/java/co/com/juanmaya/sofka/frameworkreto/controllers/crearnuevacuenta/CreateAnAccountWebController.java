package co.com.juanmaya.sofka.frameworkreto.controllers.crearnuevacuenta;

import co.com.juanmaya.sofka.frameworkreto.model.Customer;
import co.com.juanmaya.sofka.frameworkreto.page.crearnuevacuenta.CreateAnAccountPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class CreateAnAccountWebController {
    private WebAction webAction;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void crearUnaCuenta(Customer customer1){
        try{
            customer = customer1;
            CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(webAction.getDriver());

            webAction.sendText(createAnAccountPage.getEmailAddress(), customer.getEmail(),STANDARD_TIMEOUT_TWO,STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(createAnAccountPage.getCreateAnAccount(), STANDARD_TIMEOUT_TWO, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(createAnAccountPage.getMr(), STANDARD_TIMEOUT_TEN, STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(createAnAccountPage.getFirstName(), customer.getFirstName(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(createAnAccountPage.getLastName(), customer.getLastName(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(createAnAccountPage.getPassword(), customer.getPassword(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.selectByPartialText(createAnAccountPage.getDay(), customer.getDayBirth(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.selectByValue(createAnAccountPage.getMonth(), customer.getMonthBirth(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.selectByPartialText(createAnAccountPage.getYear(), customer.getYearBirth(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(createAnAccountPage.getAddress1(), customer.getAddress(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(createAnAccountPage.getCity(), customer.getCity(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.selectByText(createAnAccountPage.getState(), customer.getState(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(createAnAccountPage.getPostCode(), customer.getPostalCode(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.sendText(createAnAccountPage.getPhoneMobile(), customer.getMobilePhone(), STANDARD_EVIDENCE_SCREENSHOT);
            webAction.click(createAnAccountPage.getRegister(), STANDARD_EVIDENCE_SCREENSHOT);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar crear una cuenta.", e);
        }
    }
}
