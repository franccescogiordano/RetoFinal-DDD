package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.Calificacion;

public class CalificarExamenes extends Command {
    private final Calificacion calificacion;

    public CalificarExamenes(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
