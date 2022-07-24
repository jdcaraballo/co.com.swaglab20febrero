package co.com.swaglab20febrero.stepdefinitions.login;

import co.com.swaglab20febrero.interactions.OpenPage;
import co.com.swaglab20febrero.model.login.LoginBuilder;
import co.com.swaglab20febrero.questions.ValidationLogin;
import co.com.swaglab20febrero.tasks.IngresarA;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static co.com.swaglab20febrero.userinterface.ValidationLoginUser.VAL_LOGIN;

public class LoginStep {

    @Given("^que (.*) abre la pagina$")
    public void queDavidAbreLaPagina(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenPage.enPagina());
    }


    @When("^el inicia sesión con los siguientes datos$")
    public void elIniciaSesiónConLosSiguientesDatos(List<Map<String, String>> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarA.iniciarSesion(LoginBuilder.con()
                        .usuario(datos)
                        .clave(datos))
        );

    }

    @Then("^se verá mensaje de LOGIN OK$")
    public void seVeráMensajeDeLOGINOK() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLogin.validationLogin())
        );

    }
}
