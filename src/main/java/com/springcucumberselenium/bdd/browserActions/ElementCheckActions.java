package com.springcucumberselenium.bdd.browserActions;

import com.springcucumberselenium.bdd.waits.Waits;
import org.openqa.selenium.TimeoutException;

import static com.springcucumberselenium.bdd.commons.WebDriverElement.getElementByCssSelector;

public class ElementCheckActions {

    public static void checkTextDisplayed(String cssSelector, String textToCheck){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).getText().contains(textToCheck);
    }

    public static void checkElementNotDisplayed(String cssSelector){
        try{
            Waits.waitUntilElementVisible(cssSelector);
        }catch (TimeoutException e){
            assert true;
        }
    }

    public static void checkElementDisplayed(String cssSelector){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).isDisplayed();
    }
}
