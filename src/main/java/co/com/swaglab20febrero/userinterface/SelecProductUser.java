package co.com.swaglab20febrero.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelecProductUser {
    public static final Target LIST_FILTRER=Target.the("Lista para ordenar productos").locatedBy("//*[@class='product_sort_container']");


    public static final Target SELEC_SHIRT=Target.the("Seleccionar Sauce Labs Bolt T-Shirt").locatedBy("//*[contains(text(),'Sauce Labs Bolt T-Shirt')]");
    public static final Target ADD_CART=Target.the("Seleccionar Sauce Labs Bolt T-Shirt").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));


}
