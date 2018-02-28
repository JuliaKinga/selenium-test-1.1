package org.fasttrackit.webview;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsGrid {

    @FindBy(css = ".product-name a")
    private List<WebElement> productNameConstainers;

    public List<WebElement> getProductNameConstainers() {
        return productNameConstainers;
    }
}
