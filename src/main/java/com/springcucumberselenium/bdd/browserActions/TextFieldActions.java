package com.springcucumberselenium.bdd.browserActions;

import com.springcucumberselenium.bdd.waits.Waits;

import static com.springcucumberselenium.bdd.commons.WebDriverElement.getElementByCssSelector;

public class TextFieldActions {

    public static void fillTextWithContent(String cssSelector, String textToEnter){
        Waits.waitUntilElementVisible(cssSelector);
        getElementByCssSelector(cssSelector).sendKeys(textToEnter);
    }
}
