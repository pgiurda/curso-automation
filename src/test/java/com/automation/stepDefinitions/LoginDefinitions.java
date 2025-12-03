package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class LoginDefinitions {
    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Cuando("quiere hacer login en la pagina")
    public void quiereHacerLoginEnLaPagina() {
        homePage.goToLogin();
    }
    @Y("rellena los campos para hacer login")
    public void rellenaLosCamposParaHacerLogin() {
        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @Entonces("se loguea correctamente")
    public void seLogueaCorrectamente() {
        Assert.assertTrue(myAccountPage.titleIsDisplayed(), "El titulo no es visible");
    }

}
