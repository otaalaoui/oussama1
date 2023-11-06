package create.compte.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/project.features", glue = {
		"create.compte.steps" },strict = true, plugin = { "pretty", "html:target/HtmlReports" })
public class Runner {

}
