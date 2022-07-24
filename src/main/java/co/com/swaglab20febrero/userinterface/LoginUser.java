package co.com.swaglab20febrero.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUser {
    public static final Target BOX_USER=Target.the("Caja pra USER").located(By.id("user-name"));
    public static final Target BOX_PASS=Target.the("Caja pra PASS").located(By.id("password"));
    public static final Target BTN_LOGIN=Target.the("BOTON LOGIN").located(By.id("login-button"));

}
