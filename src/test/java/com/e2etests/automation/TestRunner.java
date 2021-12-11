package com.e2etests.automation;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/specs/features" },
plugin = { "pretty", "html:target/cucumberReport","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Orange.html" },
tags = {("@Valid_Connxion")},
		snippets = SnippetType.CAMELCASE, monochrome = true)

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport () {
		Reporter.loadXMLConfig(new File("src/test/resource/configs/extent-config.xml"));
	}

}
