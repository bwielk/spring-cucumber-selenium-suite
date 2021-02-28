package com.springcucumberselenium.bdd.pages;

import com.springcucumberselenium.bdd.browserActions.ElementCheckActions;
import org.springframework.stereotype.Component;
import static com.springcucumberselenium.bdd.selectors.UserPortaSelectors.USER_LINK;

@Component
public class UserPortalPage {

    public UserPortalPage checkUserIsNotLoggedIn(){
        ElementCheckActions.checkElementNotDisplayed(USER_LINK);
        return this;
    }
}
