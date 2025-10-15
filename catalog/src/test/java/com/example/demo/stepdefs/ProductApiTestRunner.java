package com.example.demo.stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features="src/test/resources/features",
    glue={"com.example.demo.stepdefs"},
     plugin = {"pretty", "html:target/cucumber-report.html"},
     monochrome = true
)
public class ProductApiTestRunner extends AbstractTestNGCucumberTests {

   
}
