package co.com.swaglab20febrero.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationLogoutUser {
    public static final Target VAL_LOGOUT =Target.the("VAlidación de cierrre de sesion").locatedBy("//div[@class='login_password']");
}
