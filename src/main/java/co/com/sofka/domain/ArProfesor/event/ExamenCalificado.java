package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.generics.Calificacion;
import co.com.sofka.domain.generic.DomainEvent;
//TODO Meter en el eventchange
public class ExamenCalificado extends DomainEvent {
    private final Calificacion calificacion;
    public ExamenCalificado(Calificacion calificacion){
        super("profesor.examencalificado");
        this.calificacion=calificacion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
