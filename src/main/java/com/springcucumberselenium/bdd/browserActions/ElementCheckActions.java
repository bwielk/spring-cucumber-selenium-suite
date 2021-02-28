package com.springcucumberselenium.bdd.browserActions;

import com.springcucumberselenium.bdd.waits.Waits;

import static com.springcucumberselenium.bdd.commons.WebDriverElement.getElementByCssSelector;

public class ElementCheckActions {

    public static void checkTextDisplayed(String cssSelector, String textToCheck){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).getText().contains(textToCheck);
    }

    public static void checkElementNotDisplayed(String cssSelector){
        assert !getElementByCssSelector(cssSelector).isDisplayed();
    }

    public static void checkElementDisplayed(String cssSelector){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).isDisplayed();
    }
}
