package root;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@CucumberOptions(features = "src/test/resources/root")
@RunWith(Cucumber.class)
public class RootRunnerTest {
}
