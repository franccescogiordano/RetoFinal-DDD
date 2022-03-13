package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.values.Preguntas;
import co.com.sofka.domain.generic.DomainEvent;
//TODO Meter en el eventchange
public class PreguntasExamenCambiadas  extends DomainEvent {
    private final Preguntas preguntas;
    public PreguntasExamenCambiadas(Preguntas preguntas){
        super("arprofesor.event.preguntasexamencambiadas");
        this.preguntas=preguntas;
    }
    public Preguntas getPreguntas() {
        return preguntas;
    }
}
