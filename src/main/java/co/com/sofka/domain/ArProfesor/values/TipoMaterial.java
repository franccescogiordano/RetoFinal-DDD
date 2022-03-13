package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoMaterial implements ValueObject<String> {

    private final String tipoMaterial;

    public TipoMaterial(String tipoMaterial) {
        this.tipoMaterial = Objects.requireNonNull(tipoMaterial);
        if (this.tipoMaterial.isBlank()) {
            throw new IllegalArgumentException("EL tipoMaterial no puede estar vacio");
        }


    }

    @Override
    public String value() {
        return tipoMaterial;
    }
}
