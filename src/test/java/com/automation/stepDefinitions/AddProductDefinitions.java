package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.LIstProductPage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.ProductPage;
import com.automation.pages.ShoppingCartPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class AddProductDefinitions {
    private MyAccountPage myAccountPage;
    private ProductPage productPage;
    private LIstProductPage lIstProductPage;
    private ShoppingCartPage shoppingCartPage;

    public AddProductDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.productPage = new ProductPage(Hooks.getDriver());
        this.lIstProductPage = new LIstProductPage(Hooks.getDriver());
        this.shoppingCartPage = new ShoppingCartPage(Hooks.getDriver());
    }

    @Y("busca un producto")
    public void buscaUnProducto() {
        myAccountPage.goToCameras();
        lIstProductPage.goToProduct();

    }
    //Intente agregar otro paso para evitar que se agreguen mas productos de los solicitados
    @Y("lo agrega al carrito")
    public void loAgregaAlCarrito() {
        productPage.addProductToCart();
    }

    @Entonces("se verifica que el producto se haya agregado correctamente")
    public void seVerificaQueElProductoSeHayaAgregadoCorrectamente() {
        Assert.assertEquals(shoppingCartPage.getProductCartName(),"Canon EOS 5D","El producto no coincide");
        Assert.assertEquals(shoppingCartPage.getUnitPrice(),"$80.00", "El precio unitario no coincide");
        Assert.assertEquals(shoppingCartPage.getTotalPrice(),"$240.00","El precio total no coincide");
    }


    @Y("se continua con la compra")
    public void seContinuaConLaCompra() {
        productPage.goToContinueShopping();
    }
}
