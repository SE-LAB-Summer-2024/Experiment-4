package root;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RootTest {
    private int value1;
    private int value2;
    private int result;
    private RootCalculator rootCalculator;

    @Before
    public void setUp() {
        rootCalculator = new RootCalculator();
    }

    @Given("^two integers (-?\\d+), (-?\\d+) and division must be non-negative$")
    public void twoIntegersAndMustBeNonNegative(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
        Assert.assertTrue(arg0 / arg1 >= 0);
    }

    @When("^I calculate the root$")
    public void iCalculateTheRootOf() {
        result = (int) rootCalculator.root(value1, value2);
        System.out.println(result);
    }

    @Then("^the expected result should be (\\d+)$")
    public void theExpectedResultShouldBe(int arg0) {
        Assert.assertEquals(result, arg0);
    }
}
