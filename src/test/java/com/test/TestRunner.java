package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resource", glue= {"com.test"},
//@CucumberOptions(features="src/main/resource/UITesting.feature", glue= {"com.test"},
plugin= {"usage","html:target/html-report", "json: target/report.json"}
		)

public class TestRunner {

}
