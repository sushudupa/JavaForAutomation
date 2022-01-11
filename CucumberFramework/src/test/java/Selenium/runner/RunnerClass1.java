package Selenium.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\FeatureFiles\\registerdemoDataDriven.feature", glue = "registerdemo.stepdefinition")

public class RunnerClass1 {

}
