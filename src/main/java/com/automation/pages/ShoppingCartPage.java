package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Esta es la pagina del carrito con el producto agregado
public class ShoppingCartPage extends BasePage {
    private By productName = By.xpath("(//a[contains(text(),\"Canon\")])[2]");
    private By unitPrice = By.xpath("//td[contains(text(),\"80\")]");
    private By totalPrice = By.xpath("(//td[contains(text(),\"240\")])[6]");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    //Con este metodo obtengo el nombre del producto a traves del elemento
    public String getProductCartName() {
        return getLocatorText(productName);
    }

    //Con este metodo obtengo el String del Precio Unitario
    public String getUnitPrice() {
        return getLocatorText(unitPrice);
    }

    public String getTotalPrice() {
        return getLocatorText(totalPrice);
    }
}
