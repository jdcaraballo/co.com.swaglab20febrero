package co.com.swaglab20febrero.tasks;

import co.com.swaglab20febrero.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.swaglab20febrero.userinterface.LogoutUser.BTN_LOGOUT;
import static co.com.swaglab20febrero.userinterface.LogoutUser.LBL_GO_LOGOUT;

public class Logout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_GO_LOGOUT),
                Click.on(BTN_LOGOUT),
                Esperar.unTiempo(5000)
        );
    }
    public static Logout cerrarSesion(){
        return new Logout();
    }
}
