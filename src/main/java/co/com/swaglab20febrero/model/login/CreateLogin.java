package co.com.swaglab20febrero.model.login;

public class CreateLogin {

    private final String usuario;
    private final String clave;

    public CreateLogin(LoginBuilder builder) {
        this.usuario = builder.getUsuario();
        this.clave = builder.getClave();

    }

    public String getUsuario() {return usuario;}

    public String getClave() {return clave;}
}
