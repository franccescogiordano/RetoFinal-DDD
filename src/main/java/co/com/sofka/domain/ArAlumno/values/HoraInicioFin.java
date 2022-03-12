package co.com.sofka.domain.ArAlumno.values;

import co.com.sofka.domain.generic.ValueObject;

public class HoraInicioFin implements ValueObject<String> {

    private final String horaInicio;
    private final String horaFin;

    public HoraInicioFin(String horaInicio,String horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;

    }

    @Override
    public String value() {
        return horaInicio+" "+horaFin;
    }
}
