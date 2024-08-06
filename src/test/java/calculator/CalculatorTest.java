package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.ca.Cal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Ca;
import org.junit.Assert;

public class CalculatorTest {
    private int value1;
    private int value2;
    private int result;
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^Two input values (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.println(result);
    }

    @Then("^the expect result should be (-?\\d+)$")
    public void theExpectResultShouldBe(int arg0) {
        Assert.assertEquals(result, arg0);
    }
}
