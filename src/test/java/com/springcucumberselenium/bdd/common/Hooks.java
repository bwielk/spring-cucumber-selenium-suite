package com.springcucumberselenium.bdd.common;

import com.springcucumberselenium.bdd.commons.WebDriverComponent;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

//extraGlue param in Spring test declarations points to commons where Hooks live therefore the class is loaded

public class Hooks{

        private boolean runBegun=false;

        @Before
        public void launchBrowser(Scenario scenario){
                String methodName = scenario.getName();
                if(!runBegun){
                        System.out.println("-------------------The suite is starting-------------------");
                        runBegun=true;
                }
                System.out.println("Running test: " + methodName);
                WebDriverComponent.launchBrowser(methodName);
        }

        @After
        public void closeBrowser(Scenario scenario){
                System.out.println("-------------------The webdriver is closing-------------------");
                if(!scenario.isFailed()){
                        System.out.println(String.format("\n\n\nTest '%s' has successfully PASSED", scenario.getName()));
                }else{
                        System.out.println(String.format("\n\n\nTest '%s' has FAILED", scenario.getName()));
                }
                WebDriverComponent.quitDriver();
        }
}
