package co.com.swaglab20febrero.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogoutUser {

    public static final Target LBL_GO_LOGOUT=Target.the("Lista MEnu para logout").located(By.id("react-burger-menu-btn"));
    public static final Target BTN_LOGOUT=Target.the("Boton para logout").located(By.id("logout_sidebar_link"));
}
