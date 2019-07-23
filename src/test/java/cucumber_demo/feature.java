package cucumber_demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(monochrome=true,features= "feature\\tagdemo.feature", glue= {"stepDef"},plugin= {"html:target/Cucumber_Selenium"},tags= {"@FunctionalTest@SmokeTest"})
	public class feature {
		
}

