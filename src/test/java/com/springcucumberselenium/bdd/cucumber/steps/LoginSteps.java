package com.springcucumberselenium.bdd.cucumber.steps;

import com.springcucumberselenium.bdd.pages.HomePage;
import com.springcucumberselenium.bdd.pages.UserPortalPage;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;


public class LoginSteps {

    @Autowired
    @Lazy
    private HomePage homePage;
    @Autowired
    @Lazy
    private UserPortalPage userPortalPage;

    @Given("the login page is open$")
    public void  theLoginPageIsOpen(){
        homePage.openLoginPage();
    }

    @Given("a user has entered a wrong username \\\"([^\\\"]*)\\\"$")
    public void userEnteredAWrongUsername(String wrongUsername){
        homePage.fillUsernameInput(wrongUsername);
    }

    @And("the user has entered an invalid password \\\"([^\\\"]*)\\\"$")
    public void userEnteredAWrongPassword(String wrongPassword){
        homePage.fillPasswordInput(wrongPassword);
    }

    @When("the user hits the submit button$")
    public void submitButtonHit(){
        homePage.clickLogInButton();
    }

    @Then("the user sees an error$")
    public void userSeesError(){
        homePage.invalidLoginDataErrorDisplayed();
    }

    @And("the user is not logged in$")
    public void userNotLoggedIn(){
        userPortalPage.checkUserIsNotLoggedIn();
    }

}
