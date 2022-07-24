package co.com.swaglab20febrero.model.datospersonales;

import java.util.List;
import java.util.Map;

public class DatosPersonalesBuilder {

    private String name;
    private String lastName;
    private String code;

    public String getName() {
        return name;
    }
    public String getlastName() {
        return lastName;
    }
    public String getCode() {return code; }

    public static DatosPersonalesBuilder con() {
        return new DatosPersonalesBuilder();
    }

    public DatosPersonalesBuilder name (List<Map<String, String>> datos) {
        this.name = datos.get(0).get("name");
        return this; }

    public DatosPersonalesBuilder lastName (List<Map<String, String>> datos) {
        this.lastName = datos.get(0).get("lastName");
        return this;}

    public DatosPersonalesBuilder code (List<Map<String, String>> datos) {
        this.code = datos.get(0).get("code");
        return this; }

    public CreateDatosPersonales build() {
        return new CreateDatosPersonales(this);
    }



}
