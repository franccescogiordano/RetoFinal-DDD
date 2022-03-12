package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Date;

public class FechaDevolucion implements ValueObject<Date> {

    private final Date fechaEntrega;
    private final Date fechaDevolucion;
    private final boolean devuelto;
    public FechaDevolucion(Date fechaEntrega,Date fechaDevolucion,boolean devuelto) {
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;

    }

    @Override
    public Date value() {
        return fechaDevolucion;
    }
}
