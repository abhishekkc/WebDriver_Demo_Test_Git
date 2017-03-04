package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/Features/Home_Page_LinkVerification.feature"
,glue = "stepDefinition"
,format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"}
,tags="@Home_Page_CarsLinkVerification"
		)
public class TestNG_Runner  extends AbstractTestNGCucumberTests{

}