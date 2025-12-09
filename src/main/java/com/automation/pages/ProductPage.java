package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Esta es la pàgina del producto, en este caso, camara CANON
public class ProductPage extends BasePage{
    ;
    private By inputCantProducto = By.id("input-quantity");
    private By addToCardBtn = By.id("button-cart");
    private By selectOption = By.id("input-option226");
    private By colorOptionRed = By.xpath("//option[@value=\"15\"]");
    private By cartBtn = By.xpath("//button[@class=\"btn btn-inverse btn-block btn-lg dropdown-toggle\"]");
    private By viewCartBtn = By.xpath("//a/strong[text()=\" View Cart\"]");
    private By removeProductBtn = By.xpath("//button[@title=\"Remove\"]");
    private By continueShoppingBtn = By.xpath("//a[contains(text(),\"Continue\")]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void addProductToCart(){
        click(selectOption);
        click(colorOptionRed);
        //En esta parte del codigo, tuve que borrar los productos del carrito que se agregaban antes de hacer click en "Add to Cart"
        click(cartBtn);
        click(removeProductBtn);
        //-------------------------------------
        clear(inputCantProducto);
        sendKeys(inputCantProducto, "3");
        click(addToCardBtn);
        click(cartBtn);
        click(viewCartBtn);
    }
    public void goToContinueShopping(){
        click(continueShoppingBtn);
    }
}
