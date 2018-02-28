package org.fasttrackit.search;

import org.fasttrackit.AppConfig;
import org.fasttrackit.TestBase;
import org.fasttrackit.webview.Header;
import org.fasttrackit.webview.ProductsGrid;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.KeysRelatedAction;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleSearchTest extends TestBase{
    @Test

    public void simpleSearchWithOneKeyword(){

        String keyword = "vase";

        Header header = PageFactory.initElements(driver, Header.class);

     header.getSearchField().sendKeys(keyword + Keys.ENTER);
        System.out.println("Pressed Enter in search field.");

        ProductsGrid productsGrid = PageFactory.initElements(driver, ProductsGrid.class);

        System.out.println("Found" + productsGrid.getProductNameConstainers().size() + "product names");

        for (WebElement nameContainer : productsGrid.getProductNameConstainers()) {
            assertThat("Some of the products names do not contain the searched keyword", nameContainer.getText(),
                    containsString(keyword.toUpperCase()));}

        List<WebElement>swatchLink = driver.findElements(By.cssSelector(".swatch-link[title ='black']"));
        System.out.println("Changed color.");}

    @Test
    public void specialPriceDisplayedAfterSimpleSearch(){

        driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);

        driver.findElement(By.xpath("//p[@class='special-price']//span[@class='price'])")).getText();


    }}



