package co.com.sofka.domain.ArAlumno.values;

import co.com.sofka.domain.generic.ClaseID;
import co.com.sofka.domain.generic.ValueObject;

public class Monto implements ValueObject<Double> {

    private final String tipoMoneda;
    private final Double monto;

    public Monto(String tipoMoneda, Double monto) {
        this.tipoMoneda = tipoMoneda;
        this.monto = monto;
    }

    @Override
    public Double value() {
        return monto;
    }
}