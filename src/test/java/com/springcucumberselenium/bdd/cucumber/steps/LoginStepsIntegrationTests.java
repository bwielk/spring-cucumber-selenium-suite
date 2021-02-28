package com.springcucumberselenium.bdd.cucumber.steps;


import com.springcucumberselenium.bdd.BddApplication;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@SpringBootTest(classes = { BddApplication.class,
        LoginStepsIntegrationTests.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
    )
@CucumberOptions(features = "src/test/resources/login",
        plugin = {"pretty", "json:target/cucumber.json"})
public class LoginStepsIntegrationTests {
}
