package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.File;

@CucumberOptions(features = "src/test/resources/feature/archivo.feature"
        , glue="stepdefs"
        ,tags="@testnumero10")
@RunWith(Cucumber.class)
public class run
{

}
