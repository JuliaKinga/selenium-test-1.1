package org.fasttrackit.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.KeysRelatedAction;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleSearchTest {
    @Test

    public void simpleSearchWithOneKeyword(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrive\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        String keyword = "vase";

     driver.findElement(By.id("search")).sendKeys(keyword + Keys.ENTER);
        System.out.println("Pressed Enter in search field.");

        List<WebElement> productNames = driver.findElements(By.cssSelector(".product-name a"));
        System.out.println("Found" + productNames.size() + "product names");

        for (WebElement nameContainer : productNames) {
            assertThat("Some of the products names do not contain the searched keyword", nameContainer.getText(),
                    containsString(keyword.toUpperCase()));
        }
        List<WebElement>swatchLink = driver.findElements(By.cssSelector(".swatch-link[title ='black']"));
        System.out.println("Changed color.");



        }
    }

    }

