package com.springcucumberselenium.bdd.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.springcucumberselenium.bdd.commons.WebDriverComponent.getDriver;

public class WebDriverElement {

    public static WebElement getElementByCssSelector(String cssSelector){
        return getDriver().findElement(By.cssSelector(cssSelector));
    }
}
