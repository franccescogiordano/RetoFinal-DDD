package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.values.CantidadAlumnos;
import co.com.sofka.domain.generic.Command;

public class ContabilizarAlumnosClase extends Command {
    private final CantidadAlumnos cant;

    public ContabilizarAlumnosClase(CantidadAlumnos cant) {
        this.cant = cant;
    }

    public CantidadAlumnos getCant() {
        return cant;
    }
}
