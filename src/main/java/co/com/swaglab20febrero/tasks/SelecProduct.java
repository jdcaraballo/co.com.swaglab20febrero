package co.com.swaglab20febrero.tasks;

import co.com.swaglab20febrero.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.swaglab20febrero.userinterface.SelecProductUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelecProduct implements Task {

    private String nombreProducto;

    public SelecProduct(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Name (Z to A)").from(LIST_FILTRER),
                Esperar.unTiempo(3000)
        );
        actor.attemptsTo(
                Click.on(SELEC_SHIRT),
                Click.on(ADD_CART),
                Esperar.unTiempo(3000)

        );

    }
    public static SelecProduct enPagina(String nombreProducto) {
        return instrumented(SelecProduct.class,nombreProducto);}
}
