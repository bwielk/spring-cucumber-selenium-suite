package com.springcucumberselenium.bdd.pages;

import com.springcucumberselenium.bdd.browserActions.ElementCheckActions;
import org.springframework.stereotype.Component;
import static com.springcucumberselenium.bdd.selectors.UserPortaSelectors.USER_LINK;
import static com.springcucumberselenium.bdd.selectors.HomePageLocators.*;

//investigate this
import org.springframework.context.annotation.Scope;

import static com.springcucumberselenium.bdd.selectors.UserPortaSelectors.USER_PORTAL_VIEW;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

//@Scope(SCOPE_CUCUMBER_GLUE)
@Component

public class UserPortalPage {

    public UserPortalPage checkUserIsNotLoggedIn(){
        ElementCheckActions.checkElementNotDisplayed(USER_LINK);
        ElementCheckActions.checkElementDisplayed(SUBMIT_BUTTON);
        return this;
    }

    public UserPortalPage checkUserIsLoggedIn(){
        ElementCheckActions.checkElementNotDisplayed(SUBMIT_BUTTON);
        ElementCheckActions.checkElementDisplayed(USER_LINK);
        return this;
    }

    public UserPortalPage checkUserPanelIsDisplayed(){
        ElementCheckActions.checkElementDisplayed(USER_PORTAL_VIEW);
        return this;
    }
}
