package com.automation.pages;

import org.openqa.selenium.By;

public class CamerasPage {
    private By cameraProductBtn = By.xpath("//a[text()=\"Canon EOS 5D\"]");
    private By inputCantProducto = By.id("input-quantity");
    private By addToCardBtn = By.id("button-cart");
    private By selectOption = By.id("input-option226");
    private By colorOptionRed = By.xpath("//option[@value=\"15\"]");
    private By cartBtn = By.xpath("//button[@type=\"button\" and @data-toggle=\"dropdown\"]");
}
