package org.fasttrackit.cart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    @Test

    public void addProductToCart(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrive\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");

     driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);

     driver.findElement(By.xpath("//div[@class=\"product-info\" and ./descendant::*[text()" +
             "=\"Herald Glass Vase\"]]//button[contains(@class,\"btn-cart\")]")).click();
    }
    @Test
    public void specialPriceDisplayedAfterSimpleSearch(){

            System.setProperty("webdriver.chrome.driver", "C:\\webdrive\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);

        driver.findElement(By.xpath("//p[@class='special-price']//span[@class='price'])")).getText();


}}
