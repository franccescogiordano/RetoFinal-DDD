package co.com.sofka.domain.ArAlumno.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Date;

public class FechaCobro implements ValueObject<Date> {

    private final Date fechaCobro;
    private final Boolean estado;

    public FechaCobro(Date fechaCobro, Boolean estado) {
        this.fechaCobro = fechaCobro;
        this.estado = estado;
    }

    @Override
    public Date value() {
        return fechaCobro;
    }
}