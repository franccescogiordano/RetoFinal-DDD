package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Calificacion;

public class CalificacionNotaAgregada extends DomainEvent{
    private final Calificacion calificacion;

    public CalificacionNotaAgregada(Calificacion calificacion) {
        super("aralumno.event.calificacionnotaagregada");
        this.calificacion = calificacion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

}
