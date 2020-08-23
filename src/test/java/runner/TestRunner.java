package runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="features",glue= {"stepDefinition"},
        plugin= {"html:target/cucumber-html-report","json:target/cucumber.json",
                "usage:target/cucumber-usage.json"},monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
