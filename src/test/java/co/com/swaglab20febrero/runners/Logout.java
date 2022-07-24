package co.com.swaglab20febrero.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/logout.feature",
        glue = "co.com.swaglab20febrero.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Logout {
}
