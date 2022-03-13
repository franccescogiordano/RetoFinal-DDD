package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.Beca;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.AlumnoID;

public class BecaOtorgada extends DomainEvent {
    private final AlumnoID alumnoID;
    private final Beca beca;

    public BecaOtorgada(AlumnoID alumnoID, Beca beca) {
        super("aralumno.event.becaotorgada");
        this.alumnoID = alumnoID;
        this.beca = beca;
    }

    public Beca getBeca() {
        return beca;
    }

    public AlumnoID getAlumnoID() {
        return alumnoID;
    }
}
