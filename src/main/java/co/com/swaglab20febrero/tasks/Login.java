package co.com.swaglab20febrero.tasks;

import co.com.swaglab20febrero.interactions.esperas.Esperar;
import co.com.swaglab20febrero.model.login.CreateLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.swaglab20febrero.userinterface.LoginUser.*;

public class Login implements Task {

    private CreateLogin createLogin;

    public Login (CreateLogin createLogin){
        this.createLogin = createLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOX_USER),
                Enter.theValue(createLogin.getUsuario()).into(BOX_USER),
                Click.on(BOX_PASS),
                Enter.theValue(createLogin.getClave()).into(BOX_PASS),
                Click.on(BTN_LOGIN),
                Esperar.unTiempo(2000)

        );
    }
}
