package co.com.sofka.domain.ArAlumno.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoBeca implements ValueObject<String> {

    private final String tipoBeca;

    public TipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;

    }

    @Override
    public String value() {
        return tipoBeca;
    }
}
