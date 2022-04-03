package co.com.juanmaya.sofka.frameworkreto.runners.contactus;

import co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.utils.files.PropertiesFile;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.nio.file.Path;
import java.nio.file.Paths;
import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/main/resources/features/contactus/"},
        glue = {"co.com.juanmaya.sofka.frameworkreto.stepdefinition.crearnuevacuenta.contactus"},
        publish = true
)

public class ContactUsRunner
{
    @BeforeClass
    public static void setup() {
        //String os = System.getProperty("os.name");
        String rutaEvidencias;

        Path propertiesFolder = Paths.get(System.getProperty("user.dir"), CONFIGURATION_PROPERTIES_FILE);
        PropertiesFile propertiesFile = new PropertiesFile("default", propertiesFolder);
        rutaEvidencias =USER_DIRECTORY + "/" +  EVIDENCE_FILE_LOCATION;
        propertiesFile.updateFieldValue("files.evidence", rutaEvidencias);
        Report.reportInfo("Evidence file: "+ rutaEvidencias);
    }
}
