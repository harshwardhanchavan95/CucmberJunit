package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features/XYZ.feature"},
		glue= {"stepdefinition"},
		monochrome = true,	
		dryRun=false,
		plugin= {"html:Reports/demo1.html",
				"json:Reports/demo2.json",
				"junit:Reports/demo3.xml",
				"html:Reports/demo4.txt"
				}
		)	
public class Rename {
	

}
