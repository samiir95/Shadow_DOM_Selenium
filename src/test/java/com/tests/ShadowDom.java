package com.tests;

import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ShadowDom {

    private WebDriver driver;

    @Test
    public void simpleVerification_Using_Shadow_DOM_Test() {
        driver = new EdgeDriver();

        driver.get("http://watir.com/examples/shadow_dom.html");

        Shadow shadow = new Shadow(driver);
        WebElement shadowContent = shadow.findElement("#shadow_host").getShadowRoot().findElement(By.cssSelector("#shadow_content"));

        Assert.assertEquals(shadowContent.getText(), "some text");

        driver.quit();

    }
}

