package org.fasttrackit.cart;

import org.fasttrackit.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest extends TestBase {
    @Test

    public void addProductToCart(){
       driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);

     driver.findElement(By.xpath("//div[@class=\"product-info\" and ./descendant::*[text()" +
             "=\"Herald Glass Vase\"]]//button[contains(@class,\"btn-cart\")]")).click();
    }

}
