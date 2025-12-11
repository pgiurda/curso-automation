package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CreateInvalidAccount {
    private CreateAccountPage createAccountPage;

    public CreateInvalidAccount() {
        this.createAccountPage = new CreateAccountPage(Hooks.getDriver());
    }

    @Cuando("el usuario no completa el formulario")
    public void elUsuarioNoCompletaElFormulario() {
        createAccountPage.invalidRegister("wrong_email@gmail.com", "aaa123");
    }

    @Entonces("se verifica que la cuenta no se creo correctamente")
    public void seVerificaQueLaCuentaNoSeCreoCorrectamente() {
        Assert.assertTrue(createAccountPage.textIncompletedFieldIsDisplayed(), "Se permite no completar estos campos");
    }
}
