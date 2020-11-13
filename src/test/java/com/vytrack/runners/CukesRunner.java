package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"json:target/cucumber.json",  //this line is for getting json file,
    "html:target/default-html-reports",   // this line for getting html report,
    "rerun:target/rerun.txt"},// this line for collecting(remembering) fail Scenarios and rerun.
    features = "src/test/resources/features",
    glue="com/vytrack/step_definitions",
    dryRun = false,
    // TRUE will not execute cucumber code, But FALSE will execute the code!
    // tags = "@driver  and  @smoke"// tags = " @driver  or   @login"
    tags = "@smoke"

)
 public class CukesRunner {


}