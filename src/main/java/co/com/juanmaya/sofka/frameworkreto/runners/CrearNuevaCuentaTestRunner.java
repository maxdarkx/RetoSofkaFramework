package co.com.juanmaya.sofka.frameworkreto.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets=CucumberOptions.SnippetType.CAMELCASE,
        features= {"src/main/resources/features/crearNuevaCuenta.feature"},
        glue= {"co.com.juanmaya.sofka.frameworkreto.stepdefinition"},
        publish = true
        )
public class CrearNuevaCuentaTestRunner {
}
