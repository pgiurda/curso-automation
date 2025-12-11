package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LIstProductPage extends BasePage {
    private By cameraProductBtn = By.xpath("//h4/a[contains(text(),\"Canon\")]");

    public LIstProductPage(WebDriver driver) {
        super(driver);
    }

    public void goToProduct() {
        click(cameraProductBtn);
    }
}
