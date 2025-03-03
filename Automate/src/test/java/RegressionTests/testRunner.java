package RegressionTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junitxmlformatter.*;
import io.cucumber.junit.Cucumber;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features", glue= {"RegressionTests"}, 
	monochrome=true,
	plugin= {"pretty", "junit:target/JSONReports/report.json",
			"html:target/HTMLReports"},
	tags="@Login")
	public class testRunner {
		
	}


