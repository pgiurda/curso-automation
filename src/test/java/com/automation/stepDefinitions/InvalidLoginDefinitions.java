package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class InvalidLoginDefinitions {
    private LoginPage loginPage;

    public InvalidLoginDefinitions(){
        this.loginPage = new LoginPage(Hooks.getDriver());
    }
    @Entonces("no se loguea correctamente")
    public void noSeLogueaCorrectamente() {
        Assert.assertTrue(loginPage.errorMessageIsDisplayed(), "Mensaje de error no visible");
    }

    @Y("rellena los campos con datos invalidos para hacer login")
    public void rellenaLosCamposConDatosInvalidosParaHacerLogin() {
        loginPage.login("pepito1@hotmail.com","123456");
    }
}
