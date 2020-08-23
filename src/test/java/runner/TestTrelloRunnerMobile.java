package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="features/mobileapp.feature",glue= {"stepDefinition/TestTrelloMobile"},
        plugin= {"html:target/cucumber-html-report","json:target/cucumber.json",
                "usage:target/cucumber-usage.json"})

public class TestTrelloRunnerMobile extends AbstractTestNGCucumberTests {

}
