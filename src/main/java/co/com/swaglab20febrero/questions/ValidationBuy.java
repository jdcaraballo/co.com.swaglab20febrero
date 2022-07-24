package co.com.swaglab20febrero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.swaglab20febrero.userinterface.ValidactionBuyUser.VAL_BUY;

public class ValidationBuy implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_BUY.resolveFor(actor).isVisible())
            return true;
            return false;
           }
    public static ValidationBuy validationCompra(){
        return new ValidationBuy();
   }
}
