package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.KeysRelatedAction;

public class SimpleSearchTest {
    @Test

    public void SimpleSearchWithOneKeyword(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrive\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");

     driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);

    }

}
