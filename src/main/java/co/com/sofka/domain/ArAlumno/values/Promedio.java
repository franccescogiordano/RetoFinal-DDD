package co.com.sofka.domain.ArAlumno.values;

import co.com.sofka.domain.generic.ValueObject;

public class Promedio implements ValueObject<Double> {

    private final Double promedio;

    public Promedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public Double value() {
        return promedio;
    }
}
