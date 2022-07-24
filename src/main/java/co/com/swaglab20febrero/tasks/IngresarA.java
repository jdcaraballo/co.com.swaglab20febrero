package co.com.swaglab20febrero.tasks;

import co.com.swaglab20febrero.model.datospersonales.DatosPersonalesBuilder;
import co.com.swaglab20febrero.model.login.LoginBuilder;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarA {


    public static Login iniciarSesion(LoginBuilder createLogin) {
        return instrumented(Login.class, createLogin.build());
    }

    public static DatosPersonales buyDatos(DatosPersonalesBuilder createDatosPersonales){
        return instrumented(DatosPersonales.class,createDatosPersonales.build());
    }


//
//    public static Logout CerrarSesion(LogoutBuilder createLogout) {
//        return instrumented(Logout.class, createLogout.build());
//    }

//    public static Compra compra(LoginBuilder createLogin) {
//        return instrumented(Compra.class, createLogin.build());
//    }

}
