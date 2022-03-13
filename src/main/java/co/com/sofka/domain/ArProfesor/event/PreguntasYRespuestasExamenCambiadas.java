package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.values.Preguntas;
import co.com.sofka.domain.ArProfesor.values.Respuestas;
import co.com.sofka.domain.generic.DomainEvent;
//TODO Meter en el eventchange
public class PreguntasYRespuestasExamenCambiadas extends DomainEvent {
    private final Preguntas preguntas;
    private final Respuestas respuestas;
    public PreguntasYRespuestasExamenCambiadas( Preguntas preguntas, Respuestas respuestas){
        super("profesor.preguntasyrespuestasexamencambiadas");
        this.preguntas=preguntas;
        this.respuestas=respuestas;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public Respuestas getRespuestas() {
        return respuestas;
    }
}
