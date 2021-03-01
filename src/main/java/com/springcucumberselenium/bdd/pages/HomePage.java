package com.springcucumberselenium.bdd.pages;

import com.springcucumberselenium.bdd.browserActions.ClickableActions;
import com.springcucumberselenium.bdd.browserActions.ElementCheckActions;
import com.springcucumberselenium.bdd.browserActions.TextFieldActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static com.springcucumberselenium.bdd.commons.WebDriverComponent.getDriver;
import static com.springcucumberselenium.bdd.selectors.HomePageLocators.*;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;



@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class HomePage {

    @Autowired
    private UserPortalPage userPortalPage;

    public HomePage openLoginPage(){
        getDriver().get("https://secure-sandbox.modulrfinance.com/");
        return this;
    }

    public HomePage fillUsernameInput(String content){
        TextFieldActions.fillTextWithContent(USERNAME_INPUT, content);
        return this;
    }

    public HomePage fillPasswordInput(String content) {
        TextFieldActions.fillTextWithContent(PASSWORD_INPUT, content);
        return this;
    }

    public HomePage invalidLoginDataErrorDisplayed(){
        ElementCheckActions.checkElementDisplayed(LOGIN_ERROR);
        ElementCheckActions.checkTextDisplayed(LOGIN_ERROR, "The username or password is incorrect.");
        return this;
    }

    public HomePage clickLogInButton(){
        ClickableActions.clickElement(SUBMIT_BUTTON);
        return this;
    }
}
