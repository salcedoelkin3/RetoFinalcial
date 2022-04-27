package co.com.choucair.retofinancial.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/feature/retofinancial.feature",
        tags = "@historia",
        glue = "co.com.choucair.retofinancial.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
