package com.qa3.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "C:\\Users\\SING110\\Documents\\JAVARELATEDITEMS\\POMWorkspace\\"
		 		+ "CucumberUsingPOM\\src\\main\\java\\com\\qa3\\features\\login.feature"
		 ,glue={"com\\qa3\\stepDefinition"},
		 plugin= {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"},
		 monochrome=true,
		 strict=true,
		 dryRun= false
		 
		 )

public class TestRunner {

}
