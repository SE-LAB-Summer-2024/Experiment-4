package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^Two input values (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
    }

    @Then("^the expect result should be (\\d+)$")
    public void theExpectResultShouldBe(int arg0) {
    }
}
