package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.values.Preguntas;
import co.com.sofka.domain.ArProfesor.values.Respuestas;
import co.com.sofka.domain.generic.DomainEvent;
//TODO Meter en el eventchange
public class RespuestaExamenCambiadas extends DomainEvent {
    private final Respuestas respuestas;
    public RespuestaExamenCambiadas(Respuestas respuestas) {
        super("profesor.respuestaexamencambiadas");
        this.respuestas = respuestas;
    }

    public Respuestas getRespuestas() {
        return respuestas;
    }
}
