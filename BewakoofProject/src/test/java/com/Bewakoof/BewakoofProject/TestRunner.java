package com.Bewakoof.BewakoofProject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources",
		plugin= "pretty",
		strict=false,
		monochrome =true
		
		)

public class TestRunner {
	
	

	public static void main(String[] args) {
		

	}

}
