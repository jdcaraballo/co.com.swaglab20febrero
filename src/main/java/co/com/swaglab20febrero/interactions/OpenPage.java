package co.com.swaglab20febrero.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    public static OpenPage enPagina(){
        return instrumented(OpenPage.class);
    }
}
