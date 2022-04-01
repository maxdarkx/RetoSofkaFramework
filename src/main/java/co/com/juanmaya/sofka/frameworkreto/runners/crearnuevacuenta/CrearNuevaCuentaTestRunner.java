package co.com.juanmaya.sofka.frameworkreto.runners.crearnuevacuenta;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets=CucumberOptions.SnippetType.CAMELCASE,
        features= {"src/main/resources/features/crearnuevacuenta/"},
        glue= {"co.com.juanmaya.sofka.frameworkreto.stepdefinition.crearnuevacuenta"},
        publish = true
        )
public class CrearNuevaCuentaTestRunner {
}
