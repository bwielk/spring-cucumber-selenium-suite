package com.springcucumberselenium.bdd.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/login",
        plugin = {"pretty", "json:target/cucumber.json"},
        extraGlue = "com.springcucumberselenium.bdd.common")
public class LoginStepsIntegrationTests {
}
