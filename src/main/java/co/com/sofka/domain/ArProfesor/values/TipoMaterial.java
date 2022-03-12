package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoMaterial implements ValueObject<String> {

    private final String tipoMaterial;

    public TipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;

    }

    @Override
    public String value() {
        return tipoMaterial;
    }
}
