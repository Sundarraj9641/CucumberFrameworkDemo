package com.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Feature", //login feature file
glue={"com.step_definition"}, //package name
junit ="--step-notifications"
//tags = {"@PaymentPass"}
)
public class TestRunner {

}
