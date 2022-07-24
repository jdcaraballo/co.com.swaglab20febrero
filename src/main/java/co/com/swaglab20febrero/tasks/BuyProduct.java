package co.com.swaglab20febrero.tasks;

import co.com.swaglab20febrero.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.swaglab20febrero.userinterface.BuyProductUser.BTN_CART;
import static co.com.swaglab20febrero.userinterface.BuyProductUser.BTN_CHECKOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART),
                Click.on(BTN_CHECKOUT),
                Esperar.unTiempo(2000)
        );
    }
        public static BuyProduct enPagina() {
        return instrumented(BuyProduct.class);}
}
