package org.TestRunner;

import org.help.jvmreport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\cucumberface\\src\\test\\resources\\Feature"
,glue="org.Stepdefinition",monochrome=true, dryRun=false,tags= {"@sanity, @morning"},plugin= {"html:target\\reports",
                                  "junit:target\\reports\\fb.xml","json:target\\reports\\face.json"})

public class Testrunner {
	@AfterClass
	public static  void pullreport() {
		jvmreport.generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\face.json");

	}

}
