package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bansa\\eclipse-workspace\\AmazonCucumber\\src\\test\\java\\feature\\createAcc.feature", glue={"stepDefination"},
plugin= { "pretty", "html:target/HTmlreports"}, monochrome=true,
dryRun=true, tags="@tag11")


public class Testrunner {

}
