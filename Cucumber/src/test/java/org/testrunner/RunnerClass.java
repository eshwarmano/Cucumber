package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile\\ForgottenPassword.Feature",glue="org.stepdefinition",dryRun=true,monochrome=true,strict=false)

public class RunnerClass {

}
