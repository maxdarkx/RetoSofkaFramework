package co.com.juanmaya.sofka.frameworkreto.runners.addtocart;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"co.com.juanmaya.sofka.frameworkreto.stepdefinition.addtocart"},
        features = {"src/main/resources/features/addtocart"},
        tags = "",
        publish= true
)
public class AddToCartRunner {
}
