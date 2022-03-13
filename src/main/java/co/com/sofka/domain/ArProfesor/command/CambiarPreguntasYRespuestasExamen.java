package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.values.Preguntas;
import co.com.sofka.domain.ArProfesor.values.Respuestas;
import co.com.sofka.domain.generic.Command;

public class CambiarPreguntasYRespuestasExamen extends Command {
    private final Preguntas preguntas;
    private final Respuestas respuestas;

    public CambiarPreguntasYRespuestasExamen(Preguntas preguntas, Respuestas respuestas) {
        this.preguntas = preguntas;
        this.respuestas = respuestas;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public Respuestas getRespuestas() {
        return respuestas;
    }
}
