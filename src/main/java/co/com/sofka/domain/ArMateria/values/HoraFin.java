package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

public class HoraFin implements ValueObject<String> {

    private final String horafin;

    public HoraFin(String horafin) {
        this.horafin = horafin;

    }

    @Override
    public String value() {
        return horafin;
    }
}
