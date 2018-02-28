package org.fasttrackit.webview;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {
    @FindBy(id = "search")
    private WebElement searchField;

    public WebElement getSearchField() {
        return searchField;
    }
}
