/**
 * 
 */
package feature.calculator;

import com.bdd.app.sample_bdd.Calculator;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author saktheeshbalaraj
 *
 */
public class CalculatSt {
	Calculator calc = new Calculator();
	
	@Given("^first number (\\d+)$")
	public void first_number(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		calc.setFirstNumber(arg1);
	}

	@Given("^second number (\\d+)$")
	public void second_number(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		calc.setSecondNumber(arg1);
	}

	@When("^the user do calculate$")
	public void the_user_do_calculate() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		calc.calculate();
	}

	@Then("^result should be printed as '(\\d+)'$")
	public void result_should_be_printed_as_(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		Assert.assertEquals(calc.display(), arg1);
	}

	
}
