package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.values.Preguntas;
import co.com.sofka.domain.generic.Command;

public class CambiarPreguntasExamen extends Command {
    private final Preguntas preguntas;

    public CambiarPreguntasExamen(Preguntas preguntas) {
        this.preguntas = preguntas;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }
}
