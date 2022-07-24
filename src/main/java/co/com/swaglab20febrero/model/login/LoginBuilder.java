package co.com.swaglab20febrero.model.login;

import java.util.List;
import java.util.Map;

public class LoginBuilder {

    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public static LoginBuilder con() {
        return new LoginBuilder();
    }

    public LoginBuilder usuario (List<Map<String, String>> datos) {
        this.usuario = datos.get(0).get("usuario");
        return this;
    }

    public LoginBuilder clave (List<Map<String, String>> datos) {
        this.clave = datos.get(0).get("clave");
        return this;
    }

    public CreateLogin build() {
        return new CreateLogin(this);
    }



}
