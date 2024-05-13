package StepDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\LoginDemo.feature", // Path to your feature files
        glue = "StepDefinition", // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Report plugins
)
public class CucumberRunner {



}
