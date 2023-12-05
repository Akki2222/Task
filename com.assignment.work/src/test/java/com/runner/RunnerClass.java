package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/com/features",
		glue = "com.stepdef",
		plugin = "html:target/report",
		monochrome = true
		
)


public class RunnerClass extends AbstractTestNGCucumberTests{

}
