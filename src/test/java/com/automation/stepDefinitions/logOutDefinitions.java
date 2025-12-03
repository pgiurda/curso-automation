package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.HomePage;
import com.automation.pages.LogoutPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class logOutDefinitions {
    private HomePage homePage;
    private LogoutPage logoutPage;

    public logOutDefinitions(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.logoutPage = new LogoutPage(Hooks.getDriver());
    }
    @Y("vuelve al dropdown para desloguearse")
    public void vuelveAlDropdownParaDesloguearse() {
        homePage.goToLogout();
    }

    @Entonces("se realiza el logout correctamente")
    public void seRealizaElLogoutCorrectamente() {
        Assert.assertTrue(logoutPage.logoutTitleisDisplayed(),"No se desloguea correctamente");
    }

    @Y("regresa la home presionando el button")
    public void regresaLaHomePresionandoElButton() {
       logoutPage.goToContinueBtn();
    }
}
