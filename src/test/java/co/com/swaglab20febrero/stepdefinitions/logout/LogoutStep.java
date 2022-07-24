package co.com.swaglab20febrero.stepdefinitions.logout;

import co.com.swaglab20febrero.interactions.OpenPage;
import co.com.swaglab20febrero.model.login.LoginBuilder;
import co.com.swaglab20febrero.questions.ValidationLogin;
import co.com.swaglab20febrero.questions.ValidationLogout;
import co.com.swaglab20febrero.tasks.IngresarA;
import co.com.swaglab20febrero.tasks.Logout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class LogoutStep {

    @Given("^que David abre la pagina e inicia Sesion con los siguientes datos$")
    public void queDavidAbreLaPagina(List<Map<String, String>>datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenPage.enPagina());
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarA.iniciarSesion(LoginBuilder.con()
                .usuario(datos)
                .clave(datos)));
    }

    @When("^el cierrra sesión$")
    public void elCierrraSesión() {
       OnStage.theActorInTheSpotlight().attemptsTo(
               Logout.cerrarSesion()
       );


    }

    @Then("^se verá mensaje de LOGOUT OK$")
    public void seVeráMensajeDeLOGOUTOK() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLogout.cerrarSesion()));

    }
}
