package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.values.Respuestas;
import co.com.sofka.domain.generic.Command;

public class CambiarRespuestasExamen extends Command {
    private final Respuestas respuestas;

    public CambiarRespuestasExamen(Respuestas respuestas) {
        this.respuestas = respuestas;
    }

    public Respuestas getRespuestas() {
        return respuestas;
    }
}
