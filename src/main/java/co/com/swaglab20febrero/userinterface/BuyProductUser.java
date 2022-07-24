package co.com.swaglab20febrero.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyProductUser {
    public static final Target BTN_CART=Target.the("Boton ir al cart").locatedBy("//*[@class='shopping_cart_badge']");
    public static final Target BTN_CHECKOUT=Target.the("Boton ir a pagar").located(By.id("checkout"));
}
