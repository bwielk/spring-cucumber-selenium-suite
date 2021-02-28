package com.springcucumberselenium.bdd.browserActions;

import com.springcucumberselenium.bdd.waits.Waits;
import static com.springcucumberselenium.bdd.commons.WebDriverElement.getElementByCssSelector;

public class ClickableActions {

    public static void clickElement(String cssSelector){
        Waits.waitUntilElementClickable(cssSelector);
        getElementByCssSelector(cssSelector).click();
    }
}
