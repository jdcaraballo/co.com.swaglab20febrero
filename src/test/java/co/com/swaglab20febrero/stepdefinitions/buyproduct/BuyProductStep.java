package co.com.swaglab20febrero.stepdefinitions.buyproduct;

import co.com.swaglab20febrero.interactions.OpenPage;
import co.com.swaglab20febrero.model.datospersonales.DatosPersonalesBuilder;
import co.com.swaglab20febrero.model.login.LoginBuilder;
import co.com.swaglab20febrero.questions.ValidationBuy;
import co.com.swaglab20febrero.tasks.BuyProduct;
import co.com.swaglab20febrero.tasks.IngresarA;
import co.com.swaglab20febrero.tasks.SelecProduct;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class BuyProductStep {


    @Given("^que el inicia sesion con los datos$")
    public void queElIniciaSesion(List<Map<String, String>>datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenPage.enPagina());
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarA.iniciarSesion(LoginBuilder.con()
                        .usuario(datos)
                        .clave(datos))
        );
    }

    @When("^el compra el producto (.*)$")
    public void elCompraElProducto(String nombreProducto, List<Map<String, String>>datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelecProduct.enPagina(nombreProducto)
                );
                OnStage.theActorInTheSpotlight().attemptsTo(
                        BuyProduct.enPagina()
                );
                OnStage.theActorInTheSpotlight().attemptsTo(
                        IngresarA.buyDatos(DatosPersonalesBuilder.con()
                                .name(datos)
                                .lastName(datos)
                                .code(datos))
                );
    }

    @Then("^se vera mensaje de compra exitosa$")
    public void seVeraMensajeDeCompraExitosa() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationBuy.validationCompra()));

    }
}
