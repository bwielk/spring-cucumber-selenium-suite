package com.springcucumberselenium.bdd.cucumber.steps;

import com.springcucumberselenium.bdd.pages.HomePage;
import com.springcucumberselenium.bdd.pages.UserPortalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;

public class LoginSteps {

    @Autowired
    @Lazy
    private HomePage homePage;
    @Autowired
    @Lazy
    private UserPortalPage userPortalPage;

    @Given("the login page is open")
    public void  theLoginPageIsOpen(){
        homePage.openLoginPage();
    }

    @Given("a user has entered a wrong username {}")
    public void userEnteredAWrongUsername(String wrongUsername){
        homePage.fillUsernameInput(wrongUsername);
    }

    @And("the user has entered an invalid password {}")
    public void userEnteredAWrongPassword(String wrongPassword){
        homePage.fillPasswordInput(wrongPassword);
    }

    @When("the user hits the submit button")
    public void submitButtonHit(){
        homePage.clickLogInButton();
    }

    @Then("the user sees an error")
    public void userSeesError(){
        homePage.invalidLoginDataErrorDisplayed();
    }

    @And("the user is not logged in")
    public void userNotLoggedIn(){
        userPortalPage.checkUserIsNotLoggedIn();
    }

    @Given("a user has entered a valid username")
    public void userHasEnteredTheCorrectUsername(){
        homePage.fillUsernameInput(System.getProperty("username"));
    }

    @And("the user has entered a valid password")
    public void userHasEnteredTheCorrectPassword(){
        homePage.fillPasswordInput(System.getProperty("password"));
    }

    @Then("the user is logged in")
    public void userHasLoggedIn(){
        userPortalPage.checkUserIsLoggedIn();
    }

    @And("the user sees the user panel")
    public void userSeesTheUserPanel(){
        userPortalPage.checkUserPanelIsDisplayed();
    }
}
