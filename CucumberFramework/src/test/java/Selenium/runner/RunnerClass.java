package Selenium.runner;

//First we are writing the annotation called @RunWith
//Then inside the annotation, we have to write cucumber.class =@RunWith(Cucumber.class)
//We have to write one more annotation called cucumberoption
//In the cucumberOption(), we have to add feature(its like a webdriver driver) and give the path of the feature file(parabank.feature)
//The path is = rightclick on parabank.feature, to to properties & copy the file path "C:\SeleniumAutomation\DevOpsWorkSpace\CucumberFramework\FeatureFiles\parabank.feature"
//I am cutting the link from "C:\SeleniumAutomation\DevOpsWorkSpace\CucumberFramework\FeatureFiles\parabank.feature" to ".\\FeatureFiles\\parabank.feature"
//We are adding one more thing called glue and add the package name=@CucumberOptions(features =".\\FeatureFiles\\parabank.feature", glue = "Selenium.stepdefinition" )
//When we add monochrome = true in the @cucumber options, it means we can read the console message in a human readable formatt. But we are adding false while coding down below
//For Example:
//[32m[1m│[0m src/test/resources/cucumber.properties:          [36mcucumber.publish.quiet[0m=[36mtrue[0m      [32m[1m│[0m
//[32m[1m│[0m src/test/resources/junit-platform.properties:    [36mcucumber.publish.quiet[0m=[36mtrue[0m      [32m[1m│[0m
//We are adding few more things to the @cucumber options. That is:
//@cucumberOptions(
//features =".\\FeatureFiles\\parabankLoginDataDriven.feature",
//glue = "Selenium.stepdefinition
//dryRun = false
//monochrome = false
//plugin = {"html:reports/webreport.html"} = //what type of report we want it, for that we use plugin. We have to have report folder in the cucumber framework
//I added one more way of getting report. That is cucumber report: "html:reports/cucumber-reports.html
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\FeatureFiles\\parabankLoginDataDriven.feature", 
		glue = "Selenium.stepdefinition",
		dryRun = false,
		monochrome = false,
		plugin = {"html:reports/webreport.html","html:reports/cucumber-reports.html"}	
		)
public class RunnerClass {

}
