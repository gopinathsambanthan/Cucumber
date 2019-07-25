package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Feature.feature",
		
		plugin="json:target\\jsonreport.jason")
public class RunnerClass {

	
	
}
