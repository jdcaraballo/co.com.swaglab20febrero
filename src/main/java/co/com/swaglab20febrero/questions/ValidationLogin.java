package co.com.swaglab20febrero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.swaglab20febrero.userinterface.ValidationLoginUser.VAL_LOGIN;

public class ValidationLogin implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(VAL_LOGIN).viewedBy(actor).asBoolean();
    }

    public static ValidationLogin validationLogin(){
        return new ValidationLogin();
    }
}
