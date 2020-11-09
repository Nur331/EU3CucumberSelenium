package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue="com/vytrack/step_definitions",
        dryRun = false,
        // TRUE will not execute cucumber code, But FALSE will execute the code!
       // tags = "@driver  and  @smoke"
        // tags = " @driver  or   @login"
        tags = "@wip"

)
 public class CukesRunner {


}