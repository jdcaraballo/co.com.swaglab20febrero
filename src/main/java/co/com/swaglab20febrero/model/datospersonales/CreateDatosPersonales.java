package co.com.swaglab20febrero.model.datospersonales;

public class CreateDatosPersonales {

    private final String name;
    private final String lastName;
    private final String code;

    public CreateDatosPersonales(DatosPersonalesBuilder builder) {
        this.name = builder.getName();
        this.lastName = builder.getlastName();
        this.code = builder.getCode();
    }

    public String getName() {return name;}
    public String getLastName() { return lastName;}
    public String getCode() {  return code;}


}
