package co.com.swaglab20febrero.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPersonalesUser {
    public static final Target BOX_NAME=Target.the("Caja pra nombre").located(By.id("first-name"));
    public static final Target BOX_LASTNAME=Target.the("Caja para Apellido").located(By.id("last-name"));
    public static final Target BOX_CODE=Target.the("Caja para CODE").located(By.id("postal-code"));
    public static final Target BOX_CONTINUAR=Target.the("Caja para CONTINUAR").located(By.id("continue"));
    public static final Target BTN_TERMINAR_COMPRA=Target.the("BOton terminar COmpra").located(By.id("finish"));

}
