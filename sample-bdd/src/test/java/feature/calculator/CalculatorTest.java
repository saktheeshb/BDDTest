package feature.calculator;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(features={"src/test/resources/calculate.feature","src/test/resources/calc.feature", "src/test/resources/multicalc.feature" })
@RunWith(Cucumber.class)
public class CalculatorTest {
 
}