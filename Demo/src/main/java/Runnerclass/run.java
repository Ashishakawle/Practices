package Runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features = "src\\main\\java\\featurefile\\Ashish.feature",
		glue={"Stepdefination"}
		)
public class run extends AbstractTestNGCucumberTests {

}
