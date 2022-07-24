package co.com.swaglab20febrero.tasks;

import co.com.swaglab20febrero.interactions.esperas.Esperar;
import co.com.swaglab20febrero.model.datospersonales.CreateDatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.swaglab20febrero.userinterface.DatosPersonalesUser.*;

public class DatosPersonales implements Task {

    private CreateDatosPersonales createDatosPersonales;

    public DatosPersonales(CreateDatosPersonales createDatosPersonales) {
        this.createDatosPersonales = createDatosPersonales;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOX_NAME),
                Enter.theValue(createDatosPersonales.getName()).into(BOX_NAME),
                Click.on(BOX_LASTNAME),
                Enter.theValue(createDatosPersonales.getLastName()).into(BOX_LASTNAME),
                Click.on(BOX_CODE),
                Enter.theValue(createDatosPersonales.getCode()).into(BOX_CODE),
                Click.on(BOX_CONTINUAR),
                Click.on(BTN_TERMINAR_COMPRA),
                Esperar.unTiempo(2000)

        );
    }


}
