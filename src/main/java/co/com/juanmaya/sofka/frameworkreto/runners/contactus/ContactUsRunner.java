package co.com.juanmaya.sofka.frameworkreto.runners.contactus;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/main/resources/features/contactus/crearMensajeBasico.feature"},
        glue = {"co.com.juanmaya.sofka.frameworkreto.stepdefinition.crearnuevacuenta.contactus"},
        publish = true
)

public class ContactUsRunner {
}
