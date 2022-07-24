package co.com.swaglab20febrero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.swaglab20febrero.userinterface.ValidationLogoutUser.VAL_LOGOUT;

public class ValidationLogout implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_LOGOUT.resolveFor(actor).isVisible())
            return true;
            return false;
         }
     public static ValidationLogout cerrarSesion(){
        return new ValidationLogout();
     }
}
